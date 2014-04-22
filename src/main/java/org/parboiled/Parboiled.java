/*
 * Copyright (C) 2009-2011 Mathias Doenitz
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.parboiled;

import com.strobel.assembler.InputTypeLoader;
import com.strobel.assembler.metadata.Buffer;
import com.strobel.assembler.metadata.ClassFileReader;
import com.strobel.assembler.metadata.ITypeLoader;
import com.strobel.assembler.metadata.MetadataSystem;
import com.strobel.assembler.metadata.TypeDefinition;
import com.strobel.decompiler.DecompilationOptions;
import com.strobel.decompiler.DecompilerSettings;
import com.strobel.decompiler.ITextOutput;
import com.strobel.decompiler.PlainTextOutput;
import org.parboiled.transform.ParserTransformer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import static org.parboiled.common.Preconditions.*;
import static org.parboiled.common.Utils.*;

/**
 * Main class providing the high-level entry point into the parboiled library.
 */
public class Parboiled {

    private static final int CLASSFILEREADER_OPTIONS
        = ClassFileReader.OPTIONS_DEFAULT | ClassFileReader.OPTION_PROCESS_CODE;

    protected Parboiled() {}

    /**
     * <p>Creates a parser object whose rule creation methods can then be used with one of the {@link org.parboiled.parserunners.ParseRunner} implementations.</p>
     * <p>Since parboiled needs to extend your parser with certain extra logic (e.g. to prevent infinite recursions
     * in recursive rule definitions) you cannot create your parser object yourself, but have to go through this method.
     * Also your parser class has to be derived from {@link BaseParser}. If you want to use a non-default constructor
     * you can provide its arguments to this method. Make sure your non-default constructor does not use primitive
     * type parameters (like "int") but rather their boxed counterparts (like "Integer"), otherwise the constructor
     * will not be found.</p>
     * <p>Performing the rule analysis and extending the parser class is an expensive process (time-wise) and can
     * take up to several hundred milliseconds for large grammars. However, this cost is only incurred once per
     * parser class and class loader. Subsequent calls to this method are therefore fast once the initial extension
     * has been performed.</p>
     *
     * @param parserClass     the type of the parser to create
     * @param constructorArgs optional arguments to the parser class constructor
     * @return the ready to use parser instance
     */
    @SuppressWarnings({"unchecked"})
    public static <P extends BaseParser<V>, V> P createParser(Class<P> parserClass, Object... constructorArgs) {
        checkArgNotNull(parserClass, "parserClass");
        try {
            Class<?> extendedClass = ParserTransformer.transformParser(parserClass);
            Constructor constructor = findConstructor(extendedClass, constructorArgs);
            return (P) constructor.newInstance(constructorArgs);
        } catch (Exception e) {
            throw new RuntimeException("Error creating extended parser class: " + e.getMessage(), e);
        }
    }

    /**
     * Generate the byte code of a transformed parser class
     *
     * <p>When you create a parser using {@link
     * #createParser(Class, Object...)}, Parboiled generates a new class which
     * is the one you actually use for parsing. This method allows to get the
     * byte code of such a generated class in a byte array.</p>
     *
     * @param parserClass the parser class
     * @param <P> class of the parser
     * @param <V> see {@link BaseParser}
     * @return the byte code
     * @throws RuntimeException byte code generation failure
     *
     * @see ParserTransformer#getByteCode(Class)
     */
    public static <P extends BaseParser<V>, V> byte[] getByteCode(
        final Class<P> parserClass)
    {
        try {
            return ParserTransformer.getByteCode(parserClass);
        } catch (Exception e) {
            throw new RuntimeException("failed to generate byte code", e);
        }
    }

    /**
     * Dump the source of a generated parser class using <a
     * href="https://bitbucket.org/mstrobel/procyon">procyon</a>
     *
     * <p>This will first generate the bytecode of the actual running parser,
     * then decompile it.</p>
     *
     * <p>You have to provide a <em>directory</em> as an argument. This method
     * will then generate file {@code com/foo/bar/MyParser$$parboiled.java}
     * under this directory for a parser class whose canonical name is {@code
     * com.foo.bar.MyParser}.</p>
     *
     * @param parserClass the class to dump
     * @param baseDir the base directory where to write the generated source
     * @param charset the character coding to use
     * @param <P> parser class
     * @param <V> see {@link BaseParser}
     * @throws RuntimeException {@code baseDir} is not a directory; cannot
     * create output file or directory; or problem encountered during source
     * generation.
     * @throws NullPointerException one argument is null
     *
     * @see ParserTransformer#getByteCode(Class)
     * @see Class#getCanonicalName()
     */
    public static <P extends BaseParser<V>, V> void dumpParserSource(
        final Class<P> parserClass, final Path baseDir, final Charset charset)
    {
        checkArgNotNull(parserClass, "parser class must not be null");
        checkArgNotNull(baseDir, "base directory must not be null");
        checkArgNotNull(charset, "charset must not be null");


        final String classname = parserClass.getCanonicalName()
            .replace(".", File.separator) + "$$parboiled.java";

        final Path dstfile = baseDir.resolve(classname);

        try {
            Files.createDirectories(dstfile.getParent());
        } catch (IOException e) {
            throw new RuntimeException("could not create directory", e);
        }

        try (
            final BufferedWriter writer = Files.newBufferedWriter(dstfile,
                StandardCharsets.UTF_8, StandardOpenOption.TRUNCATE_EXISTING,
                StandardOpenOption.CREATE);
        ) {
            dumpSource(parserClass, writer);
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException("could not dump source", e);
        }
    }

    /**
     * Dump the source of a generated parser class using the system's default
     * charset
     *
     * <p>This simply calls {@link #dumpParserSource(Class, Path, Charset)} with
     * {@link Charset#defaultCharset()} as a charset.</p>
     *
     * @param parserClass the class to dump
     * @param baseDir the base directory where to write the generated source
     * @param <P> parser class
     * @param <V> see {@link BaseParser}
     */
    public static <P extends BaseParser<V>, V> void dumpParserSource(
        final Class<P> parserClass, final Path baseDir)
    {
        dumpParserSource(parserClass, baseDir, Charset.defaultCharset());
    }

    private static void dumpSource(final Class<?> parserClass,
        final Writer writer)
        throws Exception
    {
        /*
         * See https://bitbucket.org/mstrobel/procyon/issue/186
         */
        final byte[] content = ParserTransformer.getByteCode(parserClass);
        final Buffer buf = new Buffer(content);

        final ITypeLoader loader = new InputTypeLoader();
        final MetadataSystem ms = new MetadataSystem(loader);
        ms.setEagerMethodLoadingEnabled(true);

        final TypeDefinition type
            = ClassFileReader.readClass(CLASSFILEREADER_OPTIONS, ms, buf);

        final DecompilationOptions options = new DecompilationOptions();
        options.setSettings(DecompilerSettings.javaDefaults());

        final ITextOutput out = new PlainTextOutput(writer);
        options.getSettings().getLanguage().decompileType(type, out, options);
    }
}

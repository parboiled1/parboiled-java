package repro.abc;

import org.parboiled.Action;
import org.parboiled.BaseParser;
import org.parboiled.Rule;
import org.parboiled.common.Preconditions;
import org.parboiled.common.Utils;
import org.parboiled.errors.GrammarException;
import org.parboiled.matchers.ActionMatcher;
import org.parboiled.matchers.AnyOfMatcher;
import org.parboiled.matchers.CharIgnoreCaseMatcher;
import org.parboiled.matchers.CharMatcher;
import org.parboiled.matchers.CharRangeMatcher;
import org.parboiled.matchers.FirstOfMatcher;
import org.parboiled.matchers.FirstOfStringsMatcher;
import org.parboiled.matchers.Matcher;
import org.parboiled.matchers.OneOrMoreMatcher;
import org.parboiled.matchers.OptionalMatcher;
import org.parboiled.matchers.ProxyMatcher;
import org.parboiled.matchers.SequenceMatcher;
import org.parboiled.matchers.StringMatcher;
import org.parboiled.matchers.TestMatcher;
import org.parboiled.matchers.TestNotMatcher;
import org.parboiled.matchers.ZeroOrMoreMatcher;
import org.parboiled.support.Characters;
import org.parboiled.support.Checks;
import org.parboiled.transform.CachingGenerator;

import java.util.Arrays;
import java.util.HashMap;

public class Parser$$parboiled extends Parser
{
    private HashMap<Characters, Rule> cache$AnyOf;
    private HashMap<Character, Rule> cache$Ch;
    private HashMap<CachingGenerator.Arguments, Rule> cache$CharRange;
    private HashMap<CachingGenerator.Arguments, Rule> cache$FirstOf;
    private HashMap<Character, Rule> cache$IgnoreCase;
    private HashMap<CachingGenerator.Arguments, Rule> cache$IgnoreCase2;
    private Rule cache$InputLine;
    private HashMap<CachingGenerator.Arguments, Rule> cache$NTimes;
    private HashMap<CachingGenerator.Arguments, Rule> cache$NTimes2;
    private HashMap<Object, Rule> cache$OneOrMore;
    private HashMap<Object, Rule> cache$Optional;
    private Rule cache$R01;
    private Rule cache$R02;
    private Rule cache$R03;
    private Rule cache$R04;
    private Rule cache$R05;
    private Rule cache$R06;
    private Rule cache$R07;
    private Rule cache$R08;
    private Rule cache$R09;
    private Rule cache$R10;
    private Rule cache$R11;
    private Rule cache$R12;
    private Rule cache$R13;
    private Rule cache$R14;
    private Rule cache$R15;
    private Rule cache$R16;
    private Rule cache$R17;
    private Rule cache$R18;
    private Rule cache$R19;
    private Rule cache$R20;
    private Rule cache$R21;
    private Rule cache$R22;
    private Rule cache$R23;
    private Rule cache$R24;
    private Rule cache$R25;
    private Rule cache$R26;
    private Rule cache$R27;
    private Rule cache$R28;
    private Rule cache$R29;
    private Rule cache$R30;
    private Rule cache$R31;
    private Rule cache$R32;
    private Rule cache$R33;
    private Rule cache$R34;
    private Rule cache$R35;
    private Rule cache$R36;
    private Rule cache$R37;
    private Rule cache$R38;
    private Rule cache$R39;
    private Rule cache$R40;
    private Rule cache$R41;
    private Rule cache$R42;
    private Rule cache$R43;
    private Rule cache$R44;
    private Rule cache$R45;
    private Rule cache$R46;
    private Rule cache$R47;
    private Rule cache$R48;
    private Rule cache$R49;
    private Rule cache$R50;
    private Rule cache$R51;
    private Rule cache$R52;
    private Rule cache$R53;
    private Rule cache$R54;
    private Rule cache$R55;
    private Rule cache$R56;
    private Rule cache$R57;
    private Rule cache$R60;
    private Rule cache$R61;
    private Rule cache$R62;
    private Rule cache$R63;
    private Rule cache$R64;
    private Rule cache$R65;
    private Rule cache$R66;
    private Rule cache$R67;
    private HashMap<CachingGenerator.Arguments, Rule> cache$Sequence;
    private HashMap<CachingGenerator.Arguments, Rule> cache$String;
    private HashMap<Object, Rule> cache$Test;
    private HashMap<Object, Rule> cache$TestNot;
    private HashMap<Object, Rule> cache$ZeroOrMore;
    
    public Rule AnyOf(final String s) {
        Preconditions.checkArgNotNull((Object)s, "characters");
        return this.AnyOf(s.toCharArray());
    }
    
    public Rule AnyOf(final Characters characters) {
        HashMap<Characters, Rule> cache$AnyOf;
        if ((cache$AnyOf = this.cache$AnyOf) == null) {
            cache$AnyOf = (this.cache$AnyOf = new HashMap<Characters,
                Rule>());
        }
        final Rule rule = cache$AnyOf.get(characters);
        if (rule != null) {
            return rule;
        }
        final ProxyMatcher proxyMatcher = new ProxyMatcher();
        this.cache$AnyOf.put(characters, proxyMatcher);
        Preconditions.checkArgNotNull((Object)characters, "characters");
        Object o2;
        Rule rule2;
        final Rule o = (!characters.isSubtractive() && characters.getChars()
            .length == 1) ? (rule2 = (Rule)(o2 = this
            .Ch(characters.getChars()[0]))) : (characters.equals(
            Characters.NONE) ? (rule2 = (Rule)(o2 = BaseParser.NOTHING)) : (rule2 = (Rule)(o2 = new AnyOfMatcher(characters))));
        proxyMatcher.arm((Matcher)rule2);
        this.cache$AnyOf.put(characters, o);
        return (Rule)o2;
    }
    
    public Rule AnyOf(final char[] array) {
        Preconditions.checkArgNotNull((Object)array, "characters");
        Preconditions.checkArgument(array.length > 0);
        return (array.length == 1) ? this.Ch(array[0]) : this
            .AnyOf(Characters.of(array));
    }
    
    public Rule Ch(final char c) {
        HashMap<Character, Rule> cache$Ch;
        if ((cache$Ch = this.cache$Ch) == null) {
            cache$Ch = (this.cache$Ch = new HashMap<Character, Rule>());
        }
        final Character value;
        final Rule rule = cache$Ch.get(value = c);
        if (rule != null) {
            return rule;
        }
        final ProxyMatcher proxyMatcher = new ProxyMatcher();
        this.cache$Ch.put(value, proxyMatcher);
        final CharMatcher charMatcher = new CharMatcher(c);
        proxyMatcher.arm(charMatcher);
        this.cache$Ch.put(value, charMatcher);
        return charMatcher;
    }
    
    public Rule CharRange(final char c, final char c2) {
        HashMap<CachingGenerator.Arguments, Rule> cache$CharRange;
        if ((cache$CharRange = this.cache$CharRange) == null) {
            cache$CharRange = (this.cache$CharRange = new
                HashMap<CachingGenerator.Arguments, Rule>());
        }
        final CachingGenerator.Arguments cachingGenerator$Arguments;
        final Rule rule = cache$CharRange.get(cachingGenerator$Arguments = new CachingGenerator.Arguments(new Object[] { c, c2 }));
        if (rule != null) {
            return rule;
        }
        final ProxyMatcher proxyMatcher = new ProxyMatcher();
        this.cache$CharRange.put(cachingGenerator$Arguments, proxyMatcher);
        final Rule o2;
        final Rule o = o2 = ((c == c2) ? this.Ch(c) : new
            CharRangeMatcher(c, c2));
        proxyMatcher.arm((Matcher)o);
        this.cache$CharRange.put(cachingGenerator$Arguments, o);
        return o2;
    }
    
    public Rule FirstOf(final Object o, final Object o2, final Object... array) {
        Preconditions.checkArgNotNull((Object)array, "moreRules");
        return this.FirstOf(Utils.arrayOf(o, o2, array));
    }
    
    public Rule FirstOf(final Object[] array) {
        HashMap<CachingGenerator.Arguments, Rule> cache$FirstOf;
        if ((cache$FirstOf = this.cache$FirstOf) == null) {
            cache$FirstOf = (this.cache$FirstOf = new
                HashMap<CachingGenerator.Arguments, Rule>());
        }
        final CachingGenerator.Arguments cachingGenerator$Arguments;
        final Rule rule = cache$FirstOf.get(cachingGenerator$Arguments = new CachingGenerator.Arguments(new Object[] { array }));
        if (rule != null) {
            return rule;
        }
        final ProxyMatcher proxyMatcher = new ProxyMatcher();
        this.cache$FirstOf.put(cachingGenerator$Arguments, proxyMatcher);
        Preconditions.checkArgNotNull((Object)array, "rules");
        Object rule2 = null;
        Object o = null;
        Matcher matcher = null;
        Label_0178: {
            if (array.length == 1) {
                matcher = (Matcher)(o = (rule2 = this.toRule(array[0])));
            }
            else {
                final Rule[] rules = this.toRules(array);
                final char[][] array2 = new char[array.length][];
                for (int i = 0; i < rules.length; ++i) {
                    final Rule rule3 = rules[i];
                    if (!(rule3 instanceof StringMatcher)) {
                        matcher = (Matcher)(o = (rule2 = new FirstOfMatcher(rules)));
                        break Label_0178;
                    }
                    array2[i] = ((StringMatcher)rule3).characters;
                }
                matcher = (Matcher)(o = (rule2 = new FirstOfStringsMatcher(rules, array2)));
            }
        }
        proxyMatcher.arm((Matcher)o);
        this.cache$FirstOf.put(cachingGenerator$Arguments, matcher);
        return (Rule)rule2;
    }
    
    public Rule IgnoreCase(final char c) {
        HashMap<Character, Rule> cache$IgnoreCase;
        if ((cache$IgnoreCase = this.cache$IgnoreCase) == null) {
            cache$IgnoreCase = (this.cache$IgnoreCase = new
                HashMap<Character, Rule>());
        }
        final Character value;
        final Rule rule = cache$IgnoreCase.get(value = c);
        if (rule != null) {
            return rule;
        }
        final ProxyMatcher proxyMatcher = new ProxyMatcher();
        this.cache$IgnoreCase.put(value, proxyMatcher);
        final Rule o2;
        final Rule o = o2 = ((Character.isLowerCase(c) == Character.isUpperCase
            (c)) ? this.Ch(c) : new CharIgnoreCaseMatcher(c));
        proxyMatcher.arm((Matcher)o);
        this.cache$IgnoreCase.put(value, o);
        return o2;
    }
    
    public Rule IgnoreCase(final String s) {
        Preconditions.checkArgNotNull((Object)s, "string");
        return this.IgnoreCase(s.toCharArray());
    }
    
    public Rule IgnoreCase(final char... array) {
        HashMap<CachingGenerator.Arguments, Rule> cache$IgnoreCase2;
        if ((cache$IgnoreCase2 = this.cache$IgnoreCase2) == null) {
            cache$IgnoreCase2 = (this.cache$IgnoreCase2 = new HashMap<CachingGenerator.Arguments, Rule>());
        }
        final CachingGenerator.Arguments cachingGenerator$Arguments;
        final Rule rule = cache$IgnoreCase2.get(cachingGenerator$Arguments = new CachingGenerator.Arguments(new Object[] { array }));
        if (rule != null) {
            return rule;
        }
        final ProxyMatcher proxyMatcher = new ProxyMatcher();
        this.cache$IgnoreCase2.put(cachingGenerator$Arguments, proxyMatcher);
        Object o2;
        Rule rule4;
        Rule rule3;
        Object o;
        Rule rule2;
        if (array.length == 1) {
            rule2 = (Rule)(o = (rule3 = (rule4 = (Rule)(o2 = this
                .IgnoreCase(array[0])))));
        }
        else {
            final Rule[] array2 = new Rule[array.length];
            for (int i = 0; i < array.length; ++i) {
                array2[i] = this.IgnoreCase(array[i]);
            }
            rule2 = (Rule)(o = (rule3 = (rule4 = (Rule)(o2 = ((SequenceMatcher) this
                .Sequence(array2)).label('\"' + String.valueOf(array) + '\"')))));
        }
        if (o != null) {
            rule4 = (rule3 = (Rule)(o2 = rule2.suppressSubnodes()));
        }
        proxyMatcher.arm((Matcher)rule3);
        this.cache$IgnoreCase2.put(cachingGenerator$Arguments, rule4);
        return (Rule)o2;
    }
    
    public Rule InputLine() {
        final Rule cache$InputLine = this.cache$InputLine;
        if (cache$InputLine != null) {
            return cache$InputLine;
        }
        final ProxyMatcher cache$InputLine2 = new ProxyMatcher();
        this.cache$InputLine = cache$InputLine2;
        Rule rule2;
        Rule cache$InputLine3;
        final Rule rule = cache$InputLine3 = (rule2 = super.InputLine());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$InputLine3 = (rule3 = (rule2 = rule.label("InputLine")));
        }
        cache$InputLine2.arm((Matcher)rule3);
        this.cache$InputLine = cache$InputLine3;
        return rule2;
    }
    
    public Rule NTimes(final int n, final Object o) {
        HashMap<CachingGenerator.Arguments, Rule> cache$NTimes;
        if ((cache$NTimes = this.cache$NTimes) == null) {
            cache$NTimes = (this.cache$NTimes = new HashMap<CachingGenerator.Arguments, Rule>());
        }
        final CachingGenerator.Arguments cachingGenerator$Arguments;
        final Rule rule = cache$NTimes.get(cachingGenerator$Arguments = new CachingGenerator.Arguments(new Object[] { n, o }));
        if (rule != null) {
            return rule;
        }
        final ProxyMatcher proxyMatcher = new ProxyMatcher();
        this.cache$NTimes.put(cachingGenerator$Arguments, proxyMatcher);
        final Rule nTimes = this.NTimes(n, o, null);
        proxyMatcher.arm((Matcher)nTimes);
        this.cache$NTimes.put(cachingGenerator$Arguments, nTimes);
        return nTimes;
    }
    
    public Rule NTimes(final int n, final Object o, final Object o2) {
        HashMap<CachingGenerator.Arguments, Rule> cache$NTimes2;
        if ((cache$NTimes2 = this.cache$NTimes2) == null) {
            cache$NTimes2 = (this.cache$NTimes2 = new HashMap<CachingGenerator.Arguments, Rule>());
        }
        final CachingGenerator.Arguments cachingGenerator$Arguments;
        final Rule rule = cache$NTimes2.get(cachingGenerator$Arguments = new CachingGenerator.Arguments(new Object[] { n, o, o2 }));
        if (rule != null) {
            return rule;
        }
        final ProxyMatcher proxyMatcher = new ProxyMatcher();
        this.cache$NTimes2.put(cachingGenerator$Arguments, proxyMatcher);
        Preconditions.checkArgNotNull(o, "rule");
        Preconditions.checkArgument(n >= 0, "repetitions must be non-negative");
        Rule rule4 = null;
        Rule rule3 = null;
        Rule rule2 = null;
        switch (n) {
            case 0: {
                rule2 = (rule3 = (rule4 = BaseParser.EMPTY));
                break;
            }
            case 1: {
                rule2 = (rule3 = (rule4 = this.toRule(o)));
                break;
            }
            default: {
                final Object[] array = new Object[(o2 == null) ? n : (n * 2 - 1)];
                if (o2 != null) {
                    for (int i = 0; i < array.length; ++i) {
                        array[i] = ((i % 2 == 0) ? o : o2);
                    }
                }
                else {
                    Arrays.fill(array, o);
                }
                rule2 = (rule3 = (rule4 = this.Sequence(array)));
                break;
            }
        }
        proxyMatcher.arm((Matcher)rule3);
        this.cache$NTimes2.put(cachingGenerator$Arguments, rule2);
        return rule4;
    }
    
    public Rule NoneOf(final String s) {
        Preconditions.checkArgNotNull((Object)s, "characters");
        return this.NoneOf(s.toCharArray());
    }
    
    public Rule NoneOf(char[] array) {
        Preconditions.checkArgNotNull((Object)array, "characters");
        Preconditions.checkArgument(array.length > 0);
        boolean b = false;
        final char[] array2 = array;
        for (int length = array2.length, i = 0; i < length; ++i) {
            if (array2[i] == '\uffff') {
                b = true;
                break;
            }
        }
        if (!b) {
            final char[] array3 = new char[array.length + 1];
            System.arraycopy(array, 0, array3, 0, array.length);
            array3[array.length] = '\uffff';
            array = array3;
        }
        return this.AnyOf(Characters.allBut(array));
    }
    
    public Rule OneOrMore(final Object o) {
        HashMap<Object, Rule> cache$OneOrMore;
        if ((cache$OneOrMore = this.cache$OneOrMore) == null) {
            cache$OneOrMore = (this.cache$OneOrMore = new HashMap<Object,
                Rule>());
        }
        final Rule rule = cache$OneOrMore.get(o);
        if (rule != null) {
            return rule;
        }
        final ProxyMatcher proxyMatcher = new ProxyMatcher();
        this.cache$OneOrMore.put(o, proxyMatcher);
        final OneOrMoreMatcher oneOrMoreMatcher = new OneOrMoreMatcher(
            this.toRule(o));
        proxyMatcher.arm(oneOrMoreMatcher);
        this.cache$OneOrMore.put(o, oneOrMoreMatcher);
        return oneOrMoreMatcher;
    }
    
    public Rule OneOrMore(final Object o, final Object o2, final Object... array) {
        Preconditions.checkArgNotNull((Object)array, "moreRules");
        return this.OneOrMore(this.Sequence(o, o2, array));
    }
    
    public Rule Optional(final Object o) {
        HashMap<Object, Rule> cache$Optional;
        if ((cache$Optional = this.cache$Optional) == null) {
            cache$Optional = (this.cache$Optional = new HashMap<Object,
                Rule>());
        }
        final Rule rule = cache$Optional.get(o);
        if (rule != null) {
            return rule;
        }
        final ProxyMatcher proxyMatcher = new ProxyMatcher();
        this.cache$Optional.put(o, proxyMatcher);
        final OptionalMatcher optionalMatcher = new OptionalMatcher(
            this.toRule(o));
        proxyMatcher.arm(optionalMatcher);
        this.cache$Optional.put(o, optionalMatcher);
        return optionalMatcher;
    }
    
    public Rule Optional(final Object o, final Object o2, final Object... array) {
        Preconditions.checkArgNotNull((Object)array, "moreRules");
        return this.Optional(this.Sequence(o, o2, array));
    }
    
    public Rule R01() {
        final Rule cache$R01 = this.cache$R01;
        if (cache$R01 != null) {
            return cache$R01;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R01 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R01());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R01")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R01 = cache$R3;
        return rule2;
    }
    
    public Rule R02() {
        final Rule cache$R02 = this.cache$R02;
        if (cache$R02 != null) {
            return cache$R02;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R02 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R02());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R02")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R02 = cache$R3;
        return rule2;
    }
    
    public Rule R03() {
        final Rule cache$R03 = this.cache$R03;
        if (cache$R03 != null) {
            return cache$R03;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R03 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R03());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R03")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R03 = cache$R3;
        return rule2;
    }
    
    public Rule R04() {
        final Rule cache$R04 = this.cache$R04;
        if (cache$R04 != null) {
            return cache$R04;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R04 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R04());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R04")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R04 = cache$R3;
        return rule2;
    }
    
    public Rule R05() {
        final Rule cache$R05 = this.cache$R05;
        if (cache$R05 != null) {
            return cache$R05;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R05 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R05());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R05")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R05 = cache$R3;
        return rule2;
    }
    
    public Rule R06() {
        final Rule cache$R06 = this.cache$R06;
        if (cache$R06 != null) {
            return cache$R06;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R06 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R06());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R06")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R06 = cache$R3;
        return rule2;
    }
    
    public Rule R07() {
        final Rule cache$R07 = this.cache$R07;
        if (cache$R07 != null) {
            return cache$R07;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R07 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R07());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R07")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R07 = cache$R3;
        return rule2;
    }
    
    public Rule R08() {
        final Rule cache$R08 = this.cache$R08;
        if (cache$R08 != null) {
            return cache$R08;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R08 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R08());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R08")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R08 = cache$R3;
        return rule2;
    }
    
    public Rule R09() {
        final Rule cache$R09 = this.cache$R09;
        if (cache$R09 != null) {
            return cache$R09;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R09 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R09());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R09")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R09 = cache$R3;
        return rule2;
    }
    
    public Rule R10() {
        final Rule cache$R10 = this.cache$R10;
        if (cache$R10 != null) {
            return cache$R10;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R10 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R10());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R10")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R10 = cache$R3;
        return rule2;
    }
    
    public Rule R11() {
        final Rule cache$R11 = this.cache$R11;
        if (cache$R11 != null) {
            return cache$R11;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R11 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R11());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R11")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R11 = cache$R3;
        return rule2;
    }
    
    public Rule R12() {
        final Rule cache$R12 = this.cache$R12;
        if (cache$R12 != null) {
            return cache$R12;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R12 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R12());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R12")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R12 = cache$R3;
        return rule2;
    }
    
    public Rule R13() {
        final Rule cache$R13 = this.cache$R13;
        if (cache$R13 != null) {
            return cache$R13;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R13 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R13());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R13")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R13 = cache$R3;
        return rule2;
    }
    
    public Rule R14() {
        final Rule cache$R14 = this.cache$R14;
        if (cache$R14 != null) {
            return cache$R14;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R14 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R14());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R14")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R14 = cache$R3;
        return rule2;
    }
    
    public Rule R15() {
        final Rule cache$R15 = this.cache$R15;
        if (cache$R15 != null) {
            return cache$R15;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R15 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R15());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R15")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R15 = cache$R3;
        return rule2;
    }
    
    public Rule R16() {
        final Rule cache$R16 = this.cache$R16;
        if (cache$R16 != null) {
            return cache$R16;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R16 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R16());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R16")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R16 = cache$R3;
        return rule2;
    }
    
    public Rule R17() {
        final Rule cache$R17 = this.cache$R17;
        if (cache$R17 != null) {
            return cache$R17;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R17 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R17());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R17")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R17 = cache$R3;
        return rule2;
    }
    
    public Rule R18() {
        final Rule cache$R18 = this.cache$R18;
        if (cache$R18 != null) {
            return cache$R18;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R18 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R18());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R18")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R18 = cache$R3;
        return rule2;
    }
    
    public Rule R19() {
        final Rule cache$R19 = this.cache$R19;
        if (cache$R19 != null) {
            return cache$R19;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R19 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R19());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R19")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R19 = cache$R3;
        return rule2;
    }
    
    public Rule R20() {
        final Rule cache$R20 = this.cache$R20;
        if (cache$R20 != null) {
            return cache$R20;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R20 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R20());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R20")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R20 = cache$R3;
        return rule2;
    }
    
    public Rule R21() {
        final Rule cache$R21 = this.cache$R21;
        if (cache$R21 != null) {
            return cache$R21;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R21 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R21());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R21")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R21 = cache$R3;
        return rule2;
    }
    
    public Rule R22() {
        final Rule cache$R22 = this.cache$R22;
        if (cache$R22 != null) {
            return cache$R22;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R22 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R22());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R22")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R22 = cache$R3;
        return rule2;
    }
    
    public Rule R23() {
        final Rule cache$R23 = this.cache$R23;
        if (cache$R23 != null) {
            return cache$R23;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R23 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R23());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R23")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R23 = cache$R3;
        return rule2;
    }
    
    public Rule R24() {
        final Rule cache$R24 = this.cache$R24;
        if (cache$R24 != null) {
            return cache$R24;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R24 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R24());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R24")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R24 = cache$R3;
        return rule2;
    }
    
    public Rule R25() {
        final Rule cache$R25 = this.cache$R25;
        if (cache$R25 != null) {
            return cache$R25;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R25 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R25());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R25")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R25 = cache$R3;
        return rule2;
    }
    
    public Rule R26() {
        final Rule cache$R26 = this.cache$R26;
        if (cache$R26 != null) {
            return cache$R26;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R26 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R26());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R26")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R26 = cache$R3;
        return rule2;
    }
    
    public Rule R27() {
        final Rule cache$R27 = this.cache$R27;
        if (cache$R27 != null) {
            return cache$R27;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R27 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R27());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R27")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R27 = cache$R3;
        return rule2;
    }
    
    public Rule R28() {
        final Rule cache$R28 = this.cache$R28;
        if (cache$R28 != null) {
            return cache$R28;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R28 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R28());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R28")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R28 = cache$R3;
        return rule2;
    }
    
    public Rule R29() {
        final Rule cache$R29 = this.cache$R29;
        if (cache$R29 != null) {
            return cache$R29;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R29 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R29());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R29")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R29 = cache$R3;
        return rule2;
    }
    
    public Rule R30() {
        final Rule cache$R30 = this.cache$R30;
        if (cache$R30 != null) {
            return cache$R30;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R30 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R30());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R30")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R30 = cache$R3;
        return rule2;
    }
    
    public Rule R31() {
        final Rule cache$R31 = this.cache$R31;
        if (cache$R31 != null) {
            return cache$R31;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R31 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R31());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R31")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R31 = cache$R3;
        return rule2;
    }
    
    public Rule R32() {
        final Rule cache$R32 = this.cache$R32;
        if (cache$R32 != null) {
            return cache$R32;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R32 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R32());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R32")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R32 = cache$R3;
        return rule2;
    }
    
    public Rule R33() {
        final Rule cache$R33 = this.cache$R33;
        if (cache$R33 != null) {
            return cache$R33;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R33 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R33());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R33")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R33 = cache$R3;
        return rule2;
    }
    
    public Rule R34() {
        final Rule cache$R34 = this.cache$R34;
        if (cache$R34 != null) {
            return cache$R34;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R34 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R34());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R34")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R34 = cache$R3;
        return rule2;
    }
    
    public Rule R35() {
        final Rule cache$R35 = this.cache$R35;
        if (cache$R35 != null) {
            return cache$R35;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R35 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R35());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R35")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R35 = cache$R3;
        return rule2;
    }
    
    public Rule R36() {
        final Rule cache$R36 = this.cache$R36;
        if (cache$R36 != null) {
            return cache$R36;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R36 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R36());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R36")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R36 = cache$R3;
        return rule2;
    }
    
    public Rule R37() {
        final Rule cache$R37 = this.cache$R37;
        if (cache$R37 != null) {
            return cache$R37;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R37 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R37());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R37")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R37 = cache$R3;
        return rule2;
    }
    
    public Rule R38() {
        final Rule cache$R38 = this.cache$R38;
        if (cache$R38 != null) {
            return cache$R38;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R38 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R38());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R38")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R38 = cache$R3;
        return rule2;
    }
    
    public Rule R39() {
        final Rule cache$R39 = this.cache$R39;
        if (cache$R39 != null) {
            return cache$R39;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R39 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R39());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R39")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R39 = cache$R3;
        return rule2;
    }
    
    public Rule R40() {
        final Rule cache$R40 = this.cache$R40;
        if (cache$R40 != null) {
            return cache$R40;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R40 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R40());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R40")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R40 = cache$R3;
        return rule2;
    }
    
    public Rule R41() {
        final Rule cache$R41 = this.cache$R41;
        if (cache$R41 != null) {
            return cache$R41;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R41 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R41());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R41")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R41 = cache$R3;
        return rule2;
    }
    
    public Rule R42() {
        final Rule cache$R42 = this.cache$R42;
        if (cache$R42 != null) {
            return cache$R42;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R42 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R42());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R42")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R42 = cache$R3;
        return rule2;
    }
    
    public Rule R43() {
        final Rule cache$R43 = this.cache$R43;
        if (cache$R43 != null) {
            return cache$R43;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R43 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R43());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R43")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R43 = cache$R3;
        return rule2;
    }
    
    public Rule R44() {
        final Rule cache$R44 = this.cache$R44;
        if (cache$R44 != null) {
            return cache$R44;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R44 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R44());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R44")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R44 = cache$R3;
        return rule2;
    }
    
    public Rule R45() {
        final Rule cache$R45 = this.cache$R45;
        if (cache$R45 != null) {
            return cache$R45;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R45 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R45());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R45")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R45 = cache$R3;
        return rule2;
    }
    
    public Rule R46() {
        final Rule cache$R46 = this.cache$R46;
        if (cache$R46 != null) {
            return cache$R46;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R46 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R46());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R46")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R46 = cache$R3;
        return rule2;
    }
    
    public Rule R47() {
        final Rule cache$R47 = this.cache$R47;
        if (cache$R47 != null) {
            return cache$R47;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R47 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R47());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R47")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R47 = cache$R3;
        return rule2;
    }
    
    public Rule R48() {
        final Rule cache$R48 = this.cache$R48;
        if (cache$R48 != null) {
            return cache$R48;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R48 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R48());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R48")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R48 = cache$R3;
        return rule2;
    }
    
    public Rule R49() {
        final Rule cache$R49 = this.cache$R49;
        if (cache$R49 != null) {
            return cache$R49;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R49 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R49());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R49")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R49 = cache$R3;
        return rule2;
    }
    
    public Rule R50() {
        final Rule cache$R50 = this.cache$R50;
        if (cache$R50 != null) {
            return cache$R50;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R50 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R50());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R50")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R50 = cache$R3;
        return rule2;
    }
    
    public Rule R51() {
        final Rule cache$R51 = this.cache$R51;
        if (cache$R51 != null) {
            return cache$R51;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R51 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R51());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R51")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R51 = cache$R3;
        return rule2;
    }
    
    public Rule R52() {
        final Rule cache$R52 = this.cache$R52;
        if (cache$R52 != null) {
            return cache$R52;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R52 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R52());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R52")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R52 = cache$R3;
        return rule2;
    }
    
    public Rule R53() {
        final Rule cache$R53 = this.cache$R53;
        if (cache$R53 != null) {
            return cache$R53;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R53 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R53());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R53")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R53 = cache$R3;
        return rule2;
    }
    
    public Rule R54() {
        final Rule cache$R54 = this.cache$R54;
        if (cache$R54 != null) {
            return cache$R54;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R54 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R54());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R54")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R54 = cache$R3;
        return rule2;
    }
    
    public Rule R55() {
        final Rule cache$R55 = this.cache$R55;
        if (cache$R55 != null) {
            return cache$R55;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R55 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R55());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R55")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R55 = cache$R3;
        return rule2;
    }
    
    public Rule R56() {
        final Rule cache$R56 = this.cache$R56;
        if (cache$R56 != null) {
            return cache$R56;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R56 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R56());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R56")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R56 = cache$R3;
        return rule2;
    }
    
    public Rule R57() {
        final Rule cache$R57 = this.cache$R57;
        if (cache$R57 != null) {
            return cache$R57;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R57 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R57());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R57")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R57 = cache$R3;
        return rule2;
    }
    
    public Rule R58(final String s) {
        Rule rule2;
        final Rule rule = rule2 = super.R58(s);
        if (rule != null) {
            rule2 = rule.label("R58");
        }
        return rule2;
    }
    
    public Rule R59(final char c) {
        Rule rule2;
        final Rule rule = rule2 = super.R59(c);
        if (rule != null) {
            rule2 = rule.label("R59");
        }
        return rule2;
    }
    
    public Rule R60() {
        final Rule cache$R60 = this.cache$R60;
        if (cache$R60 != null) {
            return cache$R60;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R60 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R60());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R60")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R60 = cache$R3;
        return rule2;
    }
    
    public Rule R61() {
        final Rule cache$R61 = this.cache$R61;
        if (cache$R61 != null) {
            return cache$R61;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R61 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R61());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R61")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R61 = cache$R3;
        return rule2;
    }
    
    public Rule R62() {
        final Rule cache$R62 = this.cache$R62;
        if (cache$R62 != null) {
            return cache$R62;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R62 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R62());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R62")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R62 = cache$R3;
        return rule2;
    }
    
    public Rule R63() {
        final Rule cache$R63 = this.cache$R63;
        if (cache$R63 != null) {
            return cache$R63;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R63 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R63());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R63")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R63 = cache$R3;
        return rule2;
    }
    
    public Rule R64() {
        final Rule cache$R64 = this.cache$R64;
        if (cache$R64 != null) {
            return cache$R64;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R64 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R64());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R64")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R64 = cache$R3;
        return rule2;
    }
    
    public Rule R65() {
        final Rule cache$R65 = this.cache$R65;
        if (cache$R65 != null) {
            return cache$R65;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R65 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R65());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R65")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R65 = cache$R3;
        return rule2;
    }
    
    public Rule R66() {
        final Rule cache$R66 = this.cache$R66;
        if (cache$R66 != null) {
            return cache$R66;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R66 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R66());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R66")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R66 = cache$R3;
        return rule2;
    }
    
    public Rule R67() {
        final Rule cache$R67 = this.cache$R67;
        if (cache$R67 != null) {
            return cache$R67;
        }
        final ProxyMatcher cache$R2 = new ProxyMatcher();
        this.cache$R67 = cache$R2;
        Rule rule2;
        Rule cache$R3;
        final Rule rule = cache$R3 = (rule2 = super.R67());
        Rule rule3;
        if ((rule3 = rule) != null) {
            cache$R3 = (rule3 = (rule2 = rule.label("R67")));
        }
        cache$R2.arm((Matcher)rule3);
        this.cache$R67 = cache$R3;
        return rule2;
    }
    
    public Rule Sequence(final Object o, final Object o2, final Object... array) {
        Preconditions.checkArgNotNull((Object)array, "moreRules");
        return this.Sequence(Utils.arrayOf(o, o2, array));
    }
    
    public Rule Sequence(final Object[] array) {
        HashMap<CachingGenerator.Arguments, Rule> cache$Sequence;
        if ((cache$Sequence = this.cache$Sequence) == null) {
            cache$Sequence = (this.cache$Sequence = new HashMap<CachingGenerator.Arguments, Rule>());
        }
        final CachingGenerator.Arguments cachingGenerator$Arguments;
        final Rule rule = cache$Sequence.get(cachingGenerator$Arguments = new CachingGenerator.Arguments(new Object[] { array }));
        if (rule != null) {
            return rule;
        }
        final ProxyMatcher proxyMatcher = new ProxyMatcher();
        this.cache$Sequence.put(cachingGenerator$Arguments, proxyMatcher);
        Preconditions.checkArgNotNull((Object)array, "rules");
        final Rule o2;
        final Rule o = o2 = ((array.length == 1) ? this.toRule(array[0]) : new
            SequenceMatcher(
            this.toRules(array)));
        proxyMatcher.arm((Matcher)o);
        this.cache$Sequence.put(cachingGenerator$Arguments, o);
        return o2;
    }
    
    public Rule String(final String s) {
        Preconditions.checkArgNotNull((Object)s, "string");
        return this.String(s.toCharArray());
    }
    
    public Rule String(final char... array) {
        HashMap<CachingGenerator.Arguments, Rule> cache$String;
        if ((cache$String = this.cache$String) == null) {
            cache$String = (this.cache$String = new HashMap<CachingGenerator.Arguments, Rule>());
        }
        final CachingGenerator.Arguments cachingGenerator$Arguments;
        final Rule rule = cache$String.get(cachingGenerator$Arguments = new CachingGenerator.Arguments(new Object[] { array }));
        if (rule != null) {
            return rule;
        }
        final ProxyMatcher proxyMatcher = new ProxyMatcher();
        this.cache$String.put(cachingGenerator$Arguments, proxyMatcher);
        Object o2;
        Rule rule4;
        Rule rule3;
        Object o;
        Rule rule2;
        if (array.length == 1) {
            rule2 = (Rule)(o = (rule3 = (rule4 = (Rule)(o2 = this.Ch(array[0])))));
        }
        else {
            final Rule[] array2 = new Rule[array.length];
            for (int i = 0; i < array.length; ++i) {
                array2[i] = this.Ch(array[i]);
            }
            rule2 = (Rule)(o = (rule3 = (rule4 = (Rule)(o2 = new StringMatcher(array2, array)))));
        }
        if (o != null) {
            rule4 = (rule3 = (Rule)(o2 = rule2.suppressSubnodes()));
        }
        proxyMatcher.arm((Matcher)rule3);
        this.cache$String.put(cachingGenerator$Arguments, rule4);
        return (Rule)o2;
    }
    
    public Rule Test(final Object o) {
        HashMap<Object, Rule> cache$Test;
        if ((cache$Test = this.cache$Test) == null) {
            cache$Test = (this.cache$Test = new HashMap<Object, Rule>());
        }
        final Rule rule = cache$Test.get(o);
        if (rule != null) {
            return rule;
        }
        final ProxyMatcher proxyMatcher = new ProxyMatcher();
        this.cache$Test.put(o, proxyMatcher);
        Rule suppressNode;
        Rule o3;
        final Rule o2 = o3 = (suppressNode = new TestMatcher(this.toRule(o)));
        Rule o4;
        if ((o4 = o2) != null) {
            o3 = (o4 = (suppressNode = o2.suppressNode()));
        }
        proxyMatcher.arm((Matcher)o4);
        this.cache$Test.put(o, o3);
        return suppressNode;
    }
    
    public Rule Test(final Object o, final Object o2, final Object... array) {
        Preconditions.checkArgNotNull((Object)array, "moreRules");
        return this.Test(this.Sequence(o, o2, array));
    }
    
    public Rule TestNot(final Object o) {
        HashMap<Object, Rule> cache$TestNot;
        if ((cache$TestNot = this.cache$TestNot) == null) {
            cache$TestNot = (this.cache$TestNot = new HashMap<Object, Rule>());
        }
        final Rule rule = cache$TestNot.get(o);
        if (rule != null) {
            return rule;
        }
        final ProxyMatcher proxyMatcher = new ProxyMatcher();
        this.cache$TestNot.put(o, proxyMatcher);
        Rule suppressNode;
        Rule o3;
        final Rule o2 = o3 = (suppressNode = new TestNotMatcher(this.toRule
            (o)));
        Rule o4;
        if ((o4 = o2) != null) {
            o3 = (o4 = (suppressNode = o2.suppressNode()));
        }
        proxyMatcher.arm((Matcher)o4);
        this.cache$TestNot.put(o, o3);
        return suppressNode;
    }
    
    public Rule TestNot(final Object o, final Object o2, final Object... array) {
        Preconditions.checkArgNotNull((Object)array, "moreRules");
        return this.TestNot(this.Sequence(o, o2, array));
    }
    
    public Rule ZeroOrMore(final Object o) {
        HashMap<Object, Rule> cache$ZeroOrMore;
        if ((cache$ZeroOrMore = this.cache$ZeroOrMore) == null) {
            cache$ZeroOrMore = (this.cache$ZeroOrMore = new HashMap<Object, Rule>());
        }
        final Rule rule = cache$ZeroOrMore.get(o);
        if (rule != null) {
            return rule;
        }
        final ProxyMatcher proxyMatcher = new ProxyMatcher();
        this.cache$ZeroOrMore.put(o, proxyMatcher);
        final ZeroOrMoreMatcher zeroOrMoreMatcher = new ZeroOrMoreMatcher(
            this.toRule(o));
        proxyMatcher.arm(zeroOrMoreMatcher);
        this.cache$ZeroOrMore.put(o, zeroOrMoreMatcher);
        return zeroOrMoreMatcher;
    }
    
    public Rule ZeroOrMore(final Object o, final Object o2, final Object... array) {
        Preconditions.checkArgNotNull((Object)array, "moreRules");
        return this.ZeroOrMore(this.Sequence(o, o2, array));
    }
    
    protected Rule fromCharArray(final char[] array) {
        Preconditions.checkArgNotNull((Object)array, "array");
        return this.String(array);
    }
    
    protected Rule fromCharLiteral(final char c) {
        return this.Ch(c);
    }
    
    protected Rule fromStringLiteral(final String s) {
        Preconditions.checkArgNotNull((Object)s, "string");
        return this.fromCharArray(s.toCharArray());
    }
    
    public Rule toRule(final Object o) {
        if (o instanceof Rule) {
            return (Rule)o;
        }
        if (o instanceof Character) {
            return this.fromCharLiteral((Character) o);
        }
        if (o instanceof String) {
            return this.fromStringLiteral((String) o);
        }
        if (o instanceof char[]) {
            return this.fromCharArray((char[]) o);
        }
        if (o instanceof Action) {
            return new ActionMatcher((Action)o);
        }
        Checks.ensure(!(o instanceof Boolean), "Rule specification contains an unwrapped Boolean value, if you were trying to specify a parser action wrap the expression with ACTION(...)");
        throw new GrammarException("'" + o + "' cannot be automatically converted to a parser Rule");
    }
    
    public BaseParser newInstance() {
        return new Parser$$parboiled();
    }
}

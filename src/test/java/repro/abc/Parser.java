package repro.abc;

import org.parboiled.BaseParser;
import org.parboiled.Rule;
import org.parboiled.annotations.BuildParseTree;

@BuildParseTree
public class Parser extends BaseParser<Object> {

    public Rule InputLine() {
        return Sequence(
            R01(),
            EOI);
    }

    public Rule R01() {
        return Sequence(
            R60(),
            R02(),
            EOI);
    }

    public Rule R02() {
        return Sequence(
            R56(),
            Optional(
                R03()
            ),
            Optional(
                R04()
            ),
            R05(),
            R21()
        );
    }

    public Rule R03() {
        return R51();
    }

    public Rule R04() {
        return R55();
    }

    public Rule R05() {
        return Sequence(
            R06(),
            ZeroOrMore(
                Sequence(
                    R44(),
                    R06()
                )
            )
        );
    }

    public Rule R06() {
        return FirstOf(
            R17(),
            R07(),
            R16(),
            R15()
        );
    }

    public Rule R07() {
        return R08();
    }

    public Rule R08() {
        return R09();
    }

    public Rule R09() {
        return R10();
    }

    public Rule R10() {
        return R11();
    }

    public Rule R11() {
        return R12();
    }

    public Rule R12() {
        return R13();
    }

    public Rule R13() {
        return R14();
    }

    public Rule R14() {
        return FirstOf(
            Sequence(
                R18(),
                R45(),
                R36(),
                R60()
            ),
            Sequence(
                R36(),
                R60()
            )
        );
    }

    public Rule R15() {
        return Sequence(
            R19(),
            R60(),
            Sequence(
                FirstOf(
                    R17(),
                    R07(),
                    R16()
                ),
                ZeroOrMore(
                    R44(),
                    FirstOf(
                        R17(),
                        R07(),
                        R16()
                    )
                )
            ),
            R20(),
            R60()
        );
    }

    public Rule R16() {
        return R43();
    }

    public Rule R17() {
        return Sequence(
            R18(),
            R45(),
            R43()
        );
    }

    public Rule R18() {
        return FirstOf(
            R24(),
            R41()
        );
    }

    public Rule R19() {
        return R49();

    }

    public Rule R20() {
        return R50();
    }

    public Rule R21() {
        return R22();
    }

    public Rule R22() {
        return Sequence(
            R53(),
            R23()
        );
    }

    public Rule R23() {
        return FirstOf(
            Sequence(
                R24(),
                Optional(
                    R26()
                )),
            Sequence(
                R27(),
                R26()
            )
        );
    }

    public Rule R24() {
        return R25();
    }

    public Rule R25() {
        return Sequence(
            R39(),
            R45(),
            R40(),
            R60()
        );
    }

    public Rule R26() {
        return Sequence(
            Optional(
                R52(),
                R60()
            ),
            R41()
        );
    }

    public Rule R27() {
        return R28();
    }

    public Rule R28() {
        return R29();
    }

    public Rule R29() {
        return Sequence(
            R47(),
            R30(),
            R48()
        );
    }

    public Rule R30() {
        return R31();
    }

    public Rule R31() {
        return Sequence(
            R30(),
            R57(),
            R32()
        );
    }

    /* Alternative 1 */
    public Rule R32() {
        return R33();
    }

    /* Alternative 2 */
    /*
    public Rule R32() {
        return R02();
    }
    */

    public Rule R33() {
        return R34();
    }

    public Rule R34() {
        return R35();
    }

    public Rule R35() {
        return R02();
    }

    public Rule R36() {
        return FirstOf(
            Sequence(
                R37(),
                OneOrMore(
                    Sequence(
                        R45(), R37()
                    )
                )
            ),
            R37()
        );
    }

    public Rule R37() {
        return FirstOf(
            Sequence(
                R46(),
                OneOrMore(R65()),
                OneOrMore(R38()),
                R46()),
            Sequence(
                R46(),
                OneOrMore(R65()),
                R46()),
            Sequence(
                OneOrMore(R65()),
                OneOrMore(R38())
            ),
            OneOrMore(R65())
        );
    }

    public Rule R38() {
        return Sequence(
            Ch('['),
            R42(),
            Ch(']')
        );
    }

    public Rule R39() {
        return R40();
    }

    public Rule R40() {
        return FirstOf(
            Sequence(
                R46(),
                OneOrMore(R66()),
                R46()
            ),
            OneOrMore(R65()));
    }

    public Rule R41() {
        return R65();
    }

    public Rule R42() {
        return OneOrMore(R64());
    }

    public Rule R43() {
        return R59('*');
    }

    public Rule R44() {
        return R59(',');
    }

    public Rule R45() {
        return Ch('.');
    }

    public Rule R46() {
        return Ch('\'');
    }

    public Rule R47() {
        return Ch('(');
    }

    public Rule R48() {
        return Ch(')');
    }

    public Rule R49() {
        return Ch('{');
    }

    public Rule R50() {
        return Ch('}');
    }

    public Rule R51() {
        return R58("A1");
    }

    public Rule R52() {
        return R58("A2");
    }

    public Rule R53() {
        return R58("F");
    }

    public Rule R54() {
        return R58("I");
    }

    public Rule R55() {
        return R58("P");
    }

    public Rule R56() {
        return R58("S");
    }

    public Rule R57() {
        return R58("U");
    }

    public Rule R58(String string) {
        return Sequence(
            IgnoreCase(string),
            R60());
    }

    public Rule R59(char c) {
        return Sequence(
            Ch(c),
            R60());
    }

    public Rule R60() {
        return ZeroOrMore(
            FirstOf(
                R62(),
                R61()));
    }

    public Rule R61() {
        return FirstOf(
            Ch(' '),
            Ch('\t'),
            Ch('\f'),
            R63());
    }

    public Rule R62() {
        return Sequence(
            "/*",
            ZeroOrMore(FirstOf(R61(), R67())),
            "*/");
    }

    public Rule R63() {
        return AnyOf("\n\r");
    }

    public Rule R64() {
        return CharRange('0', '9');
    }

    public Rule R65() {
        return R67();
    }

    public Rule R66() {
        return FirstOf(
            R67(),
            R45());
    }

    public Rule R67() {
        return FirstOf(
            CharRange('a', 'z'),
            CharRange('A', 'Z'),
            CharRange('0', '9'),
            Ch('_'),
            Ch('$')
        );
    }
}


package repro.abc;

import org.parboiled.BaseParser;
import org.parboiled.Rule;
import org.parboiled.annotations.BuildParseTree;

@BuildParseTree
public class Parser extends BaseParser<Object> {

    public Rule InputLine() {
        return Sequence(R23(), EOI);
    }

    public Rule R23() {
        return Sequence(R29(), R26());
    }

    public Rule R26() {
        return Sequence(
            Optional(
                R52(),
                R60()
            ),
            R67()
        );
    }

    public Rule R29() {
        return Sequence(
            R47(),
            R31(),
            R48()
        );
    }

    @SuppressWarnings("InfiniteRecursion")
    public Rule R31() {
        return Sequence(
            R31(),
            R33()
        );
    }

    /* Alternative 1 */
//    public Rule R32() {
//        return R33();
//    }

    /* Alternative 2 */
//    public Rule R32() {
//        return R02();
//    }

    public Rule R33() {
        return R34();
    }

    public Rule R34() {
        return R35();
    }

    public Rule R35() {
        return R23();
    }

    public Rule R47() {
        return Ch('(');
    }

    public Rule R48() {
        return Ch(')');
    }

    public Rule R52() {
        return R58("A2");
    }

    public Rule R58(String string) {
        return Sequence(IgnoreCase(string), R60());
    }

    public Rule R60() {
        return ZeroOrMore(FirstOf(R62(), R61())
        );
    }

    public Rule R61() {
        return FirstOf(Ch(' '), Ch('\t'), Ch('\f'), R63());
    }

    public Rule R62() {
        return Sequence("/*", ZeroOrMore(FirstOf(R61(), R67())), "*/");
    }

    public Rule R63() {
        return AnyOf("\n\r");
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


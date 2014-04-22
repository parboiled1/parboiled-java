package repro.abc;

import org.parboiled.BaseParser;
import org.parboiled.Rule;
import org.parboiled.annotations.BuildParseTree;

@BuildParseTree
public class Parser extends BaseParser<Object> {

    public Rule InputLine() {
        return Sequence(R31(), EOI);
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
        return R31();
    }
}


package repro.abc;

import org.parboiled.BaseParser;
import org.parboiled.Rule;
import org.parboiled.annotations.BuildParseTree;

@BuildParseTree
public class Parser extends BaseParser<Object> {
    public Rule R31() {
        return R34();
    }

    public Rule R34() {
        return R35();
    }

    public Rule R35() {
        return R31();
    }
}


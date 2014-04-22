package repro.abc;

import org.parboiled.Parboiled;
import org.parboiled.parserunners.BasicParseRunner;

public class ParserTest {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        repro.abc.Parser parser = Parboiled.createParser(Parser.class);

        new BasicParseRunner(parser.InputLine());
    }
}

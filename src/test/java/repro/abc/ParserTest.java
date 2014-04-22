package repro.abc;

import org.parboiled.Parboiled;
import org.parboiled.parserunners.BasicParseRunner;

public class ParserTest {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //repro.abc.Parser parser = Parboiled.createParser(repro.abc.Parser.class);
        repro.abc.Parser parser = Parboiled.createParser(Parser.class);

        new BasicParseRunner(parser.InputLine()).run("");
//        Boolean done = false;
//
//        while (!done) {
//            System.out.print("test> ");
//            String input = new Scanner(System.in).nextLine();
//            if (StringUtils.isEmpty(input)) {
//                System.out.println("Empty input, exiting.");
//                done = true;
//            } else {
//                ParsingResult<?> result = new RecoveringParseRunner(parser.InputLine()).run(input);
//
//                if (result.hasErrors()) {
//                    System.out.println("\nParse Errors:\n" + printParseErrors(result));
//                }
//
//                Object value = result.parseTreeRoot.getValue();
//                if (value != null) {
//                    String str = value.toString();
//                    int ix = str.indexOf('|');
//                    if (ix >= 0) str = str.substring(ix + 2); // extract value part of AST node toString()
//                    System.out.println("Input: " + input + " = " + str + '\n');
//                }
//                if (value instanceof GraphNode) {
//                    Formatter<GraphNode> f = new ToStringFormatter<GraphNode>(null);
//                    System.out.println("\nAbstract Syntax Tree:\n" +
//                        GraphUtils.printTree((GraphNode) value, f) + '\n');
//                } else {
//                    System.out.println("\nParse Tree:\n" + printNodeTree(result) + '\n');
//                }
//            }
//        }
    }
}

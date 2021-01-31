import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        CharStream charStream= CharStreams.fromFileName("./main.dart");
        Dart2Lexer lexer = new Dart2Lexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Dart2Parser parser = new Dart2Parser(tokens);

        parser.setBuildParseTree(true);
        ParseTree tree = parser.compilationUnit();
       /* ParseTreeListener listener = new ParseTreeListener() {
            @Override
            public void visitTerminal(TerminalNode terminalNode) {

            }

            @Override
            public void visitErrorNode(ErrorNode errorNode) {

            }

            @Override
            public void enterEveryRule(ParserRuleContext parserRuleContext) {

            }

            @Override
            public void exitEveryRule(ParserRuleContext parserRuleContext) {

            }
        };*/
        ParseTreeWalker walker = new ParseTreeWalker();

        Dart2Ionic listener= new Dart2Ionic();
        listener.Createfile();

        //listener.visitIdentifier(parser.identifier());
        //System.out.print(listener.visitIdentifier(parser.identifier()));
        walker.walk(listener, tree);
        //System.out.print(visit);
    }
}

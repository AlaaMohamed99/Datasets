import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        CharStream charStream= CharStreams.fromFileName("./src/uiApp.ui");
        JavaScriptLexer lexer = new JavaScriptLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaScriptParser parser = new JavaScriptParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.program();
        ParseTreeWalker walker = new ParseTreeWalker();
        Jsx2Ionic listener = new Jsx2Ionic();
        //listener.CreateFile();
        walker.walk(listener, tree);
    }
}

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import java.io.IOException;

public class Main {
    public static void main(String [] args) throws IOException {
        CharStream charStream= CharStreams.fromFileName("./activity_main.xml");
        XMLLexer lexer = new XMLLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        XMLParser parser = new XMLParser(tokens);
        ParseTree tree = parser.document();
        ParseTreeWalker walker = new ParseTreeWalker();
        XML2Ionic XMLListener = new XML2Ionic();
        walker.walk(XMLListener, tree);

    }
}
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.Tree;


import java.io.IOException;

public class Main_scss {
    public static void main(String[] args) throws IOException {
        /* SCSS Part*/
        CharStream charStream_scss= CharStreams.fromFileName("src/test_scss.scss");
        ScssLexer scsslexer = new ScssLexer(charStream_scss);
        CommonTokenStream scss_tokens = new CommonTokenStream(scsslexer);
        ScssParser scssparser=new ScssParser(scss_tokens);
        scssparser.setBuildParseTree(true); // not neccessary
        ParseTree scss_tree = scssparser.stylesheet();
        ParseTreeWalker scss_walker = new ParseTreeWalker();
        Scss2ReactnativeConverter scss_listener = new Scss2ReactnativeConverter();
        scss_walker.walk(scss_listener,scss_tree);
    }
}
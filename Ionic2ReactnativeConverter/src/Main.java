import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.Tree;


import java.io.IOException;

public class Main {

    private  String importPublic;


    public static void main(String [] args)throws IOException {


        // take inputs as stream of characters
        CharStream charStream= CharStreams.fromFileName("src/test.html");
        //send the stream of chracters to the lexer to generate tokens
        HTMLLexer ionic_html_lexer = new HTMLLexer(charStream);
        CommonTokenStream ionic_html_tokens = new CommonTokenStream(ionic_html_lexer);
        // send tokens to parser to parse it
        HTMLParser ionic_html_parser=new HTMLParser(ionic_html_tokens);
        //define the starting point inside the parser
        ionic_html_parser.setBuildParseTree(true); // not neccessary
        ParseTree tree = ionic_html_parser.htmlDocument();
        // intialize the parsetreewalker
        ParseTreeWalker walker = new ParseTreeWalker();
        //intalize our custom listner
        Ionic2reactConverter mylistner = new Ionic2reactConverter( );
        //walk through the tree using our listner so that is the link which send
        // the parse tree to our listner
        walker.walk(mylistner,tree);






        /* SCSS Part*/
//        CharStream charStream_scss= CharStreams.fromFileName("src/test_scss.scss");
//        ScssLexer scsslexer = new ScssLexer(charStream_scss);
//        CommonTokenStream scss_tokens = new CommonTokenStream(scsslexer);
//        ScssParser scssparser=new ScssParser(scss_tokens);
//        scssparser.setBuildParseTree(true); // not neccessary
//        ParseTree scss_tree = scssparser.stylesheet();
//        ParseTreeWalker scss_walker = new ParseTreeWalker();
//        Scss2ReactnativeConverter scss_listener = new Scss2ReactnativeConverter();
//        scss_walker.walk(scss_listener,scss_tree);


    }

}

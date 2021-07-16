import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.Tree;
import java.io.IOException;


public class Main_TypeScript {
    public static void main(String[] args) throws IOException {
        /* SCSS Part*/
        CharStream charStream_TypeScript= CharStreams.fromFileName("src/test_typescript.ts");
        TypeScriptLexer typescriptlexer = new TypeScriptLexer(charStream_TypeScript);
        CommonTokenStream typescript_tokens = new CommonTokenStream(typescriptlexer);
        TypeScriptParser typescript_parser=new TypeScriptParser(typescript_tokens);
        typescript_parser.setBuildParseTree(true); // not neccessary
        ParseTree typescript_tree = typescript_parser.program();
        ParseTreeWalker typescript_walker = new ParseTreeWalker();
        TypeScript2ReactNativeConverter typescript_listener = new TypeScript2ReactNativeConverter();
        typescript_walker.walk(typescript_listener,typescript_tree);
    }
}
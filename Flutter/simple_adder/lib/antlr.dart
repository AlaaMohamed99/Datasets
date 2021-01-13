import 'package:antlr4/antlr4.dart';
import 'Dart2Lexer.dart';
import 'Dart2Parser.dart';
import 'dart:async';

class TreeShapeListener implements ParseTreeListener {
  @override
  void enterEveryRule(ParserRuleContext ctx) {
    print(ctx.text);
  }

  @override
  void exitEveryRule(ParserRuleContext node) {}

  @override
  void visitErrorNode(ErrorNode node) {}

  @override
  void visitTerminal(TerminalNode node) {}
}

void main(List<String> args) async {
  Dart2Lexer.checkVersion();
  final input =
      await InputStream.fromPath('D:/Flutterproj/simple_adder/lib/main.dart');
  final lexer = Dart2Lexer(input);
  final tokens = CommonTokenStream(lexer);
  final parser = Dart2Parser(tokens);
  parser.addErrorListener(DiagnosticErrorListener());
  parser.buildParseTree = true;
  print(lexer.tokenFactory);
  //final tree = parser.argumentList();
  //ParseTreeWalker.DEFAULT.walk(TreeShapeListener(), tree);
}

import 'package:flutter/material.dart';

void main() => runApp(MyFlutterApp());

class MyFlutterApp extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        debugShowCheckedModeBanner: false,
        title: "My Flutter App",
        home: ButtonClick());
  }
}

class ButtonClick extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Container(
      color: Colors.black,
        child: Column(
          children: [
            Row(
            children: [RaisedButton(
            color: Colors.blue,
            child: Text("Click"),
            onPressed: () {
              setState((){
                  dialog(context);
              });//action is written here
            })
            ])
            ])
            );
  }

  void dialog(BuildContext context) {
    var alertdialog = AlertDialog(
      title: Text("local host says"),
      content: Text("Button Clicked!"),
    );

    showDialog(
        context: context,
        builder: (BuildContext context) {
          return alertdialog;
        });
  }
}

import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
    debugShowCheckedModeBanner: false,
    title: "Stateful app example",
    home: Scaffold(appBar: AppBar(title: Text("Simple Form")), body: SIform()),
  ));
}

class SIform extends StatefulWidget {
  @override
  State<StatefulWidget> createState() {
    return _SIformstate();
  }
}

class _SIformstate extends State<SIform> {
  @override
  Widget build(BuildContext context) {
    return Container(
        child: Padding(
      padding: EdgeInsets.all(10.0),
      child: Column(
        children: [
          Padding(
              padding: EdgeInsets.only(top: 5.0, bottom: 5.0),
              child: TextField(
                decoration: InputDecoration(
                    labelText: 'Enter your name',
                    border: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(5.0))
                    
              )
              )
              ),
          Padding(
              padding: EdgeInsets.only(top: 5.0, bottom: 5.0),
              child: TextField(
                decoration: InputDecoration(
                    fillColor: Colors.white,
                    labelText: 'Password',
                    border: OutlineInputBorder(
                        borderRadius: BorderRadius.circular(5.0))
                        ),
              )),
          Padding(
              padding: EdgeInsets.only(top: 5.0, bottom: 5.0),
              child: Row(
                children: [
                  Expanded(
                    child: RaisedButton(
                      child: Text('Done', textScaleFactor: 1.5),
                      onPressed: () {
                        dialog(context);
                      },
                    ),
                  ),
                ],
              )),
        ],
      ),
    )
    );
  }

  void dialog(BuildContext context) {
    var alertdialog = AlertDialog(
      title: Text("Well Done"),
      content: Text("You've entered data successfully!"),
    );

    showDialog(
        context: context,
        builder: (BuildContext context) {
          return alertdialog;
        }
      );
  }
}

import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
      debugShowCheckedModeBanner: false,
      title: "My Flutter App",
      home: Scaffold(
          appBar: AppBar(
            title: Text("APP3", style: TextStyle(fontSize: 24.0)),
            backgroundColor: Colors.deepPurple
          ),
          body: ButtonClick())));
}

class ButtonClick extends StatefulWidget {
  @override
  State<StatefulWidget> createState() {
    return Converter();
  }
}

class Converter extends State<ButtonClick> {
  String output = "";
  String displaytext = "";
  TextEditingController extractnumber1 = TextEditingController();
  TextEditingController extractnumber2 = TextEditingController();
  @override
  Widget build(BuildContext context) {
    return Container(
        color: Colors.lightBlue,
        child: Container(
        margin: EdgeInsets.only(top: 60.0),
            child: Column(children: [
              Row(children: [
                Expanded(
                    child: Padding(
                  padding: EdgeInsets.only(left: 25.0, right: 25.0),
                  child: TextField(
                      controller: extractnumber1,
                      decoration: InputDecoration(
                          border: UnderlineInputBorder(
                              borderSide: BorderSide(color: Colors.black)))),
                )),
                Expanded(
                    child: Padding(
                        padding: EdgeInsets.only(left: 25.0, right: 25.0),
                        child:Text(
                          "Modulu",
                          style:
                              TextStyle(color: Colors.yellow, fontSize: 18.0),
                        ))),
                Expanded(
                    child: Padding(
                  padding: EdgeInsets.only(left: 25.0, right: 25.0),
                  child: TextField(
                      controller: extractnumber2,
                      decoration: InputDecoration(
                          border: UnderlineInputBorder(
                              borderSide: BorderSide(color: Colors.black)))),
                )),
              ]),
              Padding(
                padding: EdgeInsets.only(top: 100.0, bottom: 10),
                child: Text(this.displaytext, style: TextStyle(
                              fontSize: 36.0, color: Colors.yellow))),
              RaisedButton(
                      color: Colors.deepPurple,
                      child: Text(
                        "RESULT",
                        style: TextStyle( color: Colors.white)
                      ),
                      onPressed: () {
                        setState(() {
                          display();
                        }); //action is written here
                      })
            ])
            )
            );
  }

  void display() {
    this.output =
        (int.parse(extractnumber1.text) % int.parse(extractnumber2.text))
            .toString();
    this.displaytext = this.output;
  }
}

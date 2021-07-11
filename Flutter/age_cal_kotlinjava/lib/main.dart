import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
      debugShowCheckedModeBanner: false,
      home: Scaffold(
          appBar: AppBar(
            title: Text("APP1", style: TextStyle(fontSize: 24.0)),
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
  TextEditingController extractnumber = TextEditingController();
  var date = new DateTime.now();

  @override
  Widget build(BuildContext context) {
    return Container(
        color: Colors.lightBlue,
        child: Container(
            margin: EdgeInsets.only(top: 60.0),
            child: Column(children: [
              Padding(
                padding: EdgeInsets.only(left: 25.0, right: 25.0),
                child: TextField(
                  keyboardType: TextInputType.number,
                  controller: extractnumber,
                  decoration: InputDecoration(
                    hintText: 'Enter your DOB',
                    filled: true,
                    fillColor: Colors.white,
                  ),
                ),
              ),
              Text(
                this.displaytext,
                style: TextStyle(fontSize: 24.0),
              ),
              RaisedButton(
                      color: Colors.deepPurple,
                      child: Text(
                        "GET AGE",
                        style: TextStyle(fontSize: 24.0),
                      ),
                      onPressed: () {
                        setState(() {
                          display();
                        }); //action is written here
                      })
            ])));
  }

  void display() {
    this.output = (date.year - int.parse(extractnumber.text)).toString();
    this.displaytext = "your age is $output years";
  }
}


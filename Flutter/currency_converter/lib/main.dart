import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
      debugShowCheckedModeBanner: false,
      title: "My Flutter App",
      home: Scaffold(
          appBar: AppBar(
            title: Text("currency converter", style: TextStyle(fontSize: 24.0)),
            backgroundColor: Colors.purple,
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

  @override
  Widget build(BuildContext context) {
    return Container(
        color: Colors.blue,
        child: Container(
            margin: EdgeInsets.only(top: 60.0),
            child: Column(children: [
              Center(
                  child: Padding(
                padding: EdgeInsets.symmetric(horizontal: 25.0),
                child: TextField(
                  controller: extractnumber,
                  decoration: InputDecoration(
                    filled: true,
                    fillColor: Colors.white,
                  ),
                ),
              )),
              Center(
                child: Text(this.displaytext, style: TextStyle(fontSize: 24.0),)
                ),
              
              Center(
                  child: RaisedButton(
                      color: Colors.purple,
                      child: Text("Convert to EGP", style: TextStyle(fontSize: 24.0),),
                      onPressed: () {
                        setState(() {
                          display();
                        }); //action is written here
                      }))
            ])));
  }
  void display(){
    double number = double.parse(extractnumber.text);
    this.output =(double.parse(extractnumber.text) * 15.7).toString();
    this.displaytext = "$number USD is equal to $output EGP";
  }

}

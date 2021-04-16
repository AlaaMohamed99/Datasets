import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
    debugShowCheckedModeBanner: false,
    title: "Stateful app example",
    home: Scaffold(
        // resizeToAvoidBottomPadding: false,
        appBar: AppBar(title: Text("Simple Adder")),
        body: SIform()
        //Favcity()
        ),
  ));
}

class SIform extends StatefulWidget {
  @override
  State<StatefulWidget> createState() {
    return _SIformstate();
  }
}

class _SIformstate extends State<SIform> {
  String name = "";
  String lastname = "";

  TextEditingController principalControlled = TextEditingController();
  TextEditingController roiControlled = TextEditingController();

  String displaytext = "";

  @override
  Widget build(BuildContext context) {
    return Container(
        margin: EdgeInsets.all(10.0),
        child: Column(
        children: [
          curimage(),
          Padding(
              padding: EdgeInsets.only(top: 5.0, bottom: 5.0),
              child: TextField(
                controller: principalControlled,
                keyboardType: TextInputType.number,
                decoration: InputDecoration(labelText: 'First number', hintText: 'Write a number', border: OutlineInputBorder(borderRadius: BorderRadius.circular(5.0))),
              )),
          Padding(
              padding: EdgeInsets.only(top: 5.0, bottom: 5.0),
              child: TextField(
                controller: roiControlled,
                keyboardType: TextInputType.number,
                decoration: InputDecoration(fillColor: Colors.white, labelText: 'Second number', hintText: 'Write a number', border: OutlineInputBorder(borderRadius: BorderRadius.circular(5.0))),
              )),
          Padding(
            padding: EdgeInsets.only(top: 5.0, bottom: 5.0),
            child: RaisedButton(
              child: Text('Calculate', textScaleFactor: 1.5),
              onPressed: () {
                setState(() {
                  display();
                });
              },
            ),
          ),
          Text(
            this.displaytext,
            textScaleFactor: 1.5,
          ),
        ],
      ),
    );
  }

  String display() {
    double principal = double.parse(principalControlled.text);
    double roi = double.parse(roiControlled.text);

    double totalamountpaybale = principal + roi;

    String result = "Answer is $totalamountpaybale";
    this.displaytext = result;
  }

  //instead of creating a class for image widget
  Widget curimage() {
    AssetImage curr = AssetImage('images/cal.png');
    Image currentimage = Image(
      image: curr,
    );
    return Container(
      child: currentimage,
    );
  }
}

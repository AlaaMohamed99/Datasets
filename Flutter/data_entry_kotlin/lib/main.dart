import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
    debugShowCheckedModeBanner: false,
    home: Scaffold(
        appBar: AppBar(title: Text("APP5"), backgroundColor: Colors.purple),
        body: SIform()),
  ));
}

class SIform extends StatefulWidget {
  @override
  State<StatefulWidget> createState() {
    return _SIformstate();
  }
}

class _SIformstate extends State<SIform> {
  TextEditingController name = TextEditingController();
  String displaytext = "";
  bool changedMale = false;
  bool changedFemale = false;
  @override
  Widget build(BuildContext context) {
    return Center(
      child: Container(
          child: Padding(
        padding: EdgeInsets.all(20.0),
        child: ListView(
          children: [
            Padding(
                padding: EdgeInsets.only(top: 5.0, bottom: 5.0),
                child: TextField(
                  controller: name,
                  decoration: InputDecoration(
                    icon: Text('Enter your name:',
                        style: TextStyle(fontSize: 18.0)),
                  ),
                )),
            Padding(
                padding: EdgeInsets.only(top: 5.0, bottom: 5.0),
                child: Row(children: [
                  Expanded(
                      child: CheckboxListTile(
                    title: Text("Male"),
                    controlAffinity: ListTileControlAffinity.leading,
                    value: changedMale,
                    onChanged: (bool value) {
                      setState(() {
                        this.changedMale = value;
                        this.changedFemale = false;
                      });
                    },
                  )),
                  Expanded(
                      child: CheckboxListTile(
                    title: Text("Female"),
                    controlAffinity: ListTileControlAffinity.leading,
                    value: changedFemale,
                    onChanged: (bool value) {
                      setState(() {
                        this.changedFemale = value;
                        this.changedMale = false;
                      });
                    },
                  ))
                ])),
            Padding(
                padding: EdgeInsets.only(top: 5.0, bottom: 5.0),
                child: Center(
                  child: RaisedButton(
                    color: Colors.purple,
                    child: Text('Confirm', textScaleFactor: 1.5),
                    onPressed: () {
                      setState(() {
                        display();
                      });
                    },
                  ),
                )),
            Center(
                child: Text(this.displaytext,
                    style: TextStyle(
                      fontSize: 36.0,
                      color: Colors.purple,
                    )))
          ],
        ),
      )),
    );
  }
  void display(){
    var v = name.text;
    this.displaytext = "Welcome $v";
  }
}

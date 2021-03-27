import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
    debugShowCheckedModeBanner: false,
    title: "Stateful app example",
    home: Scaffold(
        appBar: AppBar(
          title: Text("Change BG Color"),
          backgroundColor: Colors.deepPurple,
        ),
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
  Color color = Colors.white;
  @override
  Widget build(BuildContext context) {
    return Container(
        color: color,
        child: Center(
            child: Padding(
                padding: EdgeInsets.only(top: 200.0),
                child: Column(
                  children: [
                    RaisedButton(
                      color: Colors.red,
                      child: Text("RED", style: TextStyle(color: Colors.white)),
                      onPressed: () {
                        setState(() {
                          red();
                        });
                      },
                    ),
                    RaisedButton(
                      color: Colors.yellow,
                      child: Text("YELLOW"),
                      onPressed: () {
                        setState(() {
                          yellow();
                        });
                      },
                    ),
                    RaisedButton(
                      color: Colors.black,
                      child:
                          Text("BLACK", style: TextStyle(color: Colors.white)),
                      onPressed: () {
                        setState(() {
                          black();
                        });
                      },
                    ),
                    RaisedButton(
                      color: Colors.green,
                      child:
                          Text("GREEN", style: TextStyle(color: Colors.white)),
                      onPressed: () {
                        setState(() {
                          green();
                        });
                      },
                    )
                  ],
                ))));
  }

  void red() {
    color = Colors.red;
  }

  void yellow() {
    color = Colors.yellow;
  }

  void black() {
    color = Colors.black;
  }

  void green() {
    color = Colors.green;
  }
}

import 'package:flutter/material.dart';

void main() {
  runApp(MaterialApp(
    debugShowCheckedModeBanner: false,
    home: Scaffold(body: SIform()),
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
    return Center(
      child: Container(
        color: Colors.black,
          child: ListView(
          children: [
                TextField(
                  style: TextStyle(color: Colors.white, fontSize: 20.0),
                  decoration: InputDecoration(
                      prefixIcon: Padding (
                        padding: EdgeInsets.only(right: 11.0, top: 11.0),
                        child :Text('Username', style: TextStyle(color: Colors.white, fontSize: 20.0),)
                        ),
                      enabledBorder: UnderlineInputBorder(
                      borderSide: BorderSide(color: Colors.grey)
                    )
                    ),
                ),
                TextField(
                  style: TextStyle(color: Colors.white, fontSize: 20.0),
                  decoration: InputDecoration(
                      prefixIcon: Padding (
                        padding: EdgeInsets.only(right: 52.0, top: 11.0),
                        child :Text('Email', style: TextStyle(color: Colors.white, fontSize: 20.0),)
                        ),           
                      enabledBorder: UnderlineInputBorder(
                      borderSide: BorderSide(color: Colors.grey)
                    )
                    ),
                ),
                TextField(
                  style: TextStyle(color: Colors.white, fontSize: 20.0),
                  obscureText: true,
                  decoration: InputDecoration(
                      prefixIcon: Padding (
                        padding: EdgeInsets.only(right: 16.0, top: 11.0),
                        child :Text('Password', style: TextStyle(color: Colors.white, fontSize: 20.0),)
                        ),
                    enabledBorder: UnderlineInputBorder(
                      borderSide: BorderSide(color: Colors.grey)
                    )
                    ),
                  
                ),
          ],
        ),
      ),
    );
  }

}
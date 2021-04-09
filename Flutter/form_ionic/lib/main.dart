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
    return Container(
      color: Colors.black,
      child: Column(
        children: [
          TextField(
            decoration: InputDecoration(
                prefixIcon: Text(
                      'Username',
                      style: TextStyle(color: Colors.white, fontSize: 20.0),
                    ),
                enabledBorder: UnderlineInputBorder(
                    borderSide: BorderSide(color: Colors.grey))),
            style: TextStyle(color: Colors.white, fontSize: 20.0),
            //lw 7sl moshkla 7oti l style b3d l decoration
          ),
          TextField(
            decoration: InputDecoration(
                prefixIcon:  Text(
                      'Email',
                      style: TextStyle(color: Colors.white, fontSize: 20.0),
                    ),
                enabledBorder: UnderlineInputBorder(
                    borderSide: BorderSide(color: Colors.grey))),
            style: TextStyle(color: Colors.white, fontSize: 20.0),
          ),
          TextField(
            obscureText: true,
            decoration: InputDecoration(
                prefixIcon: Text(
                      'Password',
                      style: TextStyle(color: Colors.white, fontSize: 20.0),
                    ),
                enabledBorder: UnderlineInputBorder(
                    borderSide: BorderSide(color: Colors.grey))),
            style: TextStyle(color: Colors.white, fontSize: 20.0),
          ),
        ],
      ),
    );
  }
}

import "package:flutter/material.dart";


void main() {
  runApp(MaterialApp(
    debugShowCheckedModeBanner: false,
      home: Scaffold(
        //to contain the listview 3shan htb2a out of mobile scope
        body: Container(child: shortlist(), color: Colors.black,),
        ),
      )
      );
}



Widget shortlist() {
  var listview = ListView(
    children: [
      ListTile(
        title: Text("Shopping List", style: TextStyle(fontSize: 25.0, color: Colors.white,),),
      ),
      ListTile(
        leading: Icon(Icons.circle, color: Colors.white, size: 10.0,),
        title:Align(
          alignment: Alignment(-1.3,2.0), 
          child: Text("Instgram", style: TextStyle(color: Colors.white, fontSize: 20.0 ))),
      ),
      ListTile(
        leading: Icon(Icons.circle, color: Colors.white, size: 10.0,),
        title:Align(
          alignment: Alignment(-1.3,2.0), 
          child: Text("Whatsapp", style: TextStyle(color: Colors.white, fontSize: 20.0 ))),
      ),
      ListTile(
        leading: Icon(Icons.circle, color: Colors.white, size: 10.0,),
        title:Align(
          alignment: Alignment(-1.3,2.0), 
          child: Text("Oculus", style: TextStyle(color: Colors.white, fontSize: 20.0 ))),
      )
    ],
  );
  return listview;
}



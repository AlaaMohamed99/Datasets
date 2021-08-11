import { StatusBar } from 'expo-status-bar';
import React from 'react';
import {useState} from 'react'
import {Appbar} from 'react-native-paper'
import {StyleSheet, Text, TextInput, View, TouchableOpacity,Button } from 'react-native';


export default class App extends React.Component{
  constructor(props)
  {
    super(props);
  }
    state = 
    {
      fullWord:"",
      firstnumber:"",
      secondnumber:""
    };
  


  set_firstnumber = firstnumber =>
  {
    this.setState({firstnumber})
  }
  set_secondnumber = secondnumber =>
  {
    this.setState({secondnumber})
  }


  buttonClickListner = e => {
    var ans = Number(this.state.firstnumber)%Number(this.state.secondnumber);
    let answer = ans.toString(10);
    this.setState({fullWord:answer})
  };

  render() 
  {
    return (
      <View style={styles.container} onMouseMove={(e)=>{console.log(e.nativeEvent)}}>
        <Appbar style={styles.Appbar}>
          Modulo App
        </Appbar>
        <View style={styles.Main}>
          <View style={styles.rowContainer}>
          <View style={styles.input1}>
          <TextInput
            title="First number"
            style={styles.textin}
            value={this.state.firstnumber}
             onChangeText={this.set_firstnumber}
            />
            </View>
            <Text style={styles.text}>Modulo</Text>
            <View style={styles.input2}>
            <TextInput
            title="Second number"
            style={styles.textin}
            value={this.state.secondnumber}
             onChangeText={this.set_secondnumber}
            />
            </View>
          </View>
          <Text style={styles.text}>{this.state.fullWord}</Text>
          <TouchableOpacity
           onPress={this.buttonClickListner}
           style={styles.button}
          >
         <Text style={styles.text_}>Result</Text>
          </TouchableOpacity>
        </View> 
        </View>
      );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
  },
  Main:
  {
    display:'flex',
    flex: 1,
    backgroundColor: '#1e90ff',
    alignItems: 'center',
    justifyContent:'center'
  },
  Appbar:
  {
    backgroundColor:'purple',
    width:'100%',
    height:'50px',
    color:'white',
    fontWeight:'bold',
    fontSize:'25px'
  },
  rowContainer: {
    display:'flex',
    flexDirection:'row',
    margin:'10px',
  },
  input1:
  {
    marginRight:'10px',
    borderBottomWidth: '1px',
    width:'100px'
  },
  input2:
  {
    marginLeft:'10px',
    borderBottomWidth:'1px',
    width:100
  },
  button:{
    alignSelf:'center',
    alignContent:'center',
    backgroundColor:"purple",
    height:'38px',
    width:'100px',
    marginTop:'15px',
  },
  text:
  {
    alignSelf:'center',
    color:'yellow',
    fontSize:'20px',
    marginLeft:'10px',
    marginRight:'10px',
    fontWeight:'bold'
  },
  text_:
  {
    alignSelf:'center',
    color:'white',
    fontSize:'20px',
    marginLeft:'10px',
    marginRight:'10px',
    fontWeight:'bold'
  },
  result:{
    alignSelf:'center',
    margin:'15px'
  }
});
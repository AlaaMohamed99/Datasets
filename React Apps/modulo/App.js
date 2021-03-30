import { StatusBar } from 'expo-status-bar';
import React from 'react';
import {useState} from 'react'
import { render } from 'react-dom';
import {StyleSheet, Text, TextInput, View, TouchableOpacity,Button } from 'react-native';


export default class App extends React.Component{
  state = {
      FirstNumber: 0,
      SecondNumber:0,
      fullWord:""
    };

  buttonClickListner = e => {
    var ans = Number(this.state.FirstNumber)%Number(this.state.SecondNumber);
    this.setState({fullWord:ans.toString(10)})
  };

  render() {
    const { name, showName } = this.state;
    return (
      
        <View style={styles.container}>
          
          <View style={styles.rowContainer}>
          <View style={styles.input1}>
          <TextInput
            title="First number"
            style={styles.textin}
             onChangeText={val => {
              this.setState({
                FirstNumber: val
              });
            }}
            />
            </View>
            <Text style={styles.text}>Modulo</Text>
            <View style={styles.input2}>
            <TextInput
            label="Second number"
            style={styles.textin}
             onChangeText={val => {
              this.setState({
                SecondNumber: val
              });
            }}
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
      );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#1e90ff',
    alignItems: 'center',
    justifyContent:'center'
  },
  rowContainer: {
    flexDirection:'row',
    margin:10,
  },
  input1:
  {
    marginRight:10,
    borderBottomWidth: 1,
    width:100
  },
  input2:
  {
    marginLeft:10,
    borderBottomWidth:1,
    width:100
  },
  button:{
    alignSelf:'center',
    alignContent:'center',
    backgroundColor:"#8b008b",
    height:38,
    width:100,
    marginTop:15,
  },
  text:
  {
    alignSelf:'center',
    color:'yellow',
    fontSize:20,
    marginLeft:10,
    marginRight:10,
    fontWeight:'bold'
  },
  text_:
  {
    alignSelf:'center',
    color:'white',
    fontSize:20,
    marginLeft:10,
    marginRight:10,
    fontWeight:'bold'
  },
  result:{
    alignSelf:'center',
    margin:15
  }
});

import { StatusBar } from 'expo-status-bar';
import React from 'react';
import {useState} from 'react'
import {Appbar} from 'react-native-paper'
import {StyleSheet, Text, TextInput, View, TouchableOpacity,Button } from 'react-native';
import  styles from './style.js';

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
        <Appbar style={styles.Appbar}>
          Modulo App
        </Appbar>
        <View style={styles.Main}>
          
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
        </View>
      );
  }
}


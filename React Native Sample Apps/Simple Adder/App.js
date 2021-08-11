import * as React from 'react';
import {useState, state} from 'react';
import {Appbar} from 'react-native-paper'
import { Button, Text, View, Alert, TouchableOpacity, Image} from 'react-native';
import styles from './styles.js'
import { TextInput } from 'react-native';





export default class App extends React.Component
{

  state=
  {
    firstnumber:"",
    secondnumber:"",
    answer:0,
  }

  set_first_number=firstnumber=>{this.setState({firstnumber})}
  set_second_number=secondnumber=>{this.setState({secondnumber})}
  onPress=()=>
  {
    let ans = (Number(this.state.firstnumber)+Number(this.state.secondnumber));
    this.setState({answer:ans})
  }
  render()
  {
    return (
      
        <View style={styles.container}>
          <Appbar style={styles.Appbar} onMouseMove={(e)=>console.log(e.nativeEvent)}>
            Simple Adder
          </Appbar>
          <View style={styles.container}>
            <TextInput
            onMouseMove={(e)=>console.log(e.nativeEvent)}
            label="First Number"
            style={styles.textin1}
            value={this.state.firstnumber}
            onChangeText={this.set_first_number}
            />
             <TextInput
            onMouseMove={(e)=>console.log(e.nativeEvent)}
            label="Second number"
            style={styles.textin2}
            value={this.state.secondnumber}
            onChangeText={this.set_second_number}
            />
            <View style={styles.Button}>
          <Button
            onMouseMove={(e)=>console.log(e.nativeEvent.clientX)}
            onPress={this.onPress}
            title="Calculate"
          />
          <Text style={styles.textout}
          onMouseMove={(e)=>console.log(e.nativeEvent)}
          >{this.state.answer}</Text>
        </View>
        </View> 
        </View>
      );
    }
}




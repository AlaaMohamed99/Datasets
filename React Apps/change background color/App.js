
import React, { Component } from 'react';
 
import { StyleSheet, View, Button, Text} from 'react-native';
 
export default class Mynewproject extends Component {
 
  constructor(){
 
    super();
 
    this.state={
 
      //default padding.
      BackgroundColour : '#fff',
 
    }
  }
 
  red=()=>{
 
    this.setState({
 
      BackgroundColour : '#ff0000',
 
    })
 
  }
 
  yellow=()=>{
 
    this.setState({
 
      BackgroundColour : '#ffff00',
 
    })
 
  }
  green=()=>{
 
    this.setState({
 
      BackgroundColour : '#008000',
 
    })
 
  }
  black=()=>{
 
    this.setState({
 
      BackgroundColour : '#000000',
 
    })
 
  }
 render() {
 
   return (
 
      <View style={[styles.MainContainer, {backgroundColor: this.state.BackgroundColour}]}>

        <Button title='Red' color='red' onPress={this.red} />
        <Button title='Yellow' color='yellow' onPress={this.yellow} />
        <Button title='Black' color='black' onPress={this.black} />
        <Button title='Green' color='green' onPress={this.green} />
      </View>
 
           
   );
 }
}
 
const styles = StyleSheet.create({
 
  MainContainer :{
      
      flex:1,
      flexDirection:'row',
      justifyContent: 'center',
      alignItems: 'center',
      padding: 10,
  
  },
 
  TextStyle:{
    
      marginBottom: 10,
      color: '#000',
      borderWidth: 1,
      borderColor: '#F44336'
 
  }
 
});
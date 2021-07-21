
import React, { Component } from 'react';
 
import { StyleSheet, View, Button, Text, SafeAreaView} from 'react-native';
 import {Appbar} from 'react-native-paper';
export default class Mynewproject extends Component {
 
  constructor(){
 
    super();
 
    this.state={

      //default padding.
      BackgroundColour : '#fff',

    }
  }
  
 
   red(){
    this.setState({
      BackgroundColour : 'red',
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
 render() 
 {
 
   return (
     <View style={[styles.container, {backgroundColor: this.state.BackgroundColour}]}>
       <Appbar style={styles.AppBar}>
         <Text style={styles.Text}>
           Change BG Color
         </Text>
       </Appbar>
      <View style={styles.container} style= {backgroundColor= this.state.BackgroundColour}>
        <View>
        <Button  title='Red' color='red' onPress={this.red} />
        <Button  title='Yellow' color='yellow' onPress={this.yellow} />
        <Button  title='Black' color='black' onPress={this.black} />
        <Button  title='Green' color='green' onPress={this.green} />
        </View>
      </View> 
      </View>     
   );
 }
}
 
const styles = StyleSheet.create({
 Text:
 {
  fontWeight:'bold',
  color:'white'
 },
  AppBar:
  {
   width:'100%'
  },
  container :{
      flex:1,
      flexDirection:'column',
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
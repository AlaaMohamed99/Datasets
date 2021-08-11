
import React, { Component } from 'react';
 
import { StyleSheet, View, Button, Text, SafeAreaView} from 'react-native';
 import {Appbar} from 'react-native-paper';
export default class App extends React.Component
{
  state=
    {
      BackgroundColour : '#fff',
    }
  
  red=()=>
  {
    this.setState({BackgroundColour : '#ff0000'})
  }
 
  yellow=()=>
  {
    this.setState({BackgroundColour : '#ffff00'})
  }
  green=()=>
  {
    this.setState({BackgroundColour : '#008000'}) 
  }
  black=()=>
  {
    this.setState({BackgroundColour : '#000000'})
  }
 render() 
 {
   return (
     <View style={[styles.container, {backgroundColor: this.state.BackgroundColour}]}
     onMouseMove={(e)=>{console.log(e.nativeEvent)}}>
       <Appbar style={styles.AppBar}>
         <Text style={styles.Text}>
           Change BG Color
         </Text>
       </Appbar>
      <View style={styles.container}>
        <Button  title='Red' color='red' onPress={this.red} />
        <Button  title='Yellow' color='yellow' onPress={this.yellow} />
        <Button  title='Black' color='black' onPress={this.black} />
        <Button  title='Green' color='green' onPress={this.green} />
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
   width:'100%',
   backgroundColor:'purple',
  },
  container :{
     height:'100%',
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
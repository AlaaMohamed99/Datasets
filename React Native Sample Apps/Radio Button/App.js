import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { Appbar,RadioButton } from 'react-native-paper'; 
import {useState} from 'react'
import { Alert, Button, StyleSheet, Text, TextInput, View,CheckBox, TouchableOpacity } from 'react-native';
import { render } from 'react-dom';

export default class App extends React.Component{

state=
{
  name:"",
  isSelected:true,
  isnotSelected:true,
  output:"",
}
set_name = name => {this.setState({name})}
set_radio1= isSelected=>{this.setState({isSelected:!this.state.isSelected});
}
set_radio2= isnotSelected=>{this.setState({isSelected:!this.state.isSelected})}

onPress = output =>
{
  let val = this.state.isSelected;
  let gender = "";
  if(val)
  {
     gender = "female "
  }
  else
  {
    gender = "male"
  }
    alert("hello your name is: "+this.state.name+"\n and your gender is "+gender);
}
render()
{
  return (    
    <View onMouseMove={(e)=>{console.log(e.nativeEvent.clientX,e.nativeEvent.clientY)}}>
    <Appbar style={styles.Appbar}>Simple Form</Appbar>
    <View style={styles.container}>
      <View style={styles.InputContainer}>
        <TextInput
         placeholder="Enter Name"
         value={this.state.name}
         onChangeText={this.set_name}
        />
      </View>
      <View style={styles.InputContainer}>
      <TextInput
        secureTextEntry={true}
        placeholder="Enter Password"
        />
      </View>
      <View style={styles.checkboxContainer}>
      <View style={styles.checkboxContainer}>
      <RadioButton
           value={this.state.isSelected}
           status={this.state.isSelected===false?'checked':'unchecked'}
           onPress={this.set_radio1}
           style={styles.checkbox}
      />
      <Text style={styles.text}>Male</Text>
      </View>
      <View style={styles.checkboxContainer}>
      <RadioButton
           value={this.state.isSelected}
           status={this.state.isSelected===true?'checked':'unchecked'}
           onPress={this.set_radio1}
           style={styles.checkbox}
      />
      <Text style={styles.text}>Female</Text>
      </View>
      </View>
      <TouchableOpacity
        style={styles.button}
        onPress={this.onPress}
      >
      <Text style={styles.buttontext}>Done</Text>
      </TouchableOpacity>
      <Text>{this.state.output}</Text>
    </View>
    </View>
  );
}
} 


const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#FFF',
    alignItems: 'center',
    justifyContent: 'center',
  },
  text:{
    fontWeight:'bold'
  },
  checkboxContainer:
  {
    flexDirection:'row',
    margin:10,
    marginRight:35,
  },
  checkbox:{
    marginRight:'30px',
    marginLeft:'30px',
  },
  button:
  {
    width:"100%",
    backgroundColor:"#e6e6fa",
    height:30,
    borderRadius:5
    
  },
  buttontext:{
    alignSelf:'center',
    fontWeight:'bold',
    color:'black'
  },
  text:{
    color:'black',
    fontWeight:'normal',
    alignSelf:'center'
  },
  InputContainer:
  {
    size:30,
    alignSelf:'center',
    flexDirection:'column',
    margin:3,
    backgroundColor:'#FFF',
    borderBottomWidth:'0.5px',
    borderTopWidth:'0.5px',
    borderRightWidth:'0.5px',
    borderLeftWidth:'0.5px', 
    borderColor:'grey',
    borderRadius:'0.8px',
    borderStyle:'solid',
    width:"300px",
    height:'30px'
  },
  Appbar:
  {
    backgroundColor:'#1e90ff',
    height:'50px',
    marginBottom:'30px',
    color:'white',
    fontWeight:'normal'
  }
});



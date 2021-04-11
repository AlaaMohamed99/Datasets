import { StatusBar } from 'expo-status-bar';
import React from 'react';
import {useState} from 'react'
import { Alert, Button, StyleSheet, Text, TextInput, View,CheckBox, TouchableOpacity } from 'react-native';
import styles from './Button.component.style.js';

function onPress(name)
{
  Alert.alert("Hello, "+name);
  alert("Hello, "+name)
}
export default function App(){

    const [isSelected1, setSelection1] = useState(false);
    const [isSelected2, setSelection2] = useState(false);
    const [text1, setText1] = React.useState('');
    const [text2, setText2] = React.useState('');
  return (    
    <View style={styles.container}>
      <View style={styles.InputContainer}>
        <TextInput
         placeholder="Enter Name"
         onChangeText={text1=> setText1(text1)}
        />
      </View>
      <View style={styles.InputContainer}>
      <TextInput
        secureTextEntry={true}
        placeholder="Enter Password"
        onChangeText={text2 => setText2(text2)}
        />
      </View>
      <View style={styles.checkboxContainer}>
      <View style={styles.checkboxContainer}>
      <CheckBox
           value={isSelected1}
           onValueChange={setSelection1}
           style={styles.checkbox}
      />
      <Text style={styles.buttontext}>Male</Text>
      </View>
      <View style={styles.checkboxContainer}>
      <CheckBox
           value={isSelected2}
           onValueChange={setSelection2}
           style={styles.checkbox}
      />
      <Text style={styles.buttontext}>Female</Text>
      </View>
      </View>
      <TouchableOpacity
        style={styles.button}
        onPress={()=>onPress(text1)}
      >
      <Text style={styles.text}>Done</Text>
      </TouchableOpacity>
    </View>
  );
};




import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { Appbar,RadioButton } from 'react-native-paper'; 
import {useState} from 'react'
import { Alert, Button, StyleSheet, Text, TextInput, View,CheckBox, TouchableOpacity } from 'react-native';
import styles from './Button.component.style.js';
import { render } from 'react-dom';



export default function App(){


  const [isSelected, setSelection] = useState(true);
  const [text1, setText1] = React.useState('');
  const [text2, setText2] = React.useState('');
  const [output, setOutput] = useState("");  



  return (    
    <View>
    <Appbar style={styles.Appbar}>Simple Form</Appbar>
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
      <RadioButton
           value={isSelected}
           status={isSelected===true?'checked':'unchecked'}
           onPress={()=>setSelection(true)}
           style={styles.checkbox}
      />
      <Text style={styles.text}>Male</Text>
      </View>
      <View style={styles.checkboxContainer}>
      <RadioButton
           value={isSelected}
           status={isSelected===false?'checked':'unchecked'}
           onPress={()=>setSelection(false)}
           style={styles.checkbox}
      />
      <Text style={styles.text}>Female</Text>
      </View>
      </View>
      <TouchableOpacity
        style={styles.button}
        onPress={()=>setOutput("you've Entered Data!")}
      >
      <Text style={styles.buttontext}>Done</Text>
      </TouchableOpacity>
      <Text>{output}</Text>
    </View>
    </View>
  );
} 





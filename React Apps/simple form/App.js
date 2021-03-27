import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { StyleSheet, Text, TouchableOpacity, View, TextInput, Alert } from 'react-native';

function onPress()
{
  Alert.alert("Well Done!\nyou've entered your data successfully");
  let sentence = "Well Done!\n";
  alert(sentence.toString()+"you've entered your data successfully");
}
export default function App() {
  return (
    <View style={styles.container}>
      
     <View style={styles.textinput}>
     <TextInput placeholder="Enter your name"/>
     </View>
     <View style={styles.textinput}>
     <TextInput placeholder="Password" secureTextEntry={true}/>
     </View>
     <TouchableOpacity style={styles.button}
     onPress={onPress}
     >
     <Text style={styles.text}>Done</Text>
     </TouchableOpacity>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'stretch',
  },
  textinput:{
    borderWidth:0.3,
    borderRadius:0.8,
    marginBottom:10,
    height:30
  },
  button:
  {
   backgroundColor:'#a9a9a9'
  },
  text:
  {
   alignSelf:'center',
   fontWeight:'bold'
  }
});

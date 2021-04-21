import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { StyleSheet, Text, View, ToolbarAndroidBase, TextInput } from 'react-native';

export default function App() {
  return (
    <View style={styles.container}>
      <Text style={styles.text}>Shooping List</Text>
      <View style={styles.text}>
      <ul>
      <View style={styles.li}>
      <li>Instagram</li>
      </View>
      <View style={styles.li}>
      <li>WhatsApp</li>
      </View>
      <View style={styles.li}>
      <li>Oculus</li> 
      </View>
      </ul>
      </View>
    </View>

  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: 'black',
    color:'white',
    flexDirection:'column'
  },
  text:
  {
    color:'white',
    fontWeight:'normal',
    fontSize:'20px'
  },
  li:{
   marginTop:'12px',
   marginBottom:'12px'
  }
});

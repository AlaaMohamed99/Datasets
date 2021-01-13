import { StatusBar } from 'expo-status-bar';
import react from 'react';
import React from 'react';
import { Alert, Button, StyleSheet, Text, View } from 'react-native';

export default class  App extends react.Component {
 render(){
   return(
     <View  style={styles.container}>
       <View style={styles.Button}>
       <Button
       title="Click!"
       onPress={ ()=>Alert.alert('Button Clicked!')}
       />
       </View>
     </View>
   );
 }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#000000',
    alignItems: 'center',
    justifyContent: 'center',
  },
  Button :{
    marginBottom:600,
    marginRight:300,
    width:100
  }
});

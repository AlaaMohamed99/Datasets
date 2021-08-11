import { StatusBar } from 'expo-status-bar';
import React from 'react';
import { StyleSheet, Text, View,TextInput} from 'react-native';

export default class App extends React.Component{

  render()
  {
  return (
    <View style={styles.container} onMouseMove={(e)=>{console.log(e.nativeEvent)}}>
   <View style={styles.row}>
    <Text style={styles.Text}>User name</Text>
    <TextInput
    style={styles.TextInput}
    color='white'
    />
   </View>
   <View style={styles.row}>
    <Text style={styles.Text}>Email</Text>
    <TextInput
    style={styles.TextInput}
    color='white'
    />
   </View>
   <View style={styles.row}>
    <Text style={styles.Text}  >Password</Text>
    <TextInput
    style={styles.TextInput}
    secureTextEntry={true}
    color='white'
    />
   </View>
      </View>
  );
}
}

const styles = StyleSheet.create(
  {
  container: {
    flex: 1,
    backgroundColor: 'black',
  },
  TextInput:
  {
    color:'white',
    marginLeft:'30px',
    width:'50%'
  },
  row:
  {
    flexDirection:'row',
    borderColor:'grey',
    borderBottomWidth:'0.05px',
    marginBottom:'10px'
    
  },
  Text:
  {
    color:'white',
    borderBottomColor:'white',
    fontSize:'20px',
    textShadowColor:'grey'
    }

}
);

import react from 'react';
import React from 'react';
import { Alert, Button, StyleSheet, Text, View } from 'react-native';


export default class  App extends react.Component 
{
  do_alert()
  {
   Alert.alert('Button Clicked!');
   alert('Button Clicked!');
  }
 render(){
   return(
     <View  style={styles.container}>
       <View style={styles.Button}>
       <Button
       style={styles.Button}
       title="Click!"
       onPress={this.do_alert}
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
  },
  Button :{
    width:'200px'
  }
});

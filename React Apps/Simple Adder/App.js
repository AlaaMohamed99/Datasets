import * as React from 'react';
import {useState, state} from 'react';
import {Appbar,TextInput} from 'react-native-paper'
import { Button, Text, View, Alert, TouchableOpacity, Image} from 'react-native';
import styles from './styles.js'





export default function App()
{
  const [text1, setText1] = React.useState(false);
  const [text2, setText2] = React.useState(false);
  const [text3, setText3] = React.useState(false);
  const onPress= ()=>
{
    setText3(Number(text1)+Number(text2));
}
    return (
      
        <View style={styles.container}>
          <Appbar style={styles.Appbar}>
            Simple Adder
          </Appbar>
          <View style={styles.container}>
            <TextInput
            label="First Number"
            style={styles.textin}
            onChangeText={text1=> setText1(text1)}
            />
             <TextInput
            label="Second number"
            style={styles.textin}
            onChangeText={text2=> setText2(text2)}
            />
            <View style={styles.Button}>
          <Button
            onPress={()=>onPress()}
            title="Calculate"
          />
          <Text style={styles.textout}>{text3}</Text>
        </View>
        </View> 
        </View>
      );
  
}




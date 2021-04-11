import * as React from 'react';
import {useState, state} from 'react';
import { Button, TextInput, Text, View, Alert, TouchableOpacity} from 'react-native';
import styles from './styles.js'





export default function App()
{
  const [text1, setText1] = React.useState(false);
  const [text2, setText2] = React.useState(false);
  const [text3, setText3] = React.useState(false);
  const onPress= (a,b,text3)=>
{
    setText3(Number(a)+Number(b));
}
    return (
      
        <View style={styles.container}>
            <TextInput
            label="First number"
            style={styles.textin}
            onChangeText={(text1=> setText1(text1))}
            />
             <TextInput
            label="Second number"
            style={styles.textin}
            onChangeText={text2=> setText2(text2)}
            />
            <View style={styles.Button}>
          <Button
            onPress={()=>onPress(text1,text2,text3)}
            title="Calculate"
            color="#000000"
          />
          <Text style={styles.textout}>{text3}</Text>
        </View>
        </View> 
      );
  
}




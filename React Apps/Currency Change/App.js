import * as React from 'react';
import useState from 'react'
import { Button, TextInput, Text, View, Alert, StyleSheet} from 'react-native';

export default function App()
{
  
  const[EGP, setEGP] = React.useState("");
  const[USD, setUSD] = React.useState("");
  const buttonClickListner = (USD)=> 
  {
    let ans = Number(USD)*15.7;
    if(USD==="")setEGP("");
    else setEGP(USD+" USD equal "+ ans+" EGP");
  }
  const Input1 = ()=>
  {
    USD => setUSD(USD);
  }
    return (

        <View style={styles.container}>
           <View>
             <Text>Currency Calc.</Text>
             </View>
            <TextInput
            placeholder="doddoad"
            style={styles.textin}
             onChangeText={USD =>setUSD(USD)}
            />
            <Text style={styles.textout}>{EGP}</Text>
            <View style={styles.Button}>
          <Button
            onPress={()=>buttonClickListner(USD)}
            title="Convert to EGP"
            color="#800080"
          />
        </View>
        </View> 
      );
  }

const styles = StyleSheet.create({
  container:{
    backgroundColor:'#2196F3',  //background-color: #2196F3 
    flex: 1                    
  },
  Button: {
    marginTop: 10,    //margin-top: 10px
    alignSelf:'center',
    padding: 25,   
    width: '100%',
    height:100
  },
  textin:{
    marginTop:200,
    marginBottom:10,
    marginLeft:70,
    marginRight:70,
    backgroundColor:'#D6BEBE'
  },
  textout:{
    backgroundColor:'#03A9F4',
    marginTop:10,
    marginLeft:70,
    textAlign:'center',    //text-align: center
    marginRight:70,
  }
});



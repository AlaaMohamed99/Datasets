import * as React from 'react';
import useState from 'react';
import {Appbar} from 'react-native-paper'
import { Button, TextInput, Text, View, Alert, StyleSheet, SafeAreaView} from 'react-native';


 

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
      <SafeAreaView>
      <Appbar.Header>
           <Appbar>Currency Calculation</Appbar>
        </Appbar.Header>
        <View style={styles.container} >
          <View  style={styles.textin}>
            <TextInput
            placeholder="Enter in USD"
             onChangeText={USD =>setUSD(USD)}
            />
            </View>
            <Text style={styles.textout}>{EGP}</Text>
            <View style={styles.Button}>
          <Button
            onPress={()=>buttonClickListner(USD)}
            title="Convert to EGP"
            color="purple"
          />
        </View>
        </View>
        </SafeAreaView>

      );
  }

const styles = StyleSheet.create({
  GradContainer:{
    backgroundColor:'#2196F3',  //background-color: #2196F3
    flex: 1,
    justifyContent:'center',
    alignItems:'center'
  },
  container:
  {
    backgroundColor:'#2196F3',  //background-color: #2196F3
    flex: 1,
  },
  Button: {
    marginTop: '10px',    //margin-top: 10px
    alignSelf:'center',
    width: 'fit-content',
    height: '20px',
    marginBottom:'300px',
    backgroundColor:'purple'
  },
  textin:{
    alignSelf:'center',
    width:'200px',
    marginTop:'200px',
    backgroundColor:'#D6BEBE'
  },
  textout:{
    backgroundColor:'#03A9F4',
    marginTop:'10px',
    marginLeft:'70px',
    textAlign:'center',    //text-align: center
    marginRight:'70px',
  }
});

import * as React from 'react';
import useState from 'react';
import { Button, TextInput, Text, View, Alert, StyleSheet} from 'react-native';

export default function App()
{
 const [Age, setAge] = React.useState("");
 const [date, setDate] = React.useState("");

 const buttonClickListner = (date)=> 
 {
    let year = new Date();
    let ans = Number(year.getFullYear())-Number(date);
    setAge("your age is "+ans+" years");
    
 }

    return (
        <View style={styles.container}>
           <View>
             <Text>Age Calc.</Text>
            </View>
            <TextInput
            style={styles.textin}
             onChangeText={Date =>setDate(Date)}
            />
            <Text style={styles.textout}>{Age}</Text>
            <View style={styles.Button}>
          <Button
            onPress={()=>buttonClickListner(date)}
            title="Get Age"
            color="#800080"
          />
        </View>
        </View> 
      );
}
const styles = StyleSheet.create({
  container:{
    backgroundColor:'#2196F3',
    flex: 1
  },
  Button: 
  {
    marginTop: 10,
    alignSelf:'center',
    padding: 25,
    width: '100%',
    height:100
  },
  textin:
  {
    marginTop:'200px',
    marginBottom:'10px',
    marginLeft:'70px',
    marginRight:'70px',
    backgroundColor:'#D6BEBE'
  },
  textout:{
    backgroundColor:'#03A9F4',
    marginTop:'10px',
    marginLeft:'70px',
    textAlign:'center',
    marginRight:'70px',
  }
});



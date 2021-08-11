import * as React from 'react';
import useState from 'react';
import { Button, TextInput, Text, View, Alert, StyleSheet} from 'react-native';

export default class App extends React.Component
{
 state=
 {
   Age:"",
   date:0,
 }

 buttonClickListner = ()=>
 {
    let year = new Date();
    let ans = String(Number(year.getFullYear())-Number(this.state.date));
    this.setState({Age:"your age is "+ans+" years"}) 
 }
 setDate = date=>{this.setState({date})}
render()
{
    return (
        <View style={styles.container}
        onMouseMove = { (e)=> {console.log(e.nativeEvent)}}
        >
           <View
           onMouseMove = { (e)=> {console.log(e.nativeEvent)}}
           >
             <Text 
            onMouseMove = { (e)=> {console.log(e.nativeEvent)}}
             >Age Calc.</Text>
            </View>
            <TextInput
            onMouseMove = { (e)=> {console.log(e.nativeEvent)}}
            style={styles.textin}
            value={this.state.date}
             onChangeText={this.setDate}
            />
            <Text style={styles.textout}
            onMouseMove = { (e)=> {console.log(e.nativeEvent)}}
            >{this.state.Age}</Text>
            <View style={styles.Button}>
          <Button
             onMouseMove = { (e)=> {console.log(e.nativeEvent)}}         
            onPress={this.buttonClickListner}
            title="Get Age"
            color="#800080"
          />
        </View>
        </View> 
      );
    }
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



import * as React from 'react';
import { Button, TextInput, Text, View, Alert, StyleSheet} from 'react-native';

export default class App extends React.Component{
  state = {
      USD: "",
      EGP: "",
      fullWord:""
    };

  buttonClickListner = e => {
    var ans = (Number(this.state.USD)*15.7);
    this.setState({EGP:parseFloat(ans)});
    this.setState({fullWord:this.state.USD+" USD equal "+this.state.EGP+" EGP"})
  };

  render() {
    const { name, showName } = this.state;
    return (
      
        <View style={styles.container}>
           <View><Text>Age Calc.</Text></View>
            <TextInput
            style={styles.textin}
             onChangeText={val => {
              this.setState({
                USD: val
              });
            }}
            />
            <Text style={styles.textout}>{this.state.fullWord}</Text>
            <View style={styles.Button}>
          <Button
            onPress={this.buttonClickListner}
            title="Convert to EGP"
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
  Button: {
    marginTop: 10,
    marginRight:100,
    marginLeft:130,
    padding: 25,
    width: 150,
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
    textAlign:'center',
    marginRight:70,
  }
});



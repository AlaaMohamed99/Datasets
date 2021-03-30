import * as React from 'react';
import { Button, TextInput, Text, View, Alert, StyleSheet} from 'react-native';

export default class App extends React.Component{
  state = {
      Age: "",
      x : new Date().getFullYear().toString(),
      name: 0,
      fullWord:""
    };

  buttonClickListner = e => {
    var ans = Number(this.state.x)-this.state.name;
    this.setState({Age:ans.toString(10)});
    this.setState({fullWord:"your age is "+this.state.Age+" years"})
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
                name: val
              });
            }}
            />
            <Text style={styles.textout}>{this.state.fullWord}</Text>
            <View style={styles.Button}>
          <Button
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



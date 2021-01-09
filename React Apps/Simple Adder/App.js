import * as React from 'react';
import { Button, TextInput, Text, View, Alert, StyleSheet, TouchableOpacity} from 'react-native';
export default class App extends React.Component{
  state = {
      FirstNumber: 0,
      SecondNumber:0,
      fullWord:""
    };

  buttonClickListner = e => {
    var ans = Number(this.state.FirstNumber)+Number(this.state.SecondNumber);
    this.setState({fullWord:"Answer is : "+ans.toString(10)})
  };

  render() {
    const { name, showName } = this.state;
    return (
      
        <View style={styles.container}>
            <TextInput
            title="First number"
            style={styles.textin}
             onChangeText={val => {
              this.setState({
                FirstNumber: val
              });
            }}
            />
             <TextInput
            label="Second number"
            style={styles.textin}
             onChangeText={val => {
              this.setState({
                SecondNumber: val
              });
            }}
            />
            <View style={styles.Button}>
          <Button
            onPress={this.buttonClickListner}
            title="Calculate"
            color="#000000"
          />
          <Text style={styles.textout}>{this.state.fullWord}</Text>
        </View>
        </View> 
      );
  }
}
const styles = StyleSheet.create({
  img:{
    width:300,
    height:300
  },
  container:{
    justifyContent: 'center',
    alignItems: 'center',
    flex: 1
  },
  Button: {
    alignSelf:'center',
    alignContent:'center',
    padding: 25,
    width: 200,
    height:100
  },
  textin:{
    alignSelf:'center',
    alignContent:'center',
    borderTopLeftRadius:2,
    borderTopRightRadius:2,
    borderBottomLeftRadius:2,
    borderBottomRightRadius:2,
    borderLeftWidth:0.2,
    borderRightWidth:0.2,
    borderTopWidth:0.2,
    borderBottomWidth:0.2,
    margin:5,
    height:25,
    width:275,
  },
  textout:{
    alignSelf:'center',
    alignContent:'center',
    margin:5,
    height:25,
    width:275,
    textAlign:'center',
  },
});



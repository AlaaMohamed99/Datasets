import * as React from 'react';
import { Button, TextInput, Text, View, Alert, TouchableOpacity} from 'react-native';
import styles from './styles.js'
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




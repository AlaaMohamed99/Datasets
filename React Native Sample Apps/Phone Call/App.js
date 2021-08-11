// Example to Make a Phone Call in React Native App
// https://aboutreact.com/example-to-make-a-call-from-the-react-native-app/

// import React in our code
import React from 'react'
import {Component, useState} from 'react';

// import all the components we are going to use
import {
  SafeAreaView,
  StyleSheet,
  View,
  Text,
  TouchableOpacity,
  TextInput,
  Alert,
} from 'react-native';
import {Appbar} from 'react-native-paper'

// import Call API
import call from 'react-native-phone-call';

export default  class App extends Component
{

  state = 
  {
    inputValue:'',
  }

  setInputValue = inputValue =>{this.setState({inputValue})}
   triggerCall = () => 
   {
     alert("dick");
    // Check for perfect 10 digit length
    if (this.state.inputValue.length != 11) 
    {
      alert('Please insert correct contact number');
    }
    else
    {
    let  args = {
      number: this.state.inputValue,
      prompt: true,
    };
    let number = this.state.inputValue;
    let prompt = true;
    // Make a call
    call({number,prompt});
    }

  }

  render()
  {
  return (
    <SafeAreaView style={styles.container}>
         <Appbar style={styles.Appbar}>
          Phone Call
        </Appbar>
      <View style={styles.container}>
        <Text style={styles.titleText}>
          Example to Make a Phone Call in React Native App
        </Text>
        <Text style={styles.titleTextsmall}>Enter Conatct Number to Call</Text>
        <TextInput
        onChangeText={this.setInputValue}
          value={ this.state.inputValue}
          placeholder={'Enter Conatct Number to Call'}
          keyboardType="numeric"
          style={styles.textInput}
        />
        <TouchableOpacity
          activeOpacity={0.7}
          style={styles.buttonStyle}
          onPress={this.triggerCall}>
          <Text style={styles.buttonTextStyle}>Make a Call</Text>
        </TouchableOpacity>
      </View>
    </SafeAreaView>
  );
  }
}


const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: 'white',
    padding: 10,
    textAlign: 'center',
  },
  titleText: {
    fontSize: 22,
    textAlign: 'center',
    fontWeight: 'bold',
  },
  titleTextsmall: {
    marginVertical: 8,
    fontSize: 16,
  },
  buttonStyle: {
    justifyContent: 'center',
    marginTop: 15,
    padding: 10,
    backgroundColor: '#8ad24e',
  },
  buttonTextStyle: {
    color: '#fff',
    textAlign: 'center',
  },
  textInput: {
    height: 40,
    borderColor: 'gray',
    borderWidth: 1,
    width: '100%',
    paddingHorizontal: 10,
  },
  Appbar:
  {
    backgroundColor:'purple',
    width:'100%',
    height:'50px',
    color:'white',
    fontWeight:'bold',
    fontSize:'25px'
  }
});

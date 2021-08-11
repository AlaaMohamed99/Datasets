import { StatusBar } from 'expo-status-bar';
import React from 'react';
import {Appbar} from 'react-native-paper'
import { StyleSheet, Text, View,TextInput,Button} from 'react-native';
import {CheckBox} from 'react-native-elements';


export default class App  extends React.Component{
 
  state=
  {
    checked1:false,
    checked2:false,
    username:"",
    output:"",
  }
  onPress = (e) =>
  {
    this.setState({output:"Welcome "+this.state.username})
  }
  SetSelection1 = (e) =>
  {
   this.setState({checked1:!this.state.checked1})
  }
  SetSelection2 = (e) =>
  {
   this.setState({checked2:!this.state.checked2})
  }
  setusername = username => 
  {
    this.setState({username})
  }

  render()
  {
  return (
    <View style={styles.container}
     onMouseMove={(e)=>{console.log(e.nativeEvent)}}
    >
      <Appbar style={styles.Appbar}>
       Form with Checkbox
      </Appbar>
     <View style={styles.subcontainer}>
      <View style={styles.InputContainer}>
     <Text>Enter your name</Text>
     <TextInput style={styles.TextInput}
      value={this.state.username}
      onChangeText={this.setusername}
     />
     </View>
     <View style={styles.CheckboxContainer}>
     <CheckBox style={styles.CheckBox}
               checked={this.state.checked2}
               
               onPress={this.SetSelection2}
     />
     <Text style={styles.Text}>Male</Text>
     <CheckBox style={styles.CheckBox}
            checked={this.state.checked1}
            onPress={this.SetSelection1}
     />
     <Text style={styles.Text}>Female</Text>
     </View>
     <View style={styles.Button}>
     <Button style={styles.Button}
      title="Confirm"
      color="purple"
      onPress={this.onPress}
     />
     </View>
     <Text style={styles.outText}>{this.state.output}</Text>
     </View>
     
      </View>
  );
}
};

const styles = StyleSheet.create(
  {
  outText:
  {
   marginLeft:'45px',
   fontSize:'30px',
   color:'purple'
  },
  container: {
    flex: 1,
    backgroundColor: 'white',
  },
  CheckBox:
  {
    marginRight:'15px',
  },
  Appbar:
  {
   backgroundColor:'purple',
   color:'white'
  },
  CheckboxContainer:
  {
    marginTop:'50px',
    marginLeft:'100px',
    flexDirection:'row'
  },
  subcontainer: {
    marginTop:'50px',
    flex: 1,
    backgroundColor: 'white',
  },
  InputContainer:
  {
    flexDirection:'row'
  },
  Button:
  {
    width:'100px',
    marginLeft:'140px',
    marginTop:'50px',
  },
  TextInput:
  {
    color:'black',
    marginLeft:'30px',
    borderBottomWidth:'0.3px',
    borderBottomColor:'blue',
    width:'50%'
  },
  row:
  {
    flexDirection:'row',
    borderColor:'grey',
    borderBottomWidth:'0.05px',
    marginBottom:'10px'
    
  },
  Text:
  {
      marginRight:'40px',
      marginTop:'18px'
  }

}
);


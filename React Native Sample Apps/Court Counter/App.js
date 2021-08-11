import { StatusBar } from 'expo-status-bar';
import React from 'react';
import {useState} from 'react'
import {Appbar} from 'react-native-paper';
import {StyleSheet, Text, TextInput, View, TouchableOpacity,Button } from 'react-native';

export default class CourtCounter extends React.Component
{
  constructor(props)
  {
    super(props);
  }
  state=
  {
    teamA:0,
    teamB:0,
  }
  AddForOneTeamA = ()=>
  {
    this.setState({teamA:this.state.teamA+1})
  }
  AddForOneTeamB= ()=>
  {
    this.setState({teamB:this.state.teamB+1})
  }
  AddForThreeTeamA=()=>
  {
    this.setState({teamA:this.state.teamA+3})
  }
  AddForThreeTeamB=()=>
  {
    this.setState({teamB:this.state.teamB+3})
  }
  ResetAll=()=>
  {
    this.setState({teamA:0})
    this.setState({teamB:0})
  }
  render()
  {
  return (
    <View style={styles.Main} onMouseMove={(e)=>console.log(e.nativeEvent)}>
      <Appbar style={styles.appbar}>My Name is Galkin</Appbar>
    <View style={styles.container}>
    <View style={styles.record_container}>
     <Text style={{marginRight:"50px"}}>Team A: {this.state.teamA}</Text>
     <Text style={{marginLeft:"50px"}}>Team B: {this.state.teamB}</Text>
    </View>
    <View style={styles.record_container}>
      <View style={styles.Button_1}>
      <Button style={styles.Button_1}
      title="Add +1 for A"
      onPress={this.AddForOneTeamA}
      />
      </View>
      <View style={styles.Button_2}>
      <Button 
      title="Add +1 for B"    
      onPress={this.AddForOneTeamB}  
      styles={styles.Button_2}/>
      </View>
    </View>
    <View style={styles.record_container}>
    <View style={styles.Button_1}>
    <Button
    style={styles.Button_1}
    title="Add +3 for A"
    onPress={this.AddForThreeTeamA}
    />
    </View>
    <View style={styles.Button_2}>
    <Button
    style={styles.Button_2}
    title="Add +3 for B"
    onPress={this.AddForThreeTeamB}
    />
    </View>
    </View>
    <View style={styles.sub_container}>
      <Button
      title="clear for All"
      onPress={this.ResetAll}
      />
    </View>
    </View>
    </View>
  );
  }
}

const styles = StyleSheet.create(
  {
  sub_container:
  {
    width:'150px',
    marginLeft:'130px',
    marginTop:'70px'
  },
  Button_1:
  {
    marginRight:'10px',
  },
  Button_2:
  {
    marginLeft:'10px',
  },
  record_container:
  {
   flexDirection:'row',
   marginTop:'50px',
   marginLeft:'60px',
  },

  Main: 
  {
    flex: 1,
    backgroundColor: '#fff',
  },
  appbar:
  {
    backgroundColor:'gold',
    width:'100%',
    color:'white',
  },
  container:
  {
    backgroundColor: '#fff',
    marginLeft:'10px',
  }
  
  
});

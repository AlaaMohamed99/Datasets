import {TouchableOpacity} from 'react-native'
import {Text} from 'react-native'
import {Appbar} from 'react-native-paper'
import {View} from 'react-native'
import React from 'react'; 
import {StyleSheet} from 'react-native' ;
export default class App extends React.Component {
 state ={
c_class: '',
} 
constructor(){

super();

 }
 red =() => {
 this.setState({c_class:"red"})
  }
 yellow =() => {
 this.setState({c_class:"yellow"})
  }
 black =() => {
 this.setState({c_class:"black"})
  }
 green =() => {
 this.setState({c_class:"green"})
  }
 
 
 render (){
	 const TouchableOpacity_style = {alignItems:'center',borderRadius:6,display:'inline-block',padding: 10,backgroundColor:'#3880ff',minHeigth:36,minWidth:92,maxWidth:'fit-content',textTransform:'uppercase',letterSpacing:1,paddingRight:15,paddingLeft:15,overflow:'hidden',textAlign:'center',marginTop:4,marginBottom:4,marginLeft:2,marginRight:2,  }
const Appbar_style={height:56,maxHeigth:100,width:'100%'}
const Title_style ={fontSize:20,fontWeight:500,minHeight:23,width:'100%',paddingLeft:20,paddingReight:20} 
const content_100vh = {height:'100vh',} 
return (
 	<View style={{display:'blcok'}}> 
 <View 
>
<Appbar 
 style = {[ Appbar_style,Styles.toolbar_background, ]} >
<Text 
 style = {[ Title_style,Styles.title, ]} >
Change Background
</Text >
</Appbar >
</View >
<View 
 style = {[ content_100vh,{backgroundColor:this.state.c_class} , ]} >
<View 
 style = {[ Styles.center, ]} >
<TouchableOpacity 
onPress= {this.red}  style = {[ TouchableOpacity_style,Styles.equal_width,{backgroundColor:'red'}, ]} >
<Text>Red</Text>
</TouchableOpacity >
<TouchableOpacity 
onPress= {this.yellow}  style = {[ TouchableOpacity_style,Styles.equal_width,{backgroundColor:'yellow'}, ]} >
<Text>Yellow</Text>
</TouchableOpacity >
<TouchableOpacity 
onPress= {this.black}  style = {[ TouchableOpacity_style,Styles.equal_width,{backgroundColor:'black'}, ]} >
<Text>Black</Text>
</TouchableOpacity >
<TouchableOpacity 
onPress= {this.green}  style = {[ TouchableOpacity_style,Styles.equal_width,{backgroundColor:'green'}, ]} >
<Text>Green</Text>
</TouchableOpacity >
</View >
</View >
	</View>
  );
} 
}const Styles = StyleSheet.create({
center:{
height:'100%',
display:'flex',
flexDirection:'column',
justifyContent:'center',
alignItems:'center',
},
toolbar_background:{
backgroundColor:'rgb(99,19,145)',
color:'white',
},
equal_width:{
width:'20%',
},
content_background:{
backgroundColor:'rgb(238,88,18)',
},

});
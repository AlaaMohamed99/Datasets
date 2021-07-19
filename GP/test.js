import {TextInput} from 'react-native'
import {TouchableOpacity} from 'react-native'
import {Text} from 'react-native'
import {Appbar} from 'react-native-paper'
import {View} from 'react-native'
import React from 'react'; 
import {StyleSheet} from 'react-native' ;
export default class App extends React.Component {
 render (){
	 const TouchableOpacity_style = {alignItems:'center',borderRadius:6,display:'inline-block',padding: 10,backgroundColor:'#3880ff',minHeigth:36,minWidth:92,maxWidth:'fit-content',textTransform:'uppercase',letterSpacing:1,paddingRight:15,paddingLeft:15,overflow:'hidden',textAlign:'center',marginTop:4,marginBottom:4,marginLeft:2,marginRight:2,  }
const TextInput_style={ flex:0,minHeight:38,width:'100%',display:'block',paddingTop:10,paddingBottom:10,paddingLeft:8 }
const Appbar_style={height:56,maxHeigth:100,width:'100%'}
const Tilte_style ={fontSize:20,fontWeight:500,minHeight:23,width:'100%',paddingLeft:20,paddingReight:20} 
const content_100vh = {height:'100vh',} 
return (
 	<View style={{display:'blcok'}}> 
 <View 
>
<Appbar 
 style = {[ Appbar_style,Styles.toolbar_background, ]} >
<Text 
 style = {[ Tilte_style,Styles.title, ]} >
Change Background
</Text >
</Appbar >
</View >
<View 
 style = {[ content_100vh,{backgroundColor:this.state.c_class} , ]} >
<Text 
 style = {[ this.test_class_binding, ]} >
color is orange
</Text >
<View 
 style = {[ Styles.center, ]} >
<TouchableOpacity 
disabled = {this.test_other_binding? true:flase} onPress= {this.red}  style = {[ TouchableOpacity_style,Styles.red, ]} >
<Text>Red</Text>
</TouchableOpacity >
<TouchableOpacity 
onPress= {this.yellow}  style = {[ TouchableOpacity_style,Styles.yellow, ]} >
<Text>Yellow</Text>
</TouchableOpacity >
<TouchableOpacity 
onPress= {this.black}  style = {[ TouchableOpacity_style,Styles.black, ]} >
<Text>Black</Text>
</TouchableOpacity >
<TouchableOpacity 
onPress= {this.green}  style = {[ TouchableOpacity_style,Styles.green, ]} >
<Text>Green</Text>
</TouchableOpacity >
</View >
<TextInput 
onChange= {this.ionchange}  style = {[ TextInput_style, ]} />
</View >
	</View>
  );
} 
}
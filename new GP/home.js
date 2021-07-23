import {TouchableOpacity} from 'react-native'
import {TextInput} from 'react-native'
import {Text} from 'react-native'
import {Appbar} from 'react-native-paper'
import {View} from 'react-native'
import React from 'react'; 
import {StyleSheet} from 'react-native' ;
export default class App extends React.Component {
 state ={
year: '',
} 
Age =() => {
 let age=2021-this.state.year ;
 
 if( !isNaN(age)
    ){
 return age
  }
 else { 
 }
 
handleChangeOfyear=(event)=>{
this.setState({year: event.target.value});
 }
 
 render (){
	 const TouchableOpacity_style = {alignItems:'center',borderRadius:6,display:'inline-block',padding: 10,backgroundColor:'#3880ff',minHeigth:36,minWidth:92,maxWidth:'fit-content',textTransform:'uppercase',letterSpacing:1,paddingRight:15,paddingLeft:15,overflow:'hidden',textAlign:'center',marginTop:4,marginBottom:4,marginLeft:2,marginRight:2,  }
const TextInput_style={ minHeight:38,width:'100%',display:'block',paddingTop:10,paddingBottom:10,paddingLeft:8 }
const Appbar_style={height:56,maxHeigth:100,width:'100%'}
const Title_style ={fontSize:20,fontWeight:500,minHeight:23,width:'100%',paddingLeft:20,paddingReight:20} 
const content_100vh = {height:'100vh',} 
return (
 	<View style={{display:'blcok'}}> 
 <View 
>
<Appbar 
 style = {[ Appbar_style,Styles.toolbar, ]} >
<Text 
 style = {[ Title_style, ]} >
Agg Calc.
</Text >
</Appbar >
</View >
<View 
 style = {[ content_100vh,Styles.content_background, ]} >
<View 
 style = {[ Styles.center, ]} >
<TextInput
placeholder= "Year of Your Birth"value={this.state.year}
onChange={(event)=>this.handleChangeOfyear(event)} style = {[ TextInput_style,Styles.age_input, ]} />
<TouchableOpacity 
 style = {[ TouchableOpacity_style, ]} >
<Text>Get Age</Text>
</TouchableOpacity >
</View >
</View >
	</View>
  );
} 
}
test typescript file const Styles = StyleSheet.create({
center:{
display:'flex',
justifyContent:'center',
alignItems:'center',
flexDirection:'column',
alignContent:'center',
backgroundColor:'rgb(52,168,207)',
marginTop:'50%',
},
content_background:{
backgroundColor:'rgb(52,168,207)',
display:'flex',
alignContent:'center',
},
age_input:{
marginTop:20 ,
display:'flex',
alignContent:'center',
textAlign:'center',
backgroundColor:'rgb(221,191,191)',
width:'50%',
},
toolbar:{
backgroundColor:'rgb(131,9,245)',
},

});
import {TouchableOpacity} from 'react-native'
import {RadioButton} from 'react-native-paper'
import {TextInput} from 'react-native'
import {Text} from 'react-native'
import {Appbar} from 'react-native-paper'
import {View} from 'react-native'
import React from 'react'; 
import {StyleSheet} from 'react-native' ;
export default class App extends React.Component {
 
 
 render (){
	 const TouchableOpacity_style = {alignItems:'center',borderRadius:6,display:'inline-block',padding: 10,backgroundColor:'#3880ff',minHeigth:36,minWidth:92,maxWidth:'fit-content',textTransform:'uppercase',letterSpacing:1,paddingRight:15,paddingLeft:15,overflow:'hidden',textAlign:'center',marginTop:4,marginBottom:4,marginLeft:2,marginRight:2,  }
const radio_btn_style ={flexDirection:'row'}
const TextInput_style={ minHeight:38,width:'100%',display:'block',paddingTop:10,paddingBottom:10,paddingLeft:8 }
const ionItem_style={borderBottomWidth:1,paddingRight:20,paddingLeft:20, alignSelf:'stretch',alignItems:'center',flexDirection:'row',justifyContent:'center',minHeight:48,minWidth:'fit-content'  }
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
Form with radiobutton
</Text >
</Appbar >
</View >
<View 
 style = {[ content_100vh, ]} >
<View 
 style = {[ ionItem_style, ]} >
<Text 
>
User Name
</Text >
<TextInput
 style = {[ TextInput_style, ]} />
</View >
<View 
 style = {[ ionItem_style, ]} >
<Text 
>
Password
</Text >
<TextInput
secureTextEntry style = {[ TextInput_style, ]} />
</View >
<View 
>
<View 
 style = {[ radio_btn_style, ]} >
<Text 
>
Male
</Text >
<RadioButton 
value= "Male" 
onPress={()=> this.setState({:"Male"})}
status ={this.state.== "Male" ? 'checked':'unchecked'} />
</View >
<View 
 style = {[ radio_btn_style, ]} >
<Text 
>
Female
</Text >
<RadioButton 
value= "Female" 
onPress={()=> this.setState({:"Female"})}
status ={this.state.== "Female" ? 'checked':'unchecked'} />
</View >
</View >
<TouchableOpacity 
 style = {[ TouchableOpacity_style, ]} >
<Text>Confirm</Text>
</TouchableOpacity >
</View >
	</View>
  );
} 
}const Styles = StyleSheet.create({
toolbar:{
backgroundColor:'#488aff',
},
btn_color:{
backgroundColor:'gray',
width:'100%',
},
radio:{
display:'inline-block',
width:'50%',
},

});
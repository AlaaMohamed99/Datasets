import { StyleSheet } from 'react-native';

export default  StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#000',
    alignItems: 'center',
    justifyContent: 'center',
  },
  text:{
    fontWeight:'bold'
  },
  checkboxContainer:
  {
    flexDirection:'row',
    margin:10,
    marginRight:35
  },
  checkbox:{
    marginRight:20,
    marginLeft:20
  },
  button:
  {
    alignSelf:'stretch',
    backgroundColor:"#e6e6fa",
    height:30,
    borderRadius:5
    
  },
  buttontext:{
    alignSelf:'center',
    color:'white'
  },
  text:{
    color:'black',
    fontWeight:'normal',
    alignSelf:'center'
  },
  InputContainer:
  {
    size:30,
    alignSelf:'center',
    flexDirection:'column',
    margin:3,
    backgroundColor:'#e6e6fa',
    width:300,
    height:30
  }
});
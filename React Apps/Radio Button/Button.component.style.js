import { StyleSheet } from 'react-native';

export default  StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#FFF',
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
    marginRight:35,
  },
  checkbox:{
    marginRight:'30px',
    marginLeft:'30px',
  },
  button:
  {
    width:"100%",
    backgroundColor:"#e6e6fa",
    height:30,
    borderRadius:5
    
  },
  buttontext:{
    alignSelf:'center',
    fontWeight:'bold',
    color:'black'
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
    backgroundColor:'#FFF',
    borderBottomWidth:'0.5px',
    borderTopWidth:'0.5px',
    borderRightWidth:'0.5px',
    borderLeftWidth:'0.5px', 
    borderColor:'grey',
    borderRadius:'0.8px',
    borderStyle:'solid',
    width:"300px",
    height:'30px'
  },
  Appbar:
  {
    backgroundColor:'#1e90ff',
    height:'30px',
    marginBottom:'30px',
    color:'white',
    fontWeight:'normal'
  }
});
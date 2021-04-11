import {StyleSheet} from 'react-native'

export default StyleSheet.create({
  container:{
    justifyContent: 'center',
    alignItems: 'center',
    flex: 1
  },
  Button: {
    alignSelf:'center',
    alignContent:'center',
    padding: 25,
    width: '200px',
    height:100
  },
  textin:{
    alignSelf:'center',
    alignContent:'center',
    borderTopLeftRadius:'1px',
    borderTopRightRadius:'1px',
    borderBottomLeftRadius:'1px',
    borderBottomRightRadius:'1px',
    borderLeftWidth:'1px',
    borderRightWidth:'1px',
    borderTopWidth:'1px',
    borderBottomWidth:'1px',
    margin:'5px',
    height:'25px',
    width:'275px',
  },
  textout:{
    alignSelf:'center',
    alignContent:'center',
    margin:'5px',
    height:'25px',
    width:'275px',
    textAlign:'center',
  },
});
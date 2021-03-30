import { StyleSheet } from 'react-native';

export default StyleSheet.create({
    container: {
      flex: 1,
      backgroundColor: '#1e90ff',
      alignItems: 'center',
      justifyContent:'center'
    },
    rowContainer: {
      flexDirection:'row',
      margin:10,
    },
    input1:
    {
      marginRight:10,
      borderBottomWidth: 1,
      width:100
    },
    input2:
    {
      marginLeft:10,
      borderBottomWidth:1,
      width:100
    },
    button:{
      alignSelf:'center',
      alignContent:'center',
      backgroundColor:"#8b008b",
      height:38,
      width:100,
      marginTop:15,
    },
    text:
    {
      alignSelf:'center',
      color:'yellow',
      fontSize:20,
      marginLeft:10,
      marginRight:10,
      fontWeight:'bold'
    },
    text_:
    {
      alignSelf:'center',
      color:'white',
      fontSize:20,
      marginLeft:10,
      marginRight:10,
      fontWeight:'bold'
    },
    result:{
      alignSelf:'center',
      margin:15
    }
  });
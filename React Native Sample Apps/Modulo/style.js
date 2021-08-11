import {StyleSheet} from 'react-native'

export default StyleSheet.create({
  container: {
    flex: 1,
  },
  Main:
  {
    display:'flex',
    flex: 1,
    backgroundColor: '#1e90ff',
    alignItems: 'center',
    justifyContent:'center'
  },
  Appbar:
  {
    backgroundColor:'purple',
    width:'100%',
    height:'50px',
    color:'white',
    fontWeight:'bold',
    fontSize:'25px'
  },
  rowContainer: {
    display:'flex',
    flexDirection:'row',
    margin:'10px',
  },
  input1:
  {
    marginRight:'10px',
    borderBottomWidth: '1px',
    width:'100px'
  },
  input2:
  {
    marginLeft:'10px',
    borderBottomWidth:'1px',
    width:100
  },
  button:{
    alignSelf:'center',
    alignContent:'center',
    backgroundColor:"purple",
    height:'38px',
    width:'100px',
    marginTop:'15px',
  },
  text:
  {
    alignSelf:'center',
    color:'yellow',
    fontSize:'20px',
    marginLeft:'10px',
    marginRight:'10px',
    fontWeight:'bold'
  },
  text_:
  {
    alignSelf:'center',
    color:'white',
    fontSize:'20px',
    marginLeft:'10px',
    marginRight:'10px',
    fontWeight:'bold'
  },
  result:{
    alignSelf:'center',
    margin:'15px'
  }
});

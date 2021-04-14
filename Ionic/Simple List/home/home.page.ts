import { not } from '@angular/compiler/src/output/output_ast';
import { Component, ViewChild } from '@angular/core';
import { IonItemOption, IonItemOptions, IonList } from '@ionic/angular';
import { Button } from 'protractor';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})

export class HomePage {

  t=document.getElementById('test');
  t2=document.getElementById('testid');  
  constructor() {}
   
  /** adder */ 
  public inp1:number;
  public inp2:number;
  public res:number;
  add(){
       this.res =this.inp1 + this.inp2; 
    }

  /** END adder */ 



  /* checkbox*/

   
   change_value(v){
      let value = v.detail.value;
      let checked_value = v.detail.checked;
      console.log(value,checked_value,v.detail);
      this.check(checked_value,value); 
   }

   cheked_value="" //

   //check if the checkbox is selected
   check(checked,value){
      if (checked == true){
        this.cheked_value= value+ " checked"
      }
      if (checked == false){
        this.cheked_value= value+ " not checked"
      }
  }
  /* END checkbox*/



  /* currency */
  //app currency 
  currency : number ;
  currency_EGP : number ;



  // test_interpolatioon = 5 + 6 ;
  // orange = "orange" ;
  // classtesting = "classtest" ;


  convert(){
    this.currency_EGP = this.currency * 16;
  }
  /* currency */


  /* chnage background color*/ 
  c_class='';

  red(){
      this.c_class="red";
  }
  yellow(){
    this.c_class="yellow";

  }
    black(){
    this.c_class="black";

  }
    green(){
    this.c_class="green";
  }
  /* chnage background color*/ 





  // test() {
  //   console.log("button clicked")
  // }
  // test2() {
  //   console.log("fab clicked")
  // }

  // call()
  // { 
    
  //   console.log("call")
  // }
  // test_button(){
    
  //   console.log( document.querySelector('ion-button').type );
  //   console.log(this.t);
  // }

  // getContent() {
  //   return document.querySelector('ion-content');
  // }
   
  //  scrollToBottom() {
  //   this.getContent().scrollToBottom(500);
    
    
  // }

  // scrollToTop() {
  //   this.getContent().scrollToTop(400);
  // }


}

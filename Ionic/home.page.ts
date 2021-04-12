import { Component } from '@angular/core';

// represents meta data of the class (componenet) which is the home page 
@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage 
{

  constructor() {}

  c_class="green";

  
  //app3 kotlin
  currency : number ;
  currency_EGP : number ;

  test_interpolatioon = 5 + 6 ;
  orange = "orange" ;
  classtesting = "classtest" ;


  convert(){
    this.currency_EGP = this.currency * 16;
  }

  clicked()
  {
    window.alert("Button clicked!") 
  }


  // app3 kotlin 
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
}

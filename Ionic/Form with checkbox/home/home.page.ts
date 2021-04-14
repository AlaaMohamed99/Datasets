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
   

  
  /* checkbox*/

  // V is $event 
  change_value(v){
    let value = v.detail.value;
    let checked_value = v.detail.checked;
    this.check(checked_value,value); 
 }

 cheked_value="" // will assign a value which will be displayed in html

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


}

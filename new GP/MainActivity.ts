import { not } from '@angular/compiler/src/output/output_ast';
import { Component, ViewChild } from '@angular/core';
import { IonItemOption, IonItemOptions, IonList } from '@ionic/angular';
import { isNumber } from 'util';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'], 
})

export class HomePage {
  c_class='';
  
  constructor() {}
age:number;
currentyear:number;
yearofbirth:number;


button1(){
currentyear=Calendar.getInstance().get(Calendar.YEAR);

this.age = this.currentyear - this.yearofbirth
}



}
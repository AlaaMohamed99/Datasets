import { Component, ViewChild } from '@angular/core';
import { IonItemOption, IonItemOptions, IonList } from '@ionic/angular';
import { Button } from 'protractor';



@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})

export class HomePage {

  constructor() {}
  public inp1:number;
  public inp2:number;
  public res:number;
  
   add(){
       this.res =this.inp1 + this.inp2; 
    }
    

}

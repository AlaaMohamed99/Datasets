import { Component, ViewChild } from '@angular/core';
import { IonItemOption, IonItemOptions, IonList } from '@ionic/angular';
import { Button } from 'protractor';

@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})

export class HomePage {

  c_class='';
  
  constructor() {}

    /* chnage background color*/ 
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


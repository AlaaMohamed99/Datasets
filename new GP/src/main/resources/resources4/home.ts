import { Component, ViewChild } from '@angular/core';
import { IonItemOption, IonItemOptions, IonList } from '@ionic/angular';
import { Button } from 'protractor';

export class HomePage {

  c_class='';

  constructor() {}
  currency : number ;
  currency_EGP : number ;

  convert(){
    this.currency_EGP = this.currency * 16;
  }
}


import { not } from '@angular/compiler/src/output/output_ast';
import { Component, ViewChild } from '@angular/core';
import { IonItemOption, IonItemOptions, IonList } from '@ionic/angular';
import { Button } from 'protractor';

export class HomePage {
  result:number;
  modulus_inp1:number;
  modulus_inp2:number;

  modulu(){
    this.result = this.modulus_inp1 % this.modulus_inp2;
  }


}

import { Component, ViewChild } from '@angular/core';
import { IonItemOption, IonItemOptions, IonList } from '@ionic/angular';
import { Button } from 'protractor';

export class HomePage {
  constructor() {}
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
  }
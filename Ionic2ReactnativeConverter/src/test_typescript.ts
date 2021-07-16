export class HomePage {
result:number;
  modulus_inp1:number;
  modulus_inp2:number;

  modulu(){
    this.result = this.modulus_inp1 % this.modulus_inp2;
  }
}
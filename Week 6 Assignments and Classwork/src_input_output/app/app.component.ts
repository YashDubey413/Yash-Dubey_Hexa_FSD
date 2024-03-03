import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webapp';

  parentMessage:string="Hello mera beta";
  age:number=22;


  childDataReceived='';
  getChildData(data:any){

    console.log(data);
    this.childDataReceived = data;

  }

  childNameReceived='';
  getChildName(data:any){

    console.log(data);
    this.childNameReceived = data;

  }
}

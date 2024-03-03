import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webapp';

  num1=0;

  tech="";

  arr: number[]=[1,2,3];

  textColor='red';

  bgColor='blue';

  isSpecial:boolean=false;

}

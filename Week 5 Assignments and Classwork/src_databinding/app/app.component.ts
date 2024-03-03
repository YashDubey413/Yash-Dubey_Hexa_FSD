import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webapp';

  username:string="yash";

  imageURL='../assets/leaf.jpeg'



  getData(){

    alert('getData() is called');
  }


}

import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
user: string='';

constructor(private router:Router){


}

billAmount:number=5000;

doPayment(){

  console.log("navigating to payment component");
  this.router.navigate(['/payment/'+this.billAmount]);

}

}

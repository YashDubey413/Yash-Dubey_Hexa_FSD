import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-payment',
  templateUrl: './payment.component.html',
  styleUrls: ['./payment.component.css']
})
export class PaymentComponent {

amount=0;

  constructor(private route:ActivatedRoute){
    this.route.params.subscribe(params =>this.amount=params['billAmount']);

  }

  ngOninit(){
   
  }

}

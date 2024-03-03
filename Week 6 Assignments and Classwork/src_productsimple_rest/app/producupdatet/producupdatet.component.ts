import { Component } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from '../product/product';

@Component({
  selector: 'app-producupdatet',
  templateUrl: './producupdatet.component.html',
  styleUrls: ['./producupdatet.component.css']
})
export class ProducupdatetComponent {

  constructor(private service:ProductService){

  }

  upadateProductById(data:Product){
    this.service.updateProductById(data);

  }

}

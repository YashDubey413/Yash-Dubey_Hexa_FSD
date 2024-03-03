import { Component } from '@angular/core';
import { Product } from '../product/product';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrls: ['./addproduct.component.css']
})
export class AddproductComponent {

constructor(private service:ProductService){

}

  addProduct(data:Product){
    this.service.insertProduct(data);

  }

}

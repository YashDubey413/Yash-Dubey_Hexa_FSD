import { Component } from '@angular/core';
import { ProductService } from '../product.service';
import { Product } from './product';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent {

constructor(private productService: ProductService){

}

productList:Product[]=[];

productNameList:Product[]=[];

  getAllProduct(){

    this.productService.getAll()
    .subscribe(product=>{
      this.productList=product
      console.log(product);
      
    });
  }

  deleteById(id:number){
    this.productService.deleteProductById(id);
      
  }

  // productName:string='';

  getAllProductByName(productName:any){
    this.productService.getAllByName(productName)
  .subscribe(product=>{this.productNameList=product
    console.log(product);
    
  });

  }
}

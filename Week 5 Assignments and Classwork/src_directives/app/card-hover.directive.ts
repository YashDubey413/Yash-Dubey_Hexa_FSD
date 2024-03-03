import { Directive, ElementRef, Renderer2 } from '@angular/core';
import { HostListener } from '@angular/core';


@Directive({
  selector: '[appCardHover]'
})
export class CardHoverDirective {

  constructor(private el:ElementRef,private renderer:Renderer2) {

    renderer.setStyle(el.nativeElement,'background','gray')
   }

   @HostListener('mouseover') onMouseOver(){

    // let part=this.el.nativeElement.querySelector('card-text')
    // this.renderer.setStyle(this.e1.nativeElement,'background','yellow')
    alert('mouse is over context');

    this.renderer.setStyle(this.el.nativeElement,'background','red');
    //this.renderer.setStyle(this.el.nativeElement.querySelector('card-text'),'background','yellow');
  }


}




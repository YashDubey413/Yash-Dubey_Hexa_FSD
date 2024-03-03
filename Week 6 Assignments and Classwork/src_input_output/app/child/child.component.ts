import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {

  @Input()
  myInput:string='';

  @Input()
  myage:number=0;

  ngOnInit(){
    console.log("Child got this data: "+this.myInput);
    
  }

  @Output()
  myEventEmitter:EventEmitter<string>=new EventEmitter();

  myOutput:string='Hello Papa I am child';

  sendChildData(){

    this.myEventEmitter.emit(this.myOutput);
  }

  @Output()
  myEventEmitter1:EventEmitter<string>=new EventEmitter();

  childName='yash';

  sendChildName(){
    this.myEventEmitter1.emit(this.childName);
  }

  }





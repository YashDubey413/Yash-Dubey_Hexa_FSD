import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactivepractice',
  templateUrl: './reactivepractice.component.html',
  styleUrls: ['./reactivepractice.component.css']
})
export class ReactivepracticeComponent implements OnInit{
 
 registerForm !:FormGroup;

 submitted=false;

 constructor(private formbuilder:FormBuilder){

 }
  ngOnInit(){
   this.registerForm=this.formbuilder.group({
    empFirstName:['',[Validators.required,Validators.minLength(3)]],
    empLastName:['',[Validators.required,Validators.pattern('[A-Z][a-z]{4,10}')]],
    empEmail:['',[Validators.required,Validators.email]],
    empSalary:['',[Validators.required,Validators.min(10000),Validators.max(25000)]]

   });
  }

  get f(){
    return this.registerForm.controls;
  }
  onSubmit(){

    this.submitted=true;
    if(this.registerForm.invalid){
      return;
    }
    alert('Your form has been submitted');
  }



  
}

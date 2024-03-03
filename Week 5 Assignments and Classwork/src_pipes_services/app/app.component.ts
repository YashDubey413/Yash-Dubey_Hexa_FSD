import { Component, OnInit } from '@angular/core';
import { UserService } from './user.service';
import {User} from './user';



@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
  //providers: [UserService]
})
export class AppComponent implements OnInit{
  title = 'webapp';

  
  Object:Object = {'foo':'bar','baz':'dudu','ruk':[1,2,3]};

  userList:User[]=[];

  constructor(private userService: UserService){

    console.log('component class obj created');
    
  }
  ngOnInit(): void {
    console.log('oninit called');
    this.getAll();
    
    
  }

  getAll(){

      this.userList=this.userService.getAllUsers();
  }

}

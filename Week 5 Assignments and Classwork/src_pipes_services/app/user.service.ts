import { Injectable } from '@angular/core';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor() {

    console.log('usr service obj created');
   }

   users:User[] = [{"uid":101,"username":"Yash","email":"yash@gmail.com","address":"Mumbai"},
   {"uid":102,"username":"Kumar","email":"kumar@gmail.com","address":"pune"},
   {"uid":103,"username":"Jaani","email":"jaani@gmail.com","address":"virar"},
   {"uid":104,"username":"Varun","email":"varun@gmail.com","address":"dubai"},
   {"uid":105,"username":"Raj","email":"zuzu@gmail.com","address":"doram"}                  
  ];

   getAllUsers(){
      

    console.log('getallusers() called');
    return this.users;
   }
}

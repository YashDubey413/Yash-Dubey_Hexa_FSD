

class Employee{

 //eid:number=99;
 eid=0;

 ename:string="";

    constructor(){
        console.log("Employee constructor");
    }


    display():string{

        return "Hello Employee";
    }

    display1():void{

    }

    x:any =99;
    //n1:number=this.x  //inplicit
    n1:number=(<number>this.x);  //explicit assertion

}

const employee =new Employee();
employee.eid=101;
employee.ename="Yash";
console.log(employee);

let list=[0,1,"Yash"];
console.log(list);



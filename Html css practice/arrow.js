


function f1(){

    console.log("Hello i in normal function");
}

f1();


const arrow=()=>{               //arrow or anonymous function

    let id=101;
    console.log("Hello i in arrow function");

}

arrow();

//const arrow=()=>{console.log("Modified arrow function");}

//arrow();


function add(a,b=9){

    return a+b;
}

var result=add(4,5);

console.log(result);

console.log(add(3));
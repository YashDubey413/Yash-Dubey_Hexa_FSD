
function printNameAndPlace(name,place){

    console.log(`Hello my name is ${name} and 
    I belong to ${place}`)

}


//console.log(y);

let name1='Yash';

let person={
    name:"Yash",
    age:22
};


//console.log(person.name);
//console.log(person['name']);


let selectedColors=['red','blue','green','yellow'];

console.log(selectedColors[0]);
selectedColors[4]='kaala';
console.log(selectedColors);


printNameAndPlace("yash","Mumbai");


class person1{
    constructor(name,age){
        this.name=name;
        this.age=age;
    }
}
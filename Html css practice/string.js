

var s1="hello \n world";

var s2='yash';

console.log(s1);

var n1=101;

var s3= `this is my para
hula hoop is my passion
My id is ${n1}`;

        console.log(s3);


// spread or rest operator  same as varargs in java

function fun1(name,city,...a1){

    console.log("fun1 executed")
    console.log(name+": "+ city);
    console.log(a1[0]);

}

fun1();
fun1("kumar","sanu");
fun1("yash","Mumbai",2,3,2,1,3);

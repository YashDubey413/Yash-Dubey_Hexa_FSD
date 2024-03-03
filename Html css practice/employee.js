var Employee = /** @class */ (function () {
    function Employee() {
        //eid:number=99;
        this.eid = 0;
        this.ename = "";
        this.x = 99;
        //n1:number=this.x  //inplicit
        this.n1 = this.x; //explicit assertion
        console.log("Employee constructor");
    }
    Employee.prototype.display = function () {
        return "Hello Employee";
    };
    Employee.prototype.display1 = function () {
    };
    return Employee;
}());
var employee = new Employee();
employee.eid = 101;
employee.ename = "Yash";
console.log(employee);
var list = [0, 1, "Yash"];
console.log(list);

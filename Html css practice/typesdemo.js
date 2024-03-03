var Demo = /** @class */ (function () {
    function Demo() {
        console.log("Hello");
    }
    Demo.prototype.f1 = function () {
        console.log("this is 1");
    };
    return Demo;
}());
var d1 = new Demo();
d1.f1();

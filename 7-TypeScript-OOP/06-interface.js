var Calculator = /** @class */ (function () {
    function Calculator(number1, number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    Calculator.prototype.add = function () {
        return this.number1 + this.number2;
    };
    Calculator.prototype.mul = function () {
        return this.number1 * this.number2;
    };
    return Calculator;
}());
var calc = new Calculator(100, 200);
console.log("Sum is " + calc.add());
console.log("Product is " + calc.mul());

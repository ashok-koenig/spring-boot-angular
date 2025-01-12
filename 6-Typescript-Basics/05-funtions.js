function calculate(title, price, quantity, discount) {
    if (quantity === void 0) { quantity = 1; }
    if (discount === void 0) { discount = 0; }
    var totalPrice = (price * quantity) - discount;
    console.log("Total price of product ".concat(title, " is ").concat(totalPrice));
}
calculate("iPhone 15", 23432, 2, 100);
calculate("iPhone 14", 55666);
var sumUp = function () {
    var values = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        values[_i] = arguments[_i];
    }
    var result = 0;
    for (var _a = 0, values_1 = values; _a < values_1.length; _a++) {
        var value = values_1[_a];
        result += value;
    }
    return result;
};
console.log(sumUp(10, 20, 30));

"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Circle = exports.message = void 0;
exports.greet = greet;
exports.message = "This is sample message from module 1";
function greet(name) {
    console.log("Welecome " + name);
}
var Circle = /** @class */ (function () {
    function Circle(radius) {
        this.radius = radius;
        this.PI = 3.14;
    }
    Circle.prototype.area = function () {
        return this.PI * (Math.pow(this.radius, 2));
    };
    return Circle;
}());
exports.Circle = Circle;

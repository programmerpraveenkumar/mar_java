"use strict";
exports.__esModule = true;
var class2_1 = require("./class2");
var class1 = /** @class */ (function () {
    function class1() {
    }
    class1.prototype.printMessage = function () {
        var cls2 = new class2_1.class2();
        console.log("this is class1 ", cls2.printMessage());
    };
    return class1;
}());
var cls1 = new class1();
cls1.printMessage();

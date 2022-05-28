//interface method has to be declared in the class
var Message = /** @class */ (function () {
    function Message() {
    }
    Message.prototype.sayHI = function () {
        console.log("This is hi message for this class");
    };
    return Message;
}());
var message = new Message();
message.sayHI();

// Creating a function using function keyword
function myFunction(message){
    console.log("message variable value: ", message);
    return 'Return value from Function';
}

let returnValue = myFunction("Test Message")

console.log(returnValue)

// Creating expression function
const greet = function (name){
    const greetMessage = `Welcome 
                                to
                                    ${name} 
                                            !`;
    console.log(greetMessage)
}

greet("John")

// Arrow Function
const sum = (num1, num2) => {
    const result = num1 + num2;
    console.log("Sume of two numbers: "+ result)
}

sum(10, 20)

// const multiply = (num1, num2) => {
//     return num1 * num2;
// }

const multiply = (num1, num2) => num1 * num2;

console.log("Multiplied values is:", multiply(10,20))
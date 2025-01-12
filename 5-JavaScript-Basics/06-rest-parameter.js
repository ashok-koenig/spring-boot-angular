// Rest parameters - used to receive infinite number of parameters in a function

const sumUp = (initialValue, ...values) =>{
    // console.log(initialValue, values);    
    let result = initialValue;
    for (const value of values) {
        result +=value;
    }
    return result;
}

// sumUp(1)
// sumUp(0,1)
// sumUp(10,20,30)

console.log(sumUp(1,2,3,4))
console.log(sumUp(10,23,32,42))
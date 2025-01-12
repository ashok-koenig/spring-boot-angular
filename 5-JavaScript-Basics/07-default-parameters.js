function calculate(price, quantity=1, discount){
    return (price * quantity) - discount;
}

console.log(calculate(5, 4, 2))
console.log(calculate(5, undefined , 4))
console.log(calculate(5))
interface ICalculator{
    number1: number;
    number2: number;
    add(): number;
    mul(): number;
}

class Calculator implements ICalculator{

    constructor(public number1: number, public number2: number){
    }

    add(): number {
        return this.number1 + this.number2;
    }
    mul(): number {
        return this.number1 * this.number2;
    }    
}

const calc = new Calculator(100, 200)

console.log("Sum is "+ calc.add());
console.log("Product is "+ calc.mul());


function calculate(title:string, price: number, quantity: number=1, discount: number=0): void {
   const totalPrice = (price * quantity) - discount;
    console.log(`Total price of product ${title} is ${totalPrice}`)
}

calculate("iPhone 15", 23432, 2, 100)

calculate("iPhone 14", 55666)

const sumUp = (...values: number[]): number =>{
    let result = 0;
    for (const value of values) {
        result +=value;
    }
    return result;
}

console.log(sumUp(10,20,30))
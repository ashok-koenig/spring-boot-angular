// Alwary declare array with const keyword

const myArray = [12, 24, 56, 78, 89];

// myArray = 100

// myArray = "Some String"

console.log(myArray)

console.log("First Element: "+ myArray[0])

myArray[2]=65;

console.log(myArray)

console.log("Number of Elements in Array: ", myArray.length )

// push() - Add elements at the end

myArray.push(100)

console.log(myArray)

// pop() - Remove an element at the end

myArray.pop()

console.log(myArray)

// unshift() - Add elements at the begining

myArray.unshift(10);

console.log(myArray)

// shift() - Remove an element from the begining

myArray.shift();

console.log(myArray)

// indexOf() - Search an element in the array, Return the index if its present, otherwise return -1

console.log("78 is at the index: "+ myArray.indexOf(78))

// for/of loop  - Used to iterate array values.

for (const element of myArray) {
    console.log(element)
}
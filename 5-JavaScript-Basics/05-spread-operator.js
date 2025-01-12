const array1 = [1, 2, 3]
// Copy of array1 into array2
// const array2 = array1;
// array2[0]=10
// const array2=[]
// for (const element of array1) {
//     array2.push(element)
// }

// Spread opertor to clone/copy an array into another array
const array2 = [...array1]

array1[0]=10
console.log(array1);
console.log(array2)

// Merge of array
const array3 = [...array1, ...array2]
console.log(array3)

// Spread operator in object
const person1 = {    
    age: 25,
    email: "john@email.com",
    name: "john"
}

const person2 = {...person1}

person1.name = "John Smith"

console.log(person1, person2)

let email= "johnsmith@email.com"

// const person3 = {...person1, email: email}
const person3 = {...person1, email}
console.log(person3)

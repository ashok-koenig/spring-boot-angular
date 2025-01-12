const point = [100, 200, 300]

// const x = point[0]
// const y = point[1]

// De-structuring in Array
// const [x, y, z] = point

// console.log(x, y, z)

const [x, ,z] = point

console.log(x, z)

const person = {    
    age: 25,
    email: "john@email.com",
    name: "john"
}

//De-structuring in Object
const {name, age} = person

console.log(name, age)
const person = {
    firstName: "john",
    lastName: "Peter",
    age: 25
}

for (const key in person) {
    console.log(key , " : ", person[key])
}
class Person{
    constructor(private firstName: string, private lastName: string){

    }
    protected introduce(): void{
        console.log(`I'm ${this.firstName} ${this.lastName}`)
    }
}

class Student extends Person{
    constructor(firstName: string, lastName: string, private grade: number){
        super(firstName, lastName)
    }
    public introduce(): void {
        super.introduce();
        console.log(`Studying ${this.grade} grade`);        
    }
}

const john = new Student("John", "Smith", 4)
john.introduce()


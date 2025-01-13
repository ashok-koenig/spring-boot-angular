export const message: string = "This is sample message from module 1";

export function greet(name: string){
    console.log("Welecome "+ name);    
}

export default class Circle{
    private readonly PI:number = 3.14;
    constructor(private radius: number){}
    public area(): number{
        return this.PI * (this.radius ** 2);
    }
}
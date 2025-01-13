class Bank {
    // properties
    private accountNumber: number;
    // static property
    private static lastAccountNumber: number = 100;
    // constructor
    constructor(private _accountName: string, private _accountBalance: number){
        Bank.lastAccountNumber ++;
        this.accountNumber = Bank.lastAccountNumber;
    }
    //Getter method for _accountBalance - get keyword is used to create the getter method
    public get accountBalance(){
        return this._accountBalance;
    }

    // Setter method - set keyword to create the setter method
    public set accountName(name: string){
        this._accountName = name;
    }

    public get accountName(){
        return this._accountName;
    }

    // methods
    public deposit(amount: number): void{
        if(amount>0){
            this._accountBalance +=amount;
            console.log("Deposit success");            
        }else{
            console.log("Invalid amount");            
        }
    }
    public withdraw(amount: number): void{
        if(this._accountBalance >= amount){
            this._accountBalance -= amount;
            console.log("Withdrawal success");            
        }else{
            console.log("Insufficient balance");            
        }
    }
    public displayBalance(): void{
        console.log(`${this._accountName} - ${this.accountNumber} balance is ${this._accountBalance}`);        
    }

    // Static method
    public static displayLastAccountNumber(): void{
        console.log(`Last used account number is ${Bank.lastAccountNumber}`)
    }
}

Bank.displayLastAccountNumber()
const account1 = new Bank("John", 1000)
Bank.displayLastAccountNumber()
// account1._accountBalance = 79793479 // not possible
console.log("Balance using getter Method: "+ account1.accountBalance )

account1.accountName = "Johh Smith";

console.log("Account Name using getter Method: " + account1.accountName)
account1.displayBalance()
account1.deposit(100);
account1.displayBalance()
account1.withdraw(500)
account1.displayBalance()

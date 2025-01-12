class Bank {
    // properties
    private accountNumber: number;
    private accountName: string;
    private accountBalance: number;
    // constructor
    constructor(accountNumber: number, accountName: string, accountBalance: number){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }
    // methods
    public deposit(amount: number): void{
        if(amount>0){
            this.accountBalance +=amount;
            console.log("Deposit success");            
        }else{
            console.log("Invalid amount");            
        }
    }
    public withdraw(amount: number): void{
        if(this.accountBalance >= amount){
            this.accountBalance -= amount;
            console.log("Withdrawal success");            
        }else{
            console.log("Insufficient balance");            
        }
    }
    public displayBalance(): void{
        console.log(`${this.accountName} - ${this.accountNumber} balance is ${this.accountBalance}`);        
    }
}

const account1 = new Bank(101, "John", 1000)
// account1.accountBalance = 79793479 // not possible
account1.displayBalance()
account1.deposit(100);
account1.displayBalance()
account1.withdraw(500)
account1.displayBalance()

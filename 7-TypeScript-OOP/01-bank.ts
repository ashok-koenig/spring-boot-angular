class Bank {
    // properties
    accountNumber: number;
    accountName: string;
    accountBalance: number;
    // constructor
    constructor(accountNumber: number, accountName: string, accountBalance: number){
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }
    // methods
    deposit(amount: number): void{
        if(amount>0){
            this.accountBalance +=amount;
            console.log("Deposit success");            
        }else{
            console.log("Invalid amount");            
        }
    }
    withdraw(amount: number): void{
        if(this.accountBalance >= amount){
            this.accountBalance -= amount;
            console.log("Withdrawal success");            
        }else{
            console.log("Insufficient balance");            
        }
    }
    displayBalance(): void{
        console.log(`${this.accountName} - ${this.accountNumber} balance is ${this.accountBalance}`);        
    }
}

const account1 = new Bank(101, "John", 1000)
account1.displayBalance()
account1.deposit(100);
account1.displayBalance()
account1.withdraw(500)
account1.displayBalance()

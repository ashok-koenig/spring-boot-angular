var Bank = /** @class */ (function () {
    // constructor
    function Bank(accountName, accountBalance) {
        this.accountName = accountName;
        this.accountBalance = accountBalance;
        Bank.lastAccountNumber++;
        this.accountNumber = Bank.lastAccountNumber;
        // this.accountName = accountName;
        // this.accountBalance = accountBalance;
    }
    // methods
    Bank.prototype.deposit = function (amount) {
        if (amount > 0) {
            this.accountBalance += amount;
            console.log("Deposit success");
        }
        else {
            console.log("Invalid amount");
        }
    };
    Bank.prototype.withdraw = function (amount) {
        if (this.accountBalance >= amount) {
            this.accountBalance -= amount;
            console.log("Withdrawal success");
        }
        else {
            console.log("Insufficient balance");
        }
    };
    Bank.prototype.displayBalance = function () {
        console.log("".concat(this.accountName, " - ").concat(this.accountNumber, " balance is ").concat(this.accountBalance));
    };
    // Static method
    Bank.displayLastAccountNumber = function () {
        console.log("Last used account number is ".concat(Bank.lastAccountNumber));
    };
    // private accountName: string;
    // private accountBalance: number;
    // static property
    Bank.lastAccountNumber = 100;
    return Bank;
}());
Bank.displayLastAccountNumber();
var account1 = new Bank("John", 1000);
Bank.displayLastAccountNumber();
// account1.accountBalance = 79793479 // not possible
account1.displayBalance();
account1.deposit(100);
account1.displayBalance();
account1.withdraw(500);
account1.displayBalance();

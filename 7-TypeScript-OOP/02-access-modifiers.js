var Bank = /** @class */ (function () {
    // constructor
    function Bank(accountNumber, accountName, accountBalance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
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
    return Bank;
}());
var account1 = new Bank(101, "John", 1000);
account1.displayBalance();
account1.deposit(100);
account1.displayBalance();
account1.withdraw(500);
account1.displayBalance();

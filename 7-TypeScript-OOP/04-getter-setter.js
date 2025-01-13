var Bank = /** @class */ (function () {
    // constructor
    function Bank(_accountName, _accountBalance) {
        this._accountName = _accountName;
        this._accountBalance = _accountBalance;
        Bank.lastAccountNumber++;
        this.accountNumber = Bank.lastAccountNumber;
    }
    Object.defineProperty(Bank.prototype, "accountBalance", {
        //Getter method for _accountBalance - get keyword is used to create the getter method
        get: function () {
            return this._accountBalance;
        },
        enumerable: false,
        configurable: true
    });
    Object.defineProperty(Bank.prototype, "accountName", {
        get: function () {
            return this._accountName;
        },
        // Setter method - set keyword to create the setter method
        set: function (name) {
            this._accountName = name;
        },
        enumerable: false,
        configurable: true
    });
    // methods
    Bank.prototype.deposit = function (amount) {
        if (amount > 0) {
            this._accountBalance += amount;
            console.log("Deposit success");
        }
        else {
            console.log("Invalid amount");
        }
    };
    Bank.prototype.withdraw = function (amount) {
        if (this._accountBalance >= amount) {
            this._accountBalance -= amount;
            console.log("Withdrawal success");
        }
        else {
            console.log("Insufficient balance");
        }
    };
    Bank.prototype.displayBalance = function () {
        console.log("".concat(this._accountName, " - ").concat(this.accountNumber, " balance is ").concat(this._accountBalance));
    };
    // Static method
    Bank.displayLastAccountNumber = function () {
        console.log("Last used account number is ".concat(Bank.lastAccountNumber));
    };
    // static property
    Bank.lastAccountNumber = 100;
    return Bank;
}());
Bank.displayLastAccountNumber();
var account1 = new Bank("John", 1000);
Bank.displayLastAccountNumber();
// account1._accountBalance = 79793479 // not possible
console.log("Balance using getter Method: " + account1.accountBalance);
account1.accountName = "Johh Smith";
console.log("Account Name using getter Method: " + account1.accountName);
account1.displayBalance();
account1.deposit(100);
account1.displayBalance();
account1.withdraw(500);
account1.displayBalance();

var accountType;
(function (accountType) {
    accountType[accountType["SavingsAccount"] = 101] = "SavingsAccount";
    accountType[accountType["CurrentAccount"] = 102] = "CurrentAccount";
    accountType[accountType["LoanAccount"] = 201] = "LoanAccount";
})(accountType || (accountType = {}));
console.log(accountType.SavingsAccount);
console.log(accountType.CurrentAccount);
console.log(accountType.LoanAccount);
var direction;
(function (direction) {
    direction["North"] = "N";
    direction["East"] = "E";
    direction["South"] = "S";
    direction["West"] = "E";
})(direction || (direction = {}));
console.log(direction.East);

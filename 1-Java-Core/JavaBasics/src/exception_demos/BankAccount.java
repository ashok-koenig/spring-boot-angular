package exception_demos;

class InsufficientBalanceException extends Exception{
    int amount;
    public InsufficientBalanceException(String message, int amount){
        super(message);
        this.amount = amount;
    }
    public String getMessage(){
        return  super.getMessage() + " & Amount "+ amount;
    }
}

public class BankAccount {
    private int accountNumber;
    private String accountName;
    private int accountBalance;
    private static int lastAccountNumber = 1000;

    BankAccount(){
        BankAccount.lastAccountNumber++;
        accountNumber = BankAccount.lastAccountNumber;
        accountName ="No Name";
        accountBalance = 0;
    }

    BankAccount(String accountName, int accountBalance){
        this.accountNumber = ++BankAccount.lastAccountNumber;
        this.accountName = accountName;
        this.accountBalance = accountBalance;
    }

    void deposit(int amount){
        if(amount>0){
            accountBalance +=amount;
            System.out.println(amount + " Deposit successful");
        } else{
            System.out.println("Invalid amount");
        }
    }

//    void withdraw(int amount){
//        try{
//            if (amount > accountBalance) {
//               throw new InsufficientBalanceException("Insufficient balance", amount);
//            }
//            accountBalance -= amount;
//            System.out.println(amount + " withdraw successful");
//        }catch (InsufficientBalanceException e){
//            System.err.println(e.getMessage());
//        }
//    }

    void withdraw(int amount) throws InsufficientBalanceException, Exception{
            if (amount > accountBalance) {
                throw new InsufficientBalanceException("Insufficient balance", amount);
            }
            accountBalance -= amount;
            System.out.println(amount + " withdraw successful");
    }

    void displayBalance(){
        System.out.println(accountName + " with account number "+ accountNumber + " balance is "+ accountBalance);
    }

    static void displayLastUsedAccountNumber(){
        System.out.println("Last used account number is "+ lastAccountNumber);
    }

    public static void main(String[] args) {
        BankAccount.displayLastUsedAccountNumber();
        BankAccount account1 = new BankAccount("John Peter", 1000);
        BankAccount.displayLastUsedAccountNumber();
        account1.displayBalance();
        account1.deposit(500);
        account1.displayBalance();
        try{
            account1.withdraw(2400);
        }catch (InsufficientBalanceException e){
            e.printStackTrace();
//            System.err.println(e);
        }catch (Exception e){
            e.printStackTrace();
        }

        account1.displayBalance();

        // ANother account
        BankAccount account2 = new BankAccount();
        BankAccount.displayLastUsedAccountNumber();
        account2.displayBalance();
    }
}

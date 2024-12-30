package multithreading_demo;

class BankAccount {
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

    boolean withdraw(int amount){
        if(amount <=accountBalance){
            accountBalance -=amount;
            System.out.println(amount + " withdraw successful");
            return true;
        }else{
            System.out.println("Insufficient balance");
            return false;
        }
    }

    void displayBalance(){
        System.out.println(accountName + " with account number "+ accountNumber + " balance is "+ accountBalance);
    }

    static void displayLastUsedAccountNumber(){
        System.out.println("Last used account number is "+ lastAccountNumber);
    }
}

class Banking {
    public synchronized void fundTransfer(BankAccount fromAccount, BankAccount toAccount, int amount){
        if(fromAccount.withdraw(amount)){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            toAccount.deposit(amount);
        }
    }
}

public class SynchronizedExample {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("John", 1000);
        BankAccount account2 = new BankAccount("Bob", 500);
        BankAccount account3 = new BankAccount("Smith", 500);

        Banking bank = new Banking();


        Thread t1 = new Thread(){
            public void run(){
                bank.fundTransfer(account1, account2, 1000);
            }
        };
        t1.start();

        Thread t2 = new Thread(){
            public void run(){
                bank.fundTransfer(account2, account3, 1000);
            }
        };
        t2.start();

        Runnable t3 = () -> {
            bank.fundTransfer(account3, account2, 500);
        };

        Thread task3 = new Thread(t3);
        task3.start();

    }
}

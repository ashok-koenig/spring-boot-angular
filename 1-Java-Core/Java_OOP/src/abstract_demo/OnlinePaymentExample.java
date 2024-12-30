package abstract_demo;

abstract class Payment{
    String accountName;
    Payment(String accountName){
        this.accountName=accountName;
    }
    abstract void processPayment(double amount);

    void showConfirmation(double amount){
        System.out.println("Payment of "+amount+ " has been process for "+ accountName);
    }
}

class CreditCardPayment extends Payment{
    private String cardNumber;
    CreditCardPayment(String accountName, String cardNumber){
        super(accountName);
        this.cardNumber=cardNumber;
    }

    @Override
    void processPayment(double amount) {
        System.out.println("Processing credit card payment of "+ amount + " for card number "+ cardNumber);
    }
}

public class OnlinePaymentExample {

    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment("John", "2323-2343-2343-2343");
        creditCard.processPayment(444);
        creditCard.showConfirmation(444);
    }
}

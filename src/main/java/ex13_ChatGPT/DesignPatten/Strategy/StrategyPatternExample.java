package ex13_ChatGPT.DesignPatten.Strategy;


interface PaymentStrategy{
    void pay(int amount);
}

class CreditCard implements PaymentStrategy{
    private String cardNumber;
    private String expirationDate;

    CreditCard(String cardNumber, String expirationDate){
        this.cardNumber=cardNumber;
        this.expirationDate=expirationDate;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+" is paid by"+cardNumber+" and expirationday is "+expirationDate);
    }
}

class PayPalPayment implements PaymentStrategy {
    private String email;

    PayPalPayment(String email){
        this.email=email;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+"is paid by"+email);
    }
}

class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    PaymentProcessor(PaymentStrategy paymentStrategy){
        this.paymentStrategy=paymentStrategy;
    }

    public void add(int amount) {
        paymentStrategy.pay(amount);
    }
}

public class StrategyPatternExample {
    public static void main(String[] args) {

    CreditCard cc=new CreditCard("11-22", "23-12-23");
    PayPalPayment pp=new PayPalPayment("chorye@han.com");
    PaymentProcessor pp1=new PaymentProcessor(cc);
    pp1.add(100);
    }
}

import singleton.SingletonPattern;
import strategy.CreditCard;
import strategy.PayPal;
import strategy.Payment;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Singleton Pattern
        SingletonPattern singletonPattern = SingletonPattern.getInstance();
        System.out.println("Singleton Pattern Instance: " + singletonPattern);
        System.out.println("Singleton Pattern Instance: " + singletonPattern);

        // Stategy Pattern
        Payment payment = new Payment();
        payment.pay(new PayPal());
        payment.pay(new CreditCard());


    }

}
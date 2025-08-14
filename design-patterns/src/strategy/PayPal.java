package strategy;

public class PayPal implements StategyPattern {

    @Override
    public void pay() {
        System.out.println("Paying with PayPal...");
    }

}

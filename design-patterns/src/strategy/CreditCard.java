package strategy;

public class CreditCard implements StategyPattern {

    @Override
    public void pay() {
        System.out.println("Paying with CreditCard...");
    }

}

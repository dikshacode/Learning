package StrategyDesignPattern;

public class Upi implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("**UPI Payment**");
    }
}

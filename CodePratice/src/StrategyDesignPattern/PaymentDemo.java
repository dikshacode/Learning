package StrategyDesignPattern;

public class PaymentDemo {
    public static void main(String[] args){
        PaymentSystem paymentSystem = new PaymentSystem();
        paymentSystem.setPaymentStrategy(new Upi());
        paymentSystem.payAmount(500);
    }
}

package StrategyDesignPattern;

public class PaymentSystem {
    PaymentStrategy paymentStrategy;
    public void payAmount(int amount){
        if(amount != 0){
            System.out.println("go for payment-");
            paymentStrategy.pay(amount);
        }
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

}

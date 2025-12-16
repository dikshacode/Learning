package StrategyDesignPattern;

public class NetBanking implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("**NetBanking**");
    }
}

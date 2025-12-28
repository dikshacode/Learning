package ParkingLot.PaymentStrategy;

public class Cash implements PaymentStrategy{
    double free;

    public Cash(double free) {
        this.free = free;
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing cash payment of $" + amount);
        return true;
    }
}

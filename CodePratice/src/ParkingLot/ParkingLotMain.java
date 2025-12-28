package ParkingLot;

import ParkingLot.ParkingFeeStrategy.BasicHourlyRateStrategy;
import ParkingLot.ParkingFeeStrategy.ParkingFeeStrategy;
import ParkingLot.ParkingFeeStrategy.PremiumRateStrategy;
import ParkingLot.PaymentStrategy.Cash;
import ParkingLot.PaymentStrategy.CreditCardPayment;
import ParkingLot.PaymentStrategy.PaymentStrategy;
import ParkingLot.VehicleFactory.VehicleFactory;
import ParkingLot.enums.ParkingSpotType;
import ParkingLot.enums.DurationType;
import ParkingLot.enums.VehicleType;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ParkingLotMain {
    public static void main(String[] main){
        ParkingSpot parkingSpot1 = new CarSpot(1, ParkingSpotType.Car);
        ParkingSpot parkingSpot2 = new BikeSpot(2, ParkingSpotType.Bike);
        Map<String,ParkingSpot> parkingLotMap = new HashMap<>();
        parkingLotMap.put("Car",parkingSpot1);
        parkingLotMap.put("BIke",parkingSpot1);
        ParkingLot parkingLot = new ParkingLot(parkingLotMap);

        ParkingFeeStrategy basicHourly = new BasicHourlyRateStrategy();
        ParkingFeeStrategy premiumHourly = new PremiumRateStrategy();
        Vehicle vehicleCar = VehicleFactory.createVehicle(String.valueOf(VehicleType.Four),"ABC123",premiumHourly);
        Vehicle vehicleBike = VehicleFactory.createVehicle("Bike","ABC1230",basicHourly);

       ParkingSpot carSpot =  parkingLot.parkVehicle(vehicleCar);
        ParkingSpot BikeSpot = parkingLot.parkVehicle(vehicleBike);
        parkingLot.parkVehicle(vehicleBike);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select payment method for your vehicle:");
        System.out.println("1. Credit Card");
        System.out.println("2. Cash");
        int paymentMethod = scanner.nextInt();
        // Process payments using Strategy Patterns
        if (carSpot != null) {
            // Calculate fee using the specific strategy for the vehicle
            double carFee = vehicleCar.calculateFee(2, DurationType.HOUR);
            PaymentStrategy carPaymentStrategy =
                    getPaymentStrategy(paymentMethod, carFee);
            carPaymentStrategy.processPayment(carFee);
            parkingLot.vacateSpot(carSpot, vehicleCar);
        }
        if (BikeSpot != null) {
            // Calculate fee using the specific strategy for the vehicle
            double bikeFee = vehicleBike.calculateFee(3, DurationType.HOUR);
            PaymentStrategy bikePaymentStrategy =
                    getPaymentStrategy(paymentMethod, bikeFee);
            bikePaymentStrategy.processPayment(bikeFee);
            parkingLot.vacateSpot(BikeSpot, vehicleBike);
        }
        scanner.close();

    }
    public static PaymentStrategy getPaymentStrategy(int paymentType,double fee){
        return switch (paymentType){
            case 1->new Cash(1);
            case 2-> new CreditCardPayment();
            default -> throw new IllegalStateException("Unexpected value: " + paymentType);
        };
    }
}

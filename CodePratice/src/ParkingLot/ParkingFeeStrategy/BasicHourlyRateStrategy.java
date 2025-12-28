package ParkingLot.ParkingFeeStrategy;

import ParkingLot.PaymentStrategy.PaymentStrategy;
import ParkingLot.enums.DurationType;

public class BasicHourlyRateStrategy implements ParkingFeeStrategy {

    @Override
    public double calculateParkingfee(String vehicleType, int duration, DurationType durationType) {

        return  switch (vehicleType.toLowerCase()){
             case  "car"->
                durationType == DurationType.HOUR ? duration * 10
                        :duration * 24.0 * 10.0; // 24 hrs
             case "bike" ->
                     durationType == DurationType.HOUR ? duration * 5
                             : duration * 24.0 * 5.0;

            default -> durationType == DurationType.HOUR ? duration * 15 : duration * 24 * 15;
        };
    };
}

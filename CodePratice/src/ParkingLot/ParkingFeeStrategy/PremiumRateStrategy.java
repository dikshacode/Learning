package ParkingLot.ParkingFeeStrategy;

import ParkingLot.enums.DurationType;

public class PremiumRateStrategy implements ParkingFeeStrategy{
    @Override
    public double calculateParkingfee(String vehicleType, int duration, DurationType durationType) {

        return switch (vehicleType.toLowerCase()){
            case "car" ->
                durationType == DurationType.HOUR ? duration * 15.0 :
                        duration * 15.0 * 24;
            case "bike" ->
                durationType == DurationType.HOUR ? duration * 8.0
                        :duration * 8.0 * 24;
            default -> durationType == DurationType.HOUR ? duration * 15.0
                    :duration * 8.0 * 24;
        };
    }
}

package ParkingLot.ParkingFeeStrategy;

import ParkingLot.enums.DurationType;

public interface ParkingFeeStrategy {
    double calculateParkingfee(String vehicleType, int duration, DurationType durationType);
}

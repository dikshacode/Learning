package ParkingLot.VehicleFactory;

import ParkingLot.ParkingFeeStrategy.ParkingFeeStrategy;
import ParkingLot.Vehicle;
import ParkingLot.enums.VehicleType;

public class OtherVehicle extends Vehicle {
    public OtherVehicle(String vehicleNo, String vehicleType, ParkingFeeStrategy parkingFeeStrategy) {
        super(vehicleNo, vehicleType, parkingFeeStrategy);
    }
}

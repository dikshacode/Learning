package ParkingLot.VehicleFactory;

import ParkingLot.ParkingFeeStrategy.ParkingFeeStrategy;
import ParkingLot.Vehicle;
import ParkingLot.enums.VehicleType;

public class BikeVehicle extends Vehicle {
    public BikeVehicle(String vehicleNo, String vehicleType, ParkingFeeStrategy parkingFeeStrategy) {
        super(vehicleNo, vehicleType, parkingFeeStrategy);
    }
}

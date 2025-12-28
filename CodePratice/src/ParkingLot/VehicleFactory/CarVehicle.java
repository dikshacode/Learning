package ParkingLot.VehicleFactory;

import ParkingLot.ParkingFeeStrategy.ParkingFeeStrategy;
import ParkingLot.Vehicle;
import ParkingLot.enums.VehicleType;

public class CarVehicle extends Vehicle {
    public CarVehicle(String vehicleNo, String vehicleType, ParkingFeeStrategy parkingFeeStrategy) {
        super(vehicleNo, vehicleType, parkingFeeStrategy);
    }
}

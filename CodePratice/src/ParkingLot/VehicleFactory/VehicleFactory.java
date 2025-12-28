package ParkingLot.VehicleFactory;

import ParkingLot.ParkingFeeStrategy.ParkingFeeStrategy;
import ParkingLot.Vehicle;
import ParkingLot.enums.VehicleType;

public class VehicleFactory {
    public static Vehicle createVehicle(String vehicleType, String vehicleNo, ParkingFeeStrategy parkingFeeStrategy)
    {
        if (vehicleType.equalsIgnoreCase("Car")) {
            return new CarVehicle(vehicleNo,"Car" , parkingFeeStrategy);
        } else if (vehicleType.equalsIgnoreCase("Bike")) {
            return new BikeVehicle(vehicleNo,"Bike", parkingFeeStrategy);
        }
        return new OtherVehicle(vehicleNo,"Truck",parkingFeeStrategy);
    }
}

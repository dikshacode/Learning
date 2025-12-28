package ParkingLot;

import ParkingLot.enums.ParkingSpotType;
import ParkingLot.enums.VehicleType;

public class CarSpot extends ParkingSpot{
    public CarSpot(int spotId, ParkingSpotType parkingSpotType) {
        super(spotId, parkingSpotType);
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "CAR".equalsIgnoreCase(String.valueOf(VehicleType.Four));
    }
}

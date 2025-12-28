package ParkingLot;

import ParkingLot.enums.ParkingSpotType;
import ParkingLot.enums.VehicleType;

public  class BikeSpot extends ParkingSpot{

    public BikeSpot(int spotId, ParkingSpotType parkingSpotType) {
        super(spotId, parkingSpotType);
    }

    @Override
    public boolean canParkVehicle(Vehicle vehicle) {
        return "bike".equalsIgnoreCase(vehicle.getVehicleType());
    }
}

package ParkingLot;

import ParkingLot.enums.ParkingSpotType;

import java.util.*;


public class ParkingLot {
    private Map<String, ParkingSpot> freeSpots;

    public ParkingLot(Map<String, ParkingSpot> freeSpots) {
        this.freeSpots = freeSpots;
    }

    public ParkingSpot parkVehicle(Vehicle vehicle){
        ParkingSpot parkingSpot = findAvailableSpot(vehicle.getVehicleType());
        if(parkingSpot != null){
            parkingSpot.parkVehicle(vehicle);
        }
        return parkingSpot;
    }
    public void vacateSpot(ParkingSpot parkingSpot, Vehicle vehicle){
        if(parkingSpot !=null && parkingSpot.isOccupied() && parkingSpot.getVehicle().equals(vehicle))
            parkingSpot.vacate();
    }
    public ParkingSpot findAvailableSpot(String vehicleType) {
        return freeSpots.getOrDefault(vehicleType, null);
    }

}

package ParkingLot;

import ParkingLot.enums.ParkingSpotType;


public abstract class ParkingSpot {
     private int spotId;
    private boolean isOccupied;
    private ParkingSpotType parkingSpotType;
    private Vehicle vehicle;

    public ParkingSpot(int spotId, ParkingSpotType parkingSpotType) {
        this.spotId = spotId;
        this.isOccupied = false;
        this.parkingSpotType = parkingSpotType;
    }
    public abstract boolean canParkVehicle(Vehicle vehicle);
    public boolean isOccupied(){
        return isOccupied;
    }
    public void parkVehicle(Vehicle vehicle){
        if(isOccupied)
            throw new IllegalStateException("Spot is already occupied.");
        if(!canParkVehicle(vehicle))
            throw new IllegalStateException("This spot is not suitable for" + vehicle.getVehicleType());
        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    public int getSpotId() {
        return spotId;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void vacate(){
        if(!isOccupied)
            throw new IllegalStateException("Spot is already occupied.");
        this.vehicle = null;
        this.isOccupied = false;
    }
}

package ParkingLot;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    int floorNo;
    List<ParkingSpot> parkingSpots = new ArrayList<>();

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
}

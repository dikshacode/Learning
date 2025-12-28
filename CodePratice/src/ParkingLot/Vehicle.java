package ParkingLot;

import ParkingLot.ParkingFeeStrategy.ParkingFeeStrategy;
import ParkingLot.enums.DurationType;
import ParkingLot.enums.VehicleType;

public abstract class Vehicle {
   private String vehicleNo;
    private String vehicleType;
    private ParkingFeeStrategy parkingFeeStrategy;

    public Vehicle(String vehicleNo, String vehicleType, ParkingFeeStrategy parkingFeeStrategy) {
        this.vehicleNo = vehicleNo;
        this.vehicleType = vehicleType;
        this.parkingFeeStrategy = parkingFeeStrategy;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingFeeStrategy getParkingFeeStrategy() {
        return parkingFeeStrategy;
    }

    public void setParkingFeeStrategy(ParkingFeeStrategy parkingFeeStrategy) {
        this.parkingFeeStrategy = parkingFeeStrategy;
    }

    double calculateFee(int duration, DurationType durationType){
        return parkingFeeStrategy.calculateParkingfee(vehicleType,duration,durationType);
    }
}

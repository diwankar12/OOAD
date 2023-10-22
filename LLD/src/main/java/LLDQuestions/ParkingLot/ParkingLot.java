package LLDQuestions.ParkingLot;

import LLDQuestions.ParkingLot.model.Address;
import LLDQuestions.ParkingLot.model.ParkingFloor;

import java.util.List;

public class ParkingLot {
    private String nameOfParkingLot ;
    private Address address ;
    private List<ParkingFloor> parkingFloors ;
    private static ParkingLot parkingLot = null ;

    private ParkingLot(String nameOfParkingLot, Address address, List<ParkingFloor> parkingFloors) {
        this.nameOfParkingLot = nameOfParkingLot;
        this.address = address;
        this.parkingFloors = parkingFloors;
    }

    public static ParkingLot getInstance(String nameOfParkingLot, Address address, List<ParkingFloor> parkingFloors){
           if(parkingLot==null){
                parkingLot = new ParkingLot(nameOfParkingLot,address,parkingFloors);
           }
           return parkingLot ;
    }



}

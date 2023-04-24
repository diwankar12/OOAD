package LLDQuestions.ParkingLot.model;


public class ParkingSlot {
    String name ;
    boolean isAvailable = true ;
    Vechicle vechicle ;
    ParkingSlotType parkingSlotType ;

    public ParkingSlot(String name, ParkingSlotType parkingSlotType) {
        this.name = name;
        this.parkingSlotType = parkingSlotType;
    }

    protected void addVehicle(Vechicle vechicle){
        this.vechicle=vechicle;
        isAvailable=false ;

    }

    protected void removeVehicle(Vechicle vechicle){
         this.vechicle=null ;
         isAvailable=true ;
    }
}

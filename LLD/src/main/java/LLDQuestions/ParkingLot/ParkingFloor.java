package LLDQuestions.ParkingLot;

import LLDQuestions.ParkingLot.model.ParkingSlot;
import LLDQuestions.ParkingLot.model.ParkingSlotType;

import java.util.Map;

public class ParkingFloor {

    String name ;
    Map<ParkingSlotType, Map<String, ParkingSlot>> parkingSlots ;
}

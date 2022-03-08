package utility;

import java.util.Map;

import model.ParkingSlotType;
import model.Vehicle;
import model.VehicleCategory;

public class VehicleParking {
    
    public static ParkingSlot getParkingSlotForVehicleAndPark(ParkingLot parkingLot,Vehicle vehicle) {
         ParkingSlot parkingSlot=null;
         for(ParkingFloor floor : parkingLot.getParkingFloors()){
             parkingSlot = getRelevantSlotForVehicleAndPark(floor,vehicle);
             if(parkingSlot!= null) break;
         }
         return parkingSlot;
     }

	 public static ParkingSlot getRelevantSlotForVehicleAndPark(ParkingFloor parkingFloor,Vehicle vehicle) {
	        VehicleCategory vehicleCategory = vehicle.getVehicleCategory();
	        ParkingSlotType parkingSlotType = ParkingSlotTypeFactory.getParkingSlotType(vehicleCategory);
	        Map<String,ParkingSlot> relevantParkingSlot = parkingFloor.getParkingSlots().get(parkingSlotType);
	        ParkingSlot slot =null ;
	        for(Map.Entry<String,ParkingSlot> m : relevantParkingSlot.entrySet()){
	            if(m.getValue().isAvailable) {
	                slot = m.getValue();
	                slot.addVehicle(vehicle);
	                break;
	            }
	        }

	        return slot;
	   }

}

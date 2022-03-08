package utility;
import java.util.List;
import java.util.Map;

import model.Address;
import model.ParkingSlotType;

public class ParkingLot {
	    public String getNameOfParkingLot() {
		return nameOfParkingLot;
	}


	public Address getAddress() {
		return address;
	}


	public List<ParkingFloor> getParkingFloors() {
		return parkingFloors;
	}

		private String nameOfParkingLot;
	    private Address address;
	    private List<ParkingFloor> parkingFloors;
	    private static ParkingLot parkingLot=null;
	    
	    
	    private ParkingLot(String nameOfParkingLot,Address address,List<ParkingFloor> parkingFloors) {
	    	this.nameOfParkingLot=nameOfParkingLot;
	    	this.address=address;
	    	this.parkingFloors=parkingFloors;
	    }
	    
	    
	    public static ParkingLot getParkingLot(String nameOfParkingLot,Address address,List<ParkingFloor> parkingFloors) {
	    	if(parkingLot==null) {
	    		synchronized(ParkingLot.class) {
	    			if(parkingLot==null) {
	    				parkingLot=new ParkingLot( nameOfParkingLot, address, parkingFloors);
	    			}
	    		}
	    	}
	    	return parkingLot;
	    }

	    public void addFloors(String name, Map<ParkingSlotType, Map<String,ParkingSlot>> parkSlots){
	        ParkingFloor parkingFloor = new ParkingFloor(name,parkSlots);
	        parkingFloors.add(parkingFloor);
	    }

	    public void removeFloors(ParkingFloor parkingFloor){
	        parkingFloors.remove(parkingFloor);
	    }

}

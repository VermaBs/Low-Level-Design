package utility;

import java.util.Map;
import model.ParkingSlotType;

public class ParkingFloor {

	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<ParkingSlotType, Map<String, ParkingSlot>> getParkingSlots() {
		return parkingSlots;
	}

	public void setParkingSlots(Map<ParkingSlotType, Map<String, ParkingSlot>> parkingSlots) {
		this.parkingSlots = parkingSlots;
	}

	String name;
	 Map<ParkingSlotType,Map<String,ParkingSlot>> parkingSlots;
	 
	 public ParkingFloor(String name, Map<ParkingSlotType, Map<String, ParkingSlot>> parkingSlots) {
		super();
		this.name = name;
		this.parkingSlots = parkingSlots;
	}
}

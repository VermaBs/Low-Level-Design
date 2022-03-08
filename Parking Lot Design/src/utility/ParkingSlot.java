package utility;

import model.ParkingSlotType;
import model.Vehicle;

public class ParkingSlot {
	 String name;
	 boolean isAvailable ;
	 Vehicle vehicle;
	 ParkingSlotType parkingSlotType;
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public ParkingSlotType getParkingSlotType() {
		return parkingSlotType;
	}

	public void setParkingSlotType(ParkingSlotType parkingSlotType) {
		this.parkingSlotType = parkingSlotType;
	}

	public ParkingSlot(String name, ParkingSlotType parkingSlotType) {
	        this.name = name;
	        this.parkingSlotType = parkingSlotType;
	        this.isAvailable=true;
	 }

	 public void addVehicle( Vehicle vehicle) {
		 this.vehicle=vehicle;
		 this.isAvailable=false;
	 }
	 public void removeVehicle() {
		 this.vehicle=null;
		 this.isAvailable=true;
	 }
}

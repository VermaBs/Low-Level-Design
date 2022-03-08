package model;

public class Vehicle {
	String vehicleNumber;
    VehicleCategory vehicleCategory;
    
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	
	public VehicleCategory getVehicleCategory() {
		return vehicleCategory;
	}

	public Vehicle setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
		return this;
	}

	public Vehicle setVehicleCategory(VehicleCategory vehicleCategory) {
		this.vehicleCategory = vehicleCategory;
		return this;
	}

}

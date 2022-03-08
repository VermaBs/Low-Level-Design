package model;

import utility.ParkingSlot;

public class Ticket {
    String ticketNumber;
    long startTime;
    long endTime;
    Vehicle vehicle;
    ParkingSlot parkingSlot;

	private Ticket( Vehicle vehicle, ParkingSlot parkingSlot) {
		super();
		this.ticketNumber = vehicle.getVehicleNumber()+System.currentTimeMillis();
		this.startTime = System.currentTimeMillis();
		this.vehicle = vehicle;
		this.parkingSlot = parkingSlot;
	}

	public static Ticket createTicket(Vehicle vehicle, ParkingSlot parkingSlot) {
		return new Ticket(vehicle,parkingSlot);
	}
	public String getTicketNumber() {
		return ticketNumber;
	}


	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}


	public Vehicle getVehicle() {
		return vehicle;
	}


	public ParkingSlot getParkingSlot() {
		return parkingSlot;
	}


}

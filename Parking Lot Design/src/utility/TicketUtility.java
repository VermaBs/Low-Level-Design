package utility;

import model.Ticket;
import model.Vehicle;

public class TicketUtility {
	
    public  static Ticket assignTicket(ParkingLot parkingLot,Vehicle vehicle){
        //to assign ticket we need parking slot for this vehicle
        ParkingSlot parkingSlot = VehicleParking.getParkingSlotForVehicleAndPark(parkingLot,vehicle);
        if(parkingSlot == null) return null;
        Ticket parkingTicket = createTicketForSlot(parkingSlot,vehicle);
        //persist ticket to database
        return parkingTicket;
    }

    private static Ticket createTicketForSlot(ParkingSlot parkingSlot, Vehicle vehicle) {
        return Ticket.createTicket(vehicle,parkingSlot);
    }

}

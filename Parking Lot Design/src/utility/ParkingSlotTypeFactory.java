package utility;

import model.ParkingSlotType;
import model.VehicleCategory;

public class ParkingSlotTypeFactory {
	
	public static ParkingSlotType getParkingSlotType(VehicleCategory vehicleCategory) {
		if(vehicleCategory.equals(VehicleCategory.TwoWheeler)) return ParkingSlotType.TwoWheeler;
        else if(vehicleCategory.equals(VehicleCategory.Hatchback) || vehicleCategory.equals(VehicleCategory.Sedan)) return ParkingSlotType.Compact;
        else if(vehicleCategory.equals(VehicleCategory.SUV)) return ParkingSlotType.Medium;
        else if(vehicleCategory.equals(VehicleCategory.Bus)) return ParkingSlotType.Large;
        return null;
	}

}

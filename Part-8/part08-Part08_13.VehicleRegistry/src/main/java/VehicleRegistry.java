
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class VehicleRegistry {

    private HashMap<LicensePlate, String> vehicleRegister;

    public VehicleRegistry() {
        this.vehicleRegister = new HashMap<>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.vehicleRegister.containsKey(licensePlate)) {
            return false;
        }
        this.vehicleRegister.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        if (!(this.vehicleRegister.containsKey(licensePlate))) {
            return null;
        }
        return this.vehicleRegister.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!(this.vehicleRegister.containsKey(licensePlate))) {
            return false;
        }
        this.vehicleRegister.remove(licensePlate);
        return true;
    }

    public void printLicensePlates() {
        for (LicensePlate plates : this.vehicleRegister.keySet()) {
            System.out.println(plates);

        }
    }

    public void printOwners() {
        ArrayList<String> ownersList = new ArrayList<>();
        for (String owners : vehicleRegister.values()){
            if (ownersList.contains(owners)){
                continue;
            } else {
                ownersList.add(owners);
                System.out.println(owners);
            }
        }
    }

}

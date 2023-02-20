
import java.util.ArrayList;
import java.util.HashMap;


public class StorageFacility {
    private HashMap<String, ArrayList<String>> storageMap;
    
    public StorageFacility(){
        this.storageMap = new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.storageMap.putIfAbsent(unit, new ArrayList<>());
        this.storageMap.get(unit).add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        return this.storageMap.getOrDefault(storageUnit, new ArrayList<>());
    }
    
    public void remove(String storageUnit, String item){
        if (this.storageMap.containsKey(storageUnit)){
            this.storageMap.get(storageUnit).remove(item);
        }
        if (this.storageMap.get(storageUnit).isEmpty()){
            this.storageMap.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> listOfStorageUnits = new ArrayList<>();
        for (String units : this.storageMap.keySet()){
            if (!(this.storageMap.isEmpty())){
                listOfStorageUnits.add(units);          
            }
        }
        return listOfStorageUnits;
    }
    
}

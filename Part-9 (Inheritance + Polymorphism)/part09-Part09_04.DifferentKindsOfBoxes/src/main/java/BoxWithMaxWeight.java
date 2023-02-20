
import java.util.ArrayList;


public class BoxWithMaxWeight extends Box {
    private ArrayList<Item> itemList;
    private int capacity;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.itemList = new ArrayList<>();
    }
    
    public void add(Item item){
        if (item.getWeight() + this.getTotalWeight() <= capacity){
            itemList.add(item);
        }
    }
    
    public boolean isInBox(Item item){
        boolean isStored = false;
        for (Item i : itemList){
            if (i.getName().equals(item.getName())){
                isStored = true;
            }
        }
        return isStored;
    }
    
    public int getTotalWeight(){
        int sum = 0;
        for (Item i : itemList){
            sum += i.getWeight();
        }
        return sum;             
    }
    
}

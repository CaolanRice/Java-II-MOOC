
import java.util.ArrayList;


public class Box implements Packable{
    private ArrayList<Packable> boxContents;
    private double maxWeight;
//    private double currentWeight;
    
    public Box(double maxWeight){
        this.maxWeight = maxWeight;
//        this.currentWeight = currentWeight;
        this.boxContents = new ArrayList<>();
    }
    
    public double weight(){
        double weight = 0;
        for (Packable contents: this.boxContents){
            weight+= contents.weight();
        }
        return weight;
    }
    
    public void add(Packable packable){     
        boxContents.add(packable);
//        currentWeight += packable.weight();
        if (this.weight() > maxWeight){
            boxContents.remove(packable);
        }

    }

    @Override
    public String toString() {
        return "Box: " + boxContents.size() + " items, total weight " + this.weight() + " kg";
    }
    
    
    
    
}

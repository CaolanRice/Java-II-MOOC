
import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> changeHistory;

    public ChangeHistory() {
        this.changeHistory = new ArrayList<>();
    }

    public void add(double status) {
        this.changeHistory.add(status);
    }

    public void clear() {
        this.changeHistory.clear();
    }

    public double maxValue() {
        if (this.changeHistory.isEmpty()) {
            return 0;
        }
        
        double maximum = 0.0;
        for (Double i : this.changeHistory) {
            if (i > maximum) {
                maximum = i;
            }
        }

        return maximum;
    }

    public double minValue() {
        if (this.changeHistory.isEmpty()) {
            return 0;
        }
        double minimum = changeHistory.get(0);
        for (Double i : this.changeHistory) {
            if (i < minimum) {
                minimum = i;
            }
        }
        return minimum;
    }
    
    public double average(){
        if (this.changeHistory.isEmpty()) {
            return 0;
        }
        
        double total = 0.0;
        for (Double i : changeHistory){
            total += i;
        }
        return total / changeHistory.size();
        
    }

    @Override
    public String toString() {
        return this.changeHistory.toString();
    }

}

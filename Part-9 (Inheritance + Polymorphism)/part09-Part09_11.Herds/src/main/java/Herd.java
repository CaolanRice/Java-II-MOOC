
import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> herdList;

    public Herd() {
        this.herdList = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.herdList.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable cows : herdList) {
            cows.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String moved = "";
        for (Movable cows : herdList){
            moved += cows + "\n";
        }
        return moved;
    }
    
    
}

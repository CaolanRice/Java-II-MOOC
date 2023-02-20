
import java.util.ArrayList;

public class MisplacingBox extends Box {

    private ArrayList<Item> itemList;

    public MisplacingBox() {
        this.itemList = new ArrayList<>();
    }

    public void add(Item item) {
        itemList.add(item);
    }

    public boolean isInBox(Item item) {
        return false;
    }

}

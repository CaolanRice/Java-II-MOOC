
import java.util.ArrayList;

public class OneItemBox extends Box {

    private ArrayList<Item> itemList;

    public OneItemBox() {
        this.itemList = new ArrayList<>();
    }

    public void add(Item item) {
        if (itemList.isEmpty()){
            itemList.add(item);
        }
    }

    public boolean isInBox(Item item) {
        boolean isStored = false;
        for (Item i : itemList) {
            if (i.getName().equals(item.getName())) {
                isStored = true;
            }
        }
        return isStored;
    }

}


import java.util.HashMap;
import java.util.Map;


public class ShoppingCart {
    private Map<String, Item> shoppingCart;
    
    public ShoppingCart(){
        this.shoppingCart = new HashMap<>();
        
    }
    
    public void add(String product, int price){
        this.shoppingCart.putIfAbsent(product, new Item(product, 0, price));
        this.shoppingCart.get(product).increaseQuantity();
    }
    
    public int price(){
        int total = 0;
        for (Item items: this.shoppingCart.values()){
            total += items.price();
        }
        return total;
    }
    
    public void print(){
        for (Item items : this.shoppingCart.values()){
            System.out.println(items);
        }
    }
    
}

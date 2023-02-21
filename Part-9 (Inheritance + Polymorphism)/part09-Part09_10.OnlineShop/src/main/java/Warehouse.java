
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> listOfProducts;
    private Map<String, Integer> balanceOfProducts;

    public Warehouse() {
        this.balanceOfProducts = new HashMap<>();
        this.listOfProducts = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.listOfProducts.put(product, price);
        this.balanceOfProducts.put(product, stock);
    }

    public int price(String product) {
        int price = -99;
        if (this.listOfProducts.containsKey(product)) {
            price = this.listOfProducts.get(product);
        }
        return price;
    }

    public int stock(String product) {
        if (!(this.balanceOfProducts.containsKey(product))) {
            return 0;
        }

        return this.balanceOfProducts.get(product);
    }

    public boolean take(String product) {
        boolean inStock = false;
        if (this.balanceOfProducts.containsKey(product)) {
            if (this.balanceOfProducts.get(product) >= 1) {
                int items = this.balanceOfProducts.get(product);
                this.balanceOfProducts.put(product, items - 1);
                inStock = true;
            }
        }

        return inStock;
    }
    
    public Set<String> products(){
        Set<String> setOfProducts = listOfProducts.keySet();
        return setOfProducts;
    }
    
    

}

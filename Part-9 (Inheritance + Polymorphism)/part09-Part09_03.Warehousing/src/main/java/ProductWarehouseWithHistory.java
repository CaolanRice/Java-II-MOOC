
public class ProductWarehouseWithHistory extends ProductWarehouse {

    private ChangeHistory changeHistory;

    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.changeHistory = new ChangeHistory();
        this.changeHistory.add(initialBalance);
        super.setBalance(initialBalance);
    }

    public String history() {
        return this.changeHistory.toString();
    }

    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.changeHistory.add(super.getBalance());
    }

    public double takeFromWarehouse(double amount) {
        double amountTaken = super.takeFromWarehouse(amount);
        this.changeHistory.add(super.getBalance());
        return amountTaken;
    }
    
    public void printAnalysis(){
        System.out.printf("Product:%s %nHistory: %s%n"
                + "Largest amount of product: %s%n"
                + "Smallest amount of product: %s%n"
                + "Average: %s",
                super.getName(), this.changeHistory, this.changeHistory.maxValue(), 
                this.changeHistory.minValue(), this.changeHistory.average());
    }

}

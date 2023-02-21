
public class Book implements Packable {
    private String authorName;
    private String bookName;
    private double weight;
    
    public Book(String authorName, String bookName, double weight){
        this.authorName = authorName;
        this.bookName = bookName;
        this.weight = weight;
    }
    
    public double weight(){
        return this.weight;
    }

    @Override
    public String toString() {
        return authorName + ": " + bookName;
    }
    
    
    
}

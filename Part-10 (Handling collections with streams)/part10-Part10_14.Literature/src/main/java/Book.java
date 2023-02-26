
public class Book {
    private String bookName;
    private int recommendedAge;
    
    public Book(String bookName, int recommendedAge){
        this.bookName = bookName;
        this.recommendedAge = recommendedAge;
    }

    public String getBookName() {
        return bookName;
    }

    public int getRecommendedAge() {
        return recommendedAge;
    }

    @Override
    public String toString() {
        return bookName + "(recommended for " + recommendedAge + " year-olds or older}";
    }
    
    
    
}

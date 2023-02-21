
public class CD implements Packable {
    private String aritstName;
    private String cdName;
    private int publicationYear;
    private double weight = 0.1;

    public CD(String aritstName, String cdName, int publicationYear) {
        this.aritstName = aritstName;
        this.cdName = cdName;
        this.publicationYear = publicationYear;
    }
    
    public double weight(){
        return this.weight;
    }

    @Override
    public String toString() {
        return aritstName + ": " + cdName + " (" + publicationYear + ")";
    }
    
    
    
}

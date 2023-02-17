
import java.util.HashMap;


public class Abbreviations {
    HashMap<String, String> abbreviations;
    private String abbreviation;
    private String explanation;
    
    
    public Abbreviations(){
        this.abbreviation = abbreviation;
        this.explanation = explanation;
        this.abbreviations = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        this.abbreviations.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        if (this.abbreviations.containsKey(abbreviation)){
            return true;
        }
        return false;
    }
    
    public String findExplanationFor(String abbreviation){
        if (this.abbreviations.containsKey(abbreviation)){
            return abbreviations.get(abbreviation);
        }
        return null;
    }
    
}   

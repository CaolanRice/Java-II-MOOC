
public class LiteracyRates {

    private String gender;
    private String countryName;
    private int year;
    private double literacyLevel;

    public LiteracyRates(String gender, String countryName, int year, double literacyLevel) {
        this.gender = gender;
        this.countryName = countryName;
        this.year = year;
        this.literacyLevel = literacyLevel;
    }

    public String getGender() {
        return gender;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getYear() {
        return year;
    }

    public double getLiteracyLevel() {
        return literacyLevel;
    }

    @Override
    public String toString() {
        return this.getCountryName() + " (" + this.getYear() + "), " + this.getGender() + ", " + this.getLiteracyLevel();
    }
}


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class LiteracyComparison {

    public static void main(String[] args) {
        ArrayList<LiteracyRates> literacyRates = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("literacy.csv"))) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String parts[] = line.split(",");
                String countryName = parts[3];
                String[] genderInfo = parts[2].split(" ");
                String gender = genderInfo[1];
                int year = Integer.valueOf(parts[4]);
                double percentage = Double.valueOf(parts[5]);
                literacyRates.add(new LiteracyRates(gender, countryName, year, percentage));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        literacyRates.stream().sorted((country1, country2) -> {
            return Double.valueOf(country1.getLiteracyLevel()).compareTo(Double.valueOf(country2.getLiteracyLevel()));
        }).forEach(country -> System.out.println(country));
        
        
        
//        try {
//            Files.lines(Paths.get("literacy.csv"))
//                    .map(line -> line.split(","))
//                    .map(parts -> new LiteracyRates(parts[2].replace("(%)", "").trim(), parts[3], Integer.valueOf(parts[4]), Double.valueOf(parts[5])))
//                    .forEach(result -> literacyRates.add(result));
//        } catch (IOException e) {
//            System.out.println("Error reading file");
//        }
        
                     
//        literacyRates.stream().sorted((c1, c2) -> {
//            if (c1.getLiteracyLevel() > c2.getLiteracyLevel()) {
//                return 1;
//            }
//            if (c1.getLiteracyLevel() < c2.getLiteracyLevel()) {
//                return -1;
//            }
//            return 0;
//        }).forEach(t -> System.out.println(t));
           
    }
}


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numList = new ArrayList<>();
        
        System.out.println("Enter numbers, 0 to quit");
        while (true){
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0){
                break;
            }
            numList.add(input);
        }
        
        System.out.println(positive(numList));

    }
    
    
    public static List<Integer> positive(List<Integer> numbers){        
        return numbers.stream()
                .filter(number -> number > 0)
                .collect(Collectors.toList());
        
    }

}


import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputList = new ArrayList<>();
        
        while (true){
            String input = scanner.nextLine();
            if (input.isEmpty()){
                break;
            }
            inputList.add(input);        
        }
        
        inputList.stream()
                .forEach(person -> System.out.println(person));
        

    }
}

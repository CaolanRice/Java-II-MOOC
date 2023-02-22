
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();

        System.out.println("Input numbers, type \"end\" to stop");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
//            inputs.add(input);
            inputs.add(Integer.valueOf(input));
        }


        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String command = scanner.nextLine();
        if (command.equals("n")) {
//            System.out.println("Average of the negative numbers: " + averageOfNegativeNums(inputs));
            System.out.println("Average of the negative numbers: " + inputs.stream().filter(l -> l > 0).mapToInt(i -> i).average().getAsDouble());
        }
        if (command.equals("p")) {
//            System.out.println("Average of the positive numbers: " + averageOfPositiveNums(inputs));
            System.out.println("Average of the negative numbers: " + inputs.stream().filter(l -> l < 0).mapToInt(i -> i).average().getAsDouble());
        }

    }

//    public static double averageOfPositiveNums(ArrayList<String> nums) {
//        return nums.stream()
//                .mapToInt(s -> Integer.valueOf(s))
//                .filter(number -> number > 0)
//                .average()
//                .getAsDouble();
//    }
//
//    public static double averageOfNegativeNums(ArrayList<String> nums) {
//        return nums.stream()
//                .mapToInt(s -> Integer.valueOf(s))
//                .filter(number -> number < 0)
//                .average()
//                .getAsDouble();
//    }
}

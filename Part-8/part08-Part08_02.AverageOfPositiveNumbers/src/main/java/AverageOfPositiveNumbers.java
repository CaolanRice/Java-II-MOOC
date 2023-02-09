
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputInts = new ArrayList<>();

        int sum = 0;
        while (true) {

            Integer input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            }
            if (input > 0) {
                inputInts.add(input);
                sum += input;
            }
        }


        if (inputInts.size() > 0) {
            System.out.println(1.0 * sum / inputInts.size());
        } else {
            System.out.println("Cannot calculate the average");
        }

    }
}

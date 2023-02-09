
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First:" + first);
            System.out.println("Second:" + second);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
            String[] parts = input.split(" ");
            input = parts[0];
            int amount = Integer.valueOf(parts[1]);
            if (input.equals("add")) {
                first.add(amount);
            }
            if (input.equals("move")) {
                  first.move(amount, second);
            }
            if (input.equals("remove")) {
                second.remove(amount);
            }
        }
    }

}

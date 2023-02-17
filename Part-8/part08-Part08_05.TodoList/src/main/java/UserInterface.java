
import java.util.Scanner;

public class UserInterface {
    private TodoList tasks;
    private Scanner scanner;

    public UserInterface(TodoList tasks, Scanner scanner) {
        this.tasks = tasks;
        this.scanner = scanner;
    }
    
    public void start(){    
        while (true){
            System.out.println("Command:");
            String command = scanner.nextLine(); 
            if (command.equals("stop")){
                break;
            }
            
            if (command.equals("add")){
                System.out.println("To add:");
                String input = scanner.nextLine();
                tasks.add(input);
            }
            if (command.equals("list")){
                tasks.print();
            }
            if (command.equals("remove")){
                System.out.println("Which one is removed?");
                Integer toRemove = Integer.valueOf(scanner.nextLine());
                tasks.remove(toRemove);
            }
        }
    }
    
}

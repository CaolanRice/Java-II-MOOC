
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                break;
            }
            System.out.println("Input the age recommendation:");
            Integer recommended = Integer.valueOf(scanner.nextLine());
            books.add(new Book(input, recommended));
            System.out.println();
        }
        
        System.out.println(books.size() + " books in total. \n Books:");

        Comparator<Book> comparator = Comparator
                .comparing(Book::getRecommendedAge)
                .thenComparing(Book::getBookName);

        Collections.sort(books, comparator);
        books.stream().forEach(book -> System.out.println(book));

    }

}

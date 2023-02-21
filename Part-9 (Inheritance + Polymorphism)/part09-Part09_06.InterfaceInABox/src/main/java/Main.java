
public class Main {

    public static void main(String[] args) {
        Box box = new Box(10);
        Box mediumBox = new Box(25);
        Box bigBox = new Box(50);

        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));
        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 3));
        
        mediumBox.add((new Book("LOTR", "Whatever", 7)));
        mediumBox.add(box);
        bigBox.add(box);
        bigBox.add(mediumBox);
        bigBox.add(box);
        

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println(box);
        System.out.println(box.weight());
        System.out.println("medium " + mediumBox);
        System.out.println("bix " + bigBox);
    }

}

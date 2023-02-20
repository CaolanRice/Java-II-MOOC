
public class Main {

    public static void main(String[] args) {
        OneItemBox box = new OneItemBox();
        box.add(new Item("S", 5));
        box.add(new Item("Jo", 18));
        
        System.out.println(box.isInBox(new Item("S")));
        System.out.println(box.isInBox(new Item("Jo")));
    }
}

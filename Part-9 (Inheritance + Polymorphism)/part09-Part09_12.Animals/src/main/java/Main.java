
public class Main {

    public static void main(String[] args) {
        NoiseCapable dog = new Dog();
        dog.makeNoise();
        NoiseCapable charlie = new Dog("Charlie");
        charlie.makeNoise();

        NoiseCapable cat = new Cat("Garfield");
        cat.makeNoise();
        Cat c = (Cat) cat;
        c.purr();

    }

}

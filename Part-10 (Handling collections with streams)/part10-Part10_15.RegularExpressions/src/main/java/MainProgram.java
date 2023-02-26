

public class MainProgram {

    public static void main(String[] args) {
        String word = "aeiaoua";
        String time = "17:61:05";
        Checker checker = new Checker();
        System.out.println(checker.allVowels(word));
        System.out.println(checker.timeOfDay(time));
    }
}

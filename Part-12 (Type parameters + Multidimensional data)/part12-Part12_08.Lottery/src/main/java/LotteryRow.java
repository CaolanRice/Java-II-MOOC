
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;
    private Random randNums;

    public LotteryRow() {
        this.randNums = new Random();
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        this.numbers = new ArrayList<>();
        while (this.numbers.size() < 7) {
            int rand = this.randNums.nextInt(40) + 1;
            if (!this.containsNumber(rand)) {
                this.numbers.add(rand);
            }
        }
    }

    public boolean containsNumber(int number) {
        return this.numbers.contains(number);
    }
}

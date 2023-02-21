
public class TripleTacoBox implements TacoBox {

    private int tacosInBox = 3;

    public TripleTacoBox() {
        this.tacosInBox = tacosInBox;
    }

    public int tacosRemaining() {
        return this.tacosInBox;
    }

    public void eat() {
        if (tacosInBox <= 0) {
            return;
        }
        tacosInBox -= 1;
    }

}

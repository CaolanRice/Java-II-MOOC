
public class Container {

    private int volume;

    public Container() {
        this.volume = volume;
    }

    public int contains() {
        return this.volume;
    }

    public void add(int amount) {
        if (amount > 0) {
            this.volume += amount;
        }

        if (this.volume > 100) {
            this.volume = 100;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }

        this.volume -= amount;
        if (this.volume < 0) {
            this.volume = 0;
        }
    }

public void move(int amount, Container obj){
        if (amount > 0 && amount > this.volume){
          amount = this.volume;
        }
        if (amount > 0){
            this.volume -= amount;
            obj.volume += amount;
        }
        if (obj.volume > 100){
            obj.volume = 100;
        }
    }

    @Override
    public String toString() {
        return volume + "/100";
    }

}

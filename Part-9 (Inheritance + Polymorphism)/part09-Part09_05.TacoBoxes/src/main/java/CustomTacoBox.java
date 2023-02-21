
public class CustomTacoBox implements TacoBox {
    private int tacosInBox;
    
    public CustomTacoBox(int tacos){
        this.tacosInBox = tacos;
    }
       
    public int tacosRemaining(){
        return this.tacosInBox;
    }
    
    public void eat(){       
        if (tacosInBox <= 0){
            return;
        }
        tacosInBox -= 1;
    }
    
}

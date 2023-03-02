
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Caolan
 */
public class Pipe<T> {
    ArrayList<T> pipe;
    
    public Pipe(){
        this.pipe = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        this.pipe.add(value);
    }
    
    public T takeFromPipe(){
        if (this.pipe.isEmpty()){
            return null;
        }
        T longest = this.pipe.get(0);
        this.pipe.remove(0);
        return longest;
    }
    
    public boolean isInPipe(){
        if (this.pipe.isEmpty()){
            return false;
        }      
        return true;
    }
    
}

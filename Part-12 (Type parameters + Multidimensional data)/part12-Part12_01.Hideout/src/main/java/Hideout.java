
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
public class Hideout<T> {
    ArrayList<T> hideout;
//    private T inHiding;
    
    public Hideout(){
        this.hideout = new ArrayList<>();
    }
    
    public void putIntoHideout(T toHide){
        if (this.hideout.isEmpty()){
            this.hideout.add(toHide);
        } else {
            this.hideout.clear();
            this.hideout.add(toHide);
        }
//        this.inHiding = toHide;
        
    }
    
    public T takeFromHideout(){
        T item = this.hideout.get(0);
        this.hideout.clear();
        return item;
//        T previouslyHiding = this.inHiding;
//        this.inHiding = null;
//        return previouslyHiding;
        
    }
    
    public boolean isInHideout(){
        if (this.hideout.isEmpty()){
            return false;
        }
        return true;
//        return this.inHiding != null;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//The hash map contains the words and their translations, and the list is used to randomly choose the word for practice. 
//The class has the necessary methods for adding a translation, for fetching a translation, and for drawing a random word.

package application;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 *
 * @author Caolan
 */
public class Dictionary {
    
    private List<String> words;
    private Map<String, String> translations;
    
    public Dictionary(){
        this.words = new ArrayList<>();
        this.translations = new HashMap<>();
        
        add("sana", "word");
    }
    
    public String get(String word){
        return this.translations.get(word);
    }
    
    public void add(String word, String translation){
        if (!this.translations.containsKey(word)){
            this.words.add(word);
        }
        this.translations.put(word, translation);
    }
    
    public String getRandomWord(){
        Random random = new Random();
        return this.words.get(random.nextInt(this.words.size()));
    }
    
}

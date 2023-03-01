/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Caolan
 */
public class SaveableDictionary {

    private File fileToLoad;
    private HashMap<String, String> firstTranslations;
    private HashMap<String, String> secondTranslations;

    public SaveableDictionary() {
        this.firstTranslations = new HashMap<>();
        this.secondTranslations = new HashMap<>();
    }

    public SaveableDictionary(String file) {
        this();
        this.fileToLoad = new File(file);
    }

    public boolean load() {
        try ( Scanner fileReader = new Scanner(this.fileToLoad)) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");
                firstTranslations.put(parts[0], parts[1]);
                secondTranslations.put(parts[1], parts[0]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean save() {
        try ( PrintWriter writer = new PrintWriter(this.fileToLoad)) {
            for (String key : this.firstTranslations.keySet()) {
                writer.append(key + ":" + this.firstTranslations.get(key) + "\n");
            }

            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void add(String words, String translation) {
        this.firstTranslations.putIfAbsent(words, translation);
        this.secondTranslations.putIfAbsent(translation, words);
    }

    public String translate(String word) {
        String translation = null;
        
        if (this.firstTranslations.containsKey(word)) {
            translation = this.firstTranslations.get(word);
        }

        if (this.secondTranslations.containsKey(word)) {
            translation = this.secondTranslations.get(word);
        }

        return translation;
    }

    public void delete(String word) {
        String translationToDelete = "";
        if (this.firstTranslations.containsKey(word)) {
            translationToDelete = firstTranslations.get(word);
            this.firstTranslations.remove(word);
            this.secondTranslations.remove(translationToDelete);
        }

        if (this.secondTranslations.containsKey(word)) {
            translationToDelete = secondTranslations.get(word);
            this.secondTranslations.remove(word);
            this.firstTranslations.remove(translationToDelete);
        }
    }
}

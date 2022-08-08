package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SaveableDictionary {
    
    private HashMap<String, String> dictionary;
    private String file;
    
    public SaveableDictionary(){
        dictionary = new HashMap();
    }
    
    public SaveableDictionary(String file){
        dictionary = new HashMap();
        this.file = file;
    }
    
    public boolean load(){
        try{
            Scanner fileReader = new Scanner(new File(file));
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] parts = line.split(":");   
                add(parts[0], parts[1]);
            }
            fileReader.close();
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public boolean save(){
        try(PrintWriter writer = new PrintWriter(file);){
            dictionary.keySet().forEach(key -> writer.println(key + ":" + dictionary.get(key)));
            writer.close();
            return true;
        }catch(Exception e){
            return false;
        }
    }
    
    public void add(String words, String translation){
        dictionary.putIfAbsent(words, translation);
    }
    
    public String translate(String word){
        if(!dictionary.keySet().contains(word) && dictionary.values().contains(word)){
            for(String key : dictionary.keySet()){
                if(dictionary.get(key).equals(word)){
                    return key;
                }
            }
        }
        return dictionary.get(word);
    }
    
    public void delete(String word){
        Iterator<Entry<String, String> > iterator = dictionary.entrySet().iterator();
        if(!dictionary.keySet().contains(word) && dictionary.values().contains(word)){
            while(iterator.hasNext()) {
                if(iterator.next().getValue().equals(word)) {
                    iterator.remove();
                }
            }
        }
        else{
            dictionary.remove(word);
        }
    }
}



import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ka_ya
 */
public class DictionaryOfManyTranslations {
    
    private HashMap<String, ArrayList<String>> hash;
    public DictionaryOfManyTranslations(){
        hash = new HashMap();
    }
    
    public void add(String word, String translation){
        this.hash.putIfAbsent(word, new ArrayList<String>());
        this.hash.get(word).add(translation);
    }
    public ArrayList<String> translate(String word){
        if(!hash.containsKey(word)) return new ArrayList<String>();
        return this.hash.get(word);
    }
    public void remove(String word){
        this.hash.remove(word);
    }
    
}

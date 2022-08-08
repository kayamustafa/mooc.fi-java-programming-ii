
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
public class IOU {
    
    private HashMap<String, Double> hashmap;
    
    public IOU(){
        hashmap = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        this.hashmap.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom){
        if(doIOweTo(toWhom)) return this.hashmap.get(toWhom);
        return 0;
    }
    public boolean doIOweTo(String key){
        return this.hashmap.containsKey(key);
    }
}

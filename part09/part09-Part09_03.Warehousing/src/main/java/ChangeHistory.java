
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ka_ya
 */
public class ChangeHistory {
    
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        history = new ArrayList<>();
    }
    
    public void add(double status){
        history.add(status);
    }
    
    public void clear(){
        history.clear();
    }
    
    @Override
    public String toString(){
        return history.toString();
    }
    
    public double maxValue(){
        return Collections.max(history);
    }
    
    public double minValue(){
        return Collections.min(history);
    }
    
    public double average(){
        double sum = 0;
        for(double e: history){
            sum += e;
        }
        return sum/history.size();
    }
    
}

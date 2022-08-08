
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ka_ya
 */
public class TodoList {
    
    private ArrayList<String> list; 
    
    public TodoList(){
        list = new ArrayList<String>();
    }
    
    public void add(String task){
        list.add(task);
    }
    public void print(){
        for(int i = 1; i<=list.size(); i++){
            System.out.println(i + ": " + list.get(i-1));
        }
    }
    public void remove(int number){
        list.remove(number-1);
    }
}

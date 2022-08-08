/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ka_ya
 */
public class Student extends Person{
    
    private int credit;
   
    public Student(String name, String address) {
        super(name, address);
    }
    
    public void study(){
        credit++;
    }
    
    public int credits(){
        return credit;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + credit;
    }
    
    
    
}

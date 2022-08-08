
import java.util.ArrayList;
import java.util.Arrays;
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
public class VehicleRegistry {
    private HashMap<LicensePlate, String> hash;
    
    public VehicleRegistry(){
        hash = new HashMap();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(hash.containsKey(licensePlate)) return false;
        hash.put(licensePlate, owner);
        return true;
    }
    public String get(LicensePlate licensePlate){
        return hash.get(licensePlate);
    }
    public boolean remove(LicensePlate licensePlate){
        if(!hash.containsKey(licensePlate)) return false;
        hash.remove(licensePlate);
        return true;
    }
    public void printLicensePlates(){
        for(LicensePlate l : hash.keySet()) System.out.println(l);
    }
    public void printOwners(){
        ArrayList<String> owners = new ArrayList<>();
        for(LicensePlate l : hash.keySet()){
            if(!owners.contains(hash.get(l))) owners.add(hash.get(l));
        }
        owners.forEach(owner -> System.out.println(owner));
    }
}

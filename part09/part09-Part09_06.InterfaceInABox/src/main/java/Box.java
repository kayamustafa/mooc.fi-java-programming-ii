
import java.util.ArrayList;


public class Box implements Packable{
    
    private double capacity;
    private ArrayList<Packable> packables;
    
    public Box(double capacity){
        this.capacity = capacity;
        packables = new ArrayList<>();
    }
    
    public void add(Packable p){
        if(canAdd(p)) packables.add(p);
    }
    
    @Override
    public double weight(){
        double weight = 0;
        for(Packable p : packables){
            weight += p.weight();
        }
        return weight;
    }
    
    public boolean canAdd(Packable item){
        return weight() + item.weight() <= capacity;
    }

    @Override
    public String toString() {
        return "Box: " + packables.size()+ " items, total weight " + weight() + " kg";
    }
    
    
    
}

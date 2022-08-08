
import java.util.ArrayList;


public class Herd implements Movable{
    
    private ArrayList<Movable> movables;
    
    public Herd(){
        movables = new ArrayList<>();
    }
    
    public void addToHerd(Movable movable){
        movables.add(movable);
    }
    
    @Override
    public void move(int dx, int dy){
        movables.forEach(e -> e.move(dx, dy));
    }
    
    @Override
    public String toString(){
        String s = "";
        for(Movable m : movables){
            s = s + m + "\n";
        }
        return s;
    }
    
}

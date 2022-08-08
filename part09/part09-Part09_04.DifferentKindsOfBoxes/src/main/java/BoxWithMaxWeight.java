
import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{

    private int capacity;
    private ArrayList<Item> items;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        items = new ArrayList<>();
    }
    
    @Override
    public void add(Item item) {
        if(currentWeight() + item.getWeight() <= capacity) items.add(item);
    }
    
    public int currentWeight(){
        int sum = 0;
        for(Item i : items){
            sum += i.getWeight();
        }
        return sum;
    }
    
    @Override
    public boolean isInBox(Item item) {
        return items.contains(item);
    }
    
}


import java.util.ArrayList;

public class OneItemBox extends Box{
    
    private final int capacity;
    private ArrayList<Item> items;
    
    public OneItemBox(){
        this.capacity = 1;
        items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        if(items.size()<capacity) items.add(item);
    }

    @Override
    public boolean isInBox(Item item) {
        return this.items.contains(item);
    }
    
    
    
}

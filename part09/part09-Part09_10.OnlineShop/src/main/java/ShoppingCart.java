
import java.util.HashMap;
import java.util.Map;


public class ShoppingCart {
    
    private Map<String, Item> cart;
    
    public ShoppingCart(){
        cart = new HashMap();
    }
    
    public void add(String product, int price){
        if(cart.containsKey(product)) cart.get(product).setQty(cart.get(product).getQty() + 1);
        cart.putIfAbsent(product, new Item(product, 1, price));
    }
    
    public int price(){
        int totalPrice = 0;
        totalPrice = cart.values().stream().map(i -> i.price()).reduce(totalPrice, Integer::sum);
        return totalPrice;
    }
    
    public void print(){
        cart.keySet().forEach(s -> {
            System.out.println(s + ": " + cart.get(s).getQty());
        });
    }
    
}

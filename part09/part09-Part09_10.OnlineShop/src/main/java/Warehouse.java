
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class Warehouse {
    
    private Map<String, Integer> products;
    private Map<String, Integer> stocks;
    
    public Warehouse(){
        products = new HashMap();
        stocks = new HashMap();
    }
    
    public void addProduct(String product, int price, int stock){
        products.put(product, price);
        stocks.put(product, stock);
    }
    
    public int price(String product){
        if(!products.containsKey(product)) return -99;
        return products.get(product);
    }
    
    public int stock(String product){
        if(stocks.containsKey(product)) return stocks.get(product);
        return 0;
    }
    
    public boolean take(String product){
        if(stocks.containsKey(product)){
            int stockOfProduct = stocks.get(product);
            if(stockOfProduct > 0) stocks.put(product, stockOfProduct - 1);
            return stockOfProduct > 0;
        }
        return false;
    }
    
    public Set<String> products(){
        Set<String> productNames = new HashSet<>();
        products.keySet().forEach(key -> productNames.add(key));
        return productNames;
    }
            
}

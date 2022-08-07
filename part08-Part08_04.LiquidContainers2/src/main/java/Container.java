
public class Container {
    
    private int amountOfLiquid;
    
    public int contains(){
        return amountOfLiquid;
    }
    
    public void add(int amount){
        if(amount<0) return;
        amountOfLiquid = amountOfLiquid + amount < 100 ? amountOfLiquid + amount : 100 ;
    }
    
    public void remove(int amount){
        amountOfLiquid = amountOfLiquid - amount > 0 ? amountOfLiquid - amount : 0;
    }
    
    @Override
    public String toString(){
        return amountOfLiquid + "/100";
    }
}


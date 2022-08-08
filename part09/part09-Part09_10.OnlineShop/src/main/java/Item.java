
public class Item {
    
    private String product;
    private int qty;
    private int unitPrice;
    
    public Item(String product, int qty, int unitPrice){
        this.product = product;
        this.qty = qty; // qty = quantity
        this.unitPrice = unitPrice;
    }
    
    public int price(){
        return qty * unitPrice;
    }
    
    public void increaseQuantity(){
        qty++;
    }
    
    @Override
    public String toString(){
        return product + ": " + qty;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    
}

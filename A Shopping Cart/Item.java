public class Item{
    
    private int quantity;
    private double price;
    private String name;
    
    public Item(){
        quantity = 0;
        price = 0;
        name = "";
    }
    
    public Item(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public double getPrice(){
        return price;
    }
    
    public String getName(){
        return name;
    }
    
    public void setQuantity(int x){
        quantity = x;
    }
    
    public void setPrice(double x){
        price = x;
    }
    
    public void setName(String x){
        name = x;
    }
    
    public String toString(){
        return quantity + " " + name + " @ " + price + " each";
    }
    
    
    
}
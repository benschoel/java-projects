public class ShoppingCart{
    private Item[] cart;
    private double totalCost;
    private int totalItems;
    
    public ShoppingCart(int capacity){
        cart = new Item[capacity];
        totalCost = 0;
        totalItems = 0;
    }
    
    public void addToCart(String name, double price, int quantity){
        Item itemToAdd = new Item(name, price, quantity);
        if(totalItems == cart.length){
            increaseSize();
        }
        cart[totalItems++] = itemToAdd;
        totalCost += itemToAdd.getPrice() * itemToAdd.getQuantity();
    }
    
    
    public void increaseSize(){
        Item[] t = new Item[cart.length + 3];
        for(int i = 0; i < cart.length; i++){
            t[i] = cart[i];
        }
        cart = t;
    }
    
    public double getCost(){
        return totalCost;
    }
    
    public Item[] getCart(){
        return cart;
    }
}
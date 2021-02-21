/*
 * Ben Schoelkopf
 * 11-1-18
 * Band Booster representation of user data
 */

public class BandBooster{
    private String name;
    private int boxesSold;
    
    BandBooster(String n){
        name = n;
        boxesSold = 0;
    }
    
    public String getName(){
        return name;
    }
    
    public void updateSales(int toAdd){
        boxesSold += toAdd;
    }
    
    public String toString(){
        return name + ": " + boxesSold + " boxes sold.";
    }
    

}
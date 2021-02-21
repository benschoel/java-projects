import java.util.ArrayList;
/**
 * a CoinPurse holds a collection of Coin objects.
 */
public class CoinPurse
{
    ArrayList<Coin> purse;

    /**
     * Constructor for objects of class CoinPurse
     */
    public CoinPurse()
    {
        //implementation needed
        purse = new ArrayList<Coin>();

    }

    /**
     *adds Coin c to the CoinPurse 
     */
    public void addCoin(Coin c)
    {
        //implementation needed
        purse.add(c);
    }

    /**
     *removes Coin c from the CoinPurse 
     */
    public void removeCoin(Coin c)
    {
        //implementation needed
        for(int i = 0; i < purse.size(); i++){
            if(purse.get(i) == c){
                purse.remove(i);
                break;
            }
        }
    }

    /**
     *counts the number of coins in the CoinPurse 
     */
    public int count()
    {
        //implementation needed
        return purse.size();
    }

    /**
     *returns the total values of all coins in the CoinPurse
     */
    public double total() 
    { 
        //implementation needed
        double t = 0;
        for(int i = 0; i < purse.size(); i++){
            t += purse.get(i).getValue() * .01;
        }
        return t;
    } 

    /**
     *Prints the vName of each Coin stored in the CoinPurse 
     */
    public String toString()
    {
        //implementation needed
        String res = "";
        
        for(int i = 0; i < purse.size(); i++){
            res += purse.get(i) + "\n";
        }
        
        return res;
    }
}
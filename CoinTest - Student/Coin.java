
/**
 *The coin class represents a coin object which will be stored in a CoinPurse.
 * 
 */
public class Coin
{
    // instance variables 
    private final int value;
    private final String vName;

    /**
     * Constructor for objects of class Coin
     */
    public Coin(int val)
    {
        if (val == 1)
        {
            value = val;
            vName = "PENNY";
        }
        else if (val == 5)
        {
            value = val;
            vName = "NICKEL";
        }
        else if (val == 10)
        {
            value = val;
            vName = "DIME";
        }
        else if (val == 25)
        {
            value = val;
            vName = "QUARTER";
        }
        else if (val == 50)
        {
            value = val;
            vName = "HALF DOLLAR";
        }
        else if (val == 100)
        {
            value = val;
            vName = "DOLLAR";
        }
        else 
        {
            value = 0;
            vName = null;
        }
    }

    /**
     * returns the value of this Coin
     */
    public int getValue() 
    { 
        return this.value; 
    }
    public String toString()
    {
        return vName;
    }
}

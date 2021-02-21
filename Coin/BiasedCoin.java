public class BiasedCoin
{
    public final int HEADS = 0;
    public final int TAILS = 1;
    private int face;
    private double bias;
    // ---------------------------------------------
    // Sets up the coin by flipping it initially.
    // ---------------------------------------------
    public BiasedCoin ()
    {
        bias = .5;
        flip();
    }
    public BiasedCoin(double d){
        bias = d;
        flip();
    }
    // -----------------------------------------------
    // Flips the coin by randomly choosing a face.
    // -----------------------------------------------
    public void flip()
    {
        if(Math.random() < bias){
            face = HEADS;
        } else {
            face = TAILS;
        }
        
    }
    // -----------------------------------------------------
    // Returns the current face of the coin as an integer.

    // -----------------------------------------------------
    public int getFace()
    {
        return face;
    }
    // -----------------------------------------------------
    // Returns true if the current face of the coin is heads.
    // -----------------------------------------------------
    public boolean isHeads()
    {
        return (face == HEADS);
    }
    // -----------------------------------------------------
    // Returns the probability of heads for this coin
    // -----------------------------------------------------
    public double bias()
    {
        return bias;
    }
    // ----------------------------------------------------
    // Returns the current face of the coin as a string.
    // ----------------------------------------------------
    public String toString()
    {
        String faceName;
        if (face == HEADS)
            faceName = "Heads";
        else
            faceName = "Tails";
        return faceName;
    }
}
public class MyPurse
{
    public static void main(String[] args)
    {
        CoinPurse mine = new CoinPurse();

        //Instantiate some coin objects and add them to CoinPurse mine
        Coin c1 = new Coin(50);
        Coin c2 = new Coin(5);
        Coin c3 = new Coin(25);
        mine.addCoin(c1);
        mine.addCoin(c2);
        mine.addCoin(c3);

        //Count the total number of Coins in the CoinPurse
        System.out.println("Total number of coins: " + mine.count());

        //Total the Coin in the CoinPurse
        System.out.println("Total value of coins: " + mine.total());

        //Print the CoinPurse
        System.out.println(mine);

    }
}

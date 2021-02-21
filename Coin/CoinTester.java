public class CoinTester{
    public static void main(String[] args){
        BiasedCoin fair = new BiasedCoin();
        BiasedCoin leansH = new BiasedCoin(.9);
        BiasedCoin leansT = new BiasedCoin(.1);
        int q = 0;
        
        System.out.println("Flipping Fair Coin...");
        for(int i = 0; i < 100; i++){
            fair.flip();
            if(fair.isHeads()){
                q++;
            }
        }
        System.out.println(q + "/100 were heads");
        System.out.println();
        q=0;
        System.out.println("Flipping Heads Leaning Coin...");
        for(int i = 0; i < 100; i++){
            leansH.flip();
            if(leansH.isHeads()){
                q++;
            }
        }
        System.out.println(q + "/100 were heads");
        System.out.println();
        q=0;System.out.println("Flipping Tails Leaning Coin...");
        for(int i = 0; i < 100; i++){
            leansT.flip();
            if(leansT.isHeads()){
                q++;
            }
        }
        System.out.println(q + "/100 were heads");
        System.out.println();
        q=0;
    }
}
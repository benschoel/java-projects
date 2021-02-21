public class BalloonTester{
    public static void main(String[] args){
        Balloon b1 = new Balloon("Pinky", 12, "pink");
        Balloon b2 = new Balloon("Poppy", 14, "blue");
        Balloon b3 = new Balloon("Tiny", 8, "purple");
        
        b1 = b2;

        System.out.println("Balloon 1: \n" + b1.toString());
        System.out.println();
        System.out.println("Balloon 2: \n" + b2.toString());
        System.out.println();
        System.out.println("Balloon 3: \n" + b3.toString());
        System.out.println();
    }
}
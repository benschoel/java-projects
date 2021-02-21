/*
 *Ben Schoelkopf
 *11-1-18
 *Runs and tests the BandBooster class
 */
import java.util.Scanner;

public class Driver{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BandBooster b1, b2;
        String n;
        
        System.out.print("Enter the name of Band Booster #1: ");
        n = scan.nextLine();
        b1 = new BandBooster(n);
        
        System.out.println();
        
        System.out.print("Enter the name of Band Booster #2: ");
        n = scan.nextLine();
        b2 = new BandBooster(n);
        
        System.out.println();
        
        for(int i = 1; i < 3; i++){
            System.out.print("Enter the number of boxes sold by " + b1.getName() + " in week #" + i + ": ");
            b1.updateSales(scan.nextInt());
            
            System.out.println();
            
            System.out.print("Enter the number of boxes sold by " + b2.getName() + " in week #" + i + ": ");
            b2.updateSales(scan.nextInt());
            
            System.out.println();
        }
        
        System.out.println("END RESULTS: ");
        System.out.println(b1 + "\n" + b2);
        
        
        
        
    }
}
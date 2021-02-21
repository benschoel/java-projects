/*
 * Benjamin Schoelkopf
 * 9/26/18
 * Gives the most efficient change for a monetary amount
 */
import java.util.Scanner;

public class Change{
    public static void main(String[] args){
        double total, changeRemaining;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("AMOUNT: $");
        total = scan.nextDouble();
       
        System.out.println(((int)total/20) + " twenty dollar bills");
        total %= 20;
        System.out.println(((int)total/10) + " ten dollar bills");
        total %= 10;
        System.out.println(((int)total/5) + " five dollar bills");
        total %= 5;
        System.out.println(((int)total/1) + " one dollar bills");
        total %= 1;
        System.out.println((int)(total/.25) + " quarters");
        total -= (.25 * (int)(total/.25));
        System.out.println((int)(total/.1) + " dimes");
        total -= (.1 * (int)(total/.1));
        System.out.println((int)(total/.05) + " nickels");
        total -= (.05 * (int)(total/.05));
        System.out.println((int)(total/.01) + " pennies");
        
    }
}
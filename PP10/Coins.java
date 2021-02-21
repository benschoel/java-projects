/*
 * Benjamin Schoelkopf
 * 9/26/18
 * Program that takes input of types of coins and then give totalin dollars and cents
 */
import java.util.Scanner;

public class Coins{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int quarters, dimes, nickels, pennies;
        double total;
        System.out.print("# OF QUARTERS: ");
        quarters = scan.nextInt();
        System.out.print("# OF DIMES: ");
        dimes = scan.nextInt();
        System.out.print("# OF NICKELS: ");
        nickels = scan.nextInt();
        System.out.print("# OF PENNIES: ");
        pennies = scan.nextInt();
        total = (quarters * .25) + (dimes * .10) + (nickels * .05) + (pennies * .01);
        System.out.println("\nTOTAL: $" + total);
    }
}
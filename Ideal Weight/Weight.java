/**
 * Benjamin Schoelkopf
 * 9/28/18
 * Create a program that calculates the ideal weight for both males and females
*/
import java.util.Scanner;

public class Weight{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int feet, inches, totalInches, poundsM, poundsF;
        
        System.out.print("How many feet tall are you (not counting inches): ");
        feet = scan.nextInt();
        System.out.print("How many inches past " + feet + " feet tall are you: ");
        inches = scan.nextInt();
        
        totalInches = feet * 12 + inches;
        
        poundsM = (totalInches - 60) * 6;
        poundsM += 106;
        poundsF = (totalInches - 60) * 5;
        poundsF += 100;
        
        System.out.println("\nIdeal Weight For A Male: Between " + (poundsM * .85) + " and " + (poundsM * 1.15) + " pounds");
        System.out.println("Ideal Weight For A Male: Between " + (poundsF * .85) + " and " + (poundsF * 1.15) + " pounds");
        
        
    }
}
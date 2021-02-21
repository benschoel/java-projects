/*
 * Benjamin Schoelkopf
 * 10-11-18
 * Find side c of a right triangle when given a and b
 */
import java.util.Scanner;

public class Theorem{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a, b, c;
        
        System.out.print("Enter A: ");
        a = scan.nextDouble();
        
        System.out.print("Enter B: ");
        b = scan.nextDouble();
        
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        
        System.out.println("\nC: " + c);
    }
}
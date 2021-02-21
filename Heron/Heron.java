/*
 * Benjamin Schoelkopf
 * 10-11-18
 * Calculate the area of a triangle using Heron's formula
 */
import java.util.Scanner;

public class Heron{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double s, a, b, c, ar;
        
        System.out.print("Enter side \"A\" length: ");
        a = scan.nextDouble();
        
        System.out.print("Enter side \"B\" length: ");
        b = scan.nextDouble();
        
        System.out.print("Enter side \"C\" length: ");
        c = scan.nextDouble();
        
        s = (a + b + c) / 2.0;
        ar = Math.sqrt(s * (s-a) * (s-b) * (s-c));

        System.out.println("Area: " + ar);
    }
}
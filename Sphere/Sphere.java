/*
 * Benjamin Schoelkopf
 * 10-11-18
 * Calculate the surface area and volume of a sphere
 */
import java.util.Scanner;

public class Sphere{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double r = scan.nextDouble();
        
        double sa = 4 * Math.PI * Math.pow(r, 2);
        double v = (4.0 / 3) * Math.PI * Math.pow(r, 3);
        
        System.out.println("\nSurface Area: " + sa);
        System.out.println("Volume: " + v);
    }
}
/*
 * Benjamin Schoelkopf
 * 10-11-18
 * Write a program that generates a random integer base (b), height (h) and a side (a) for a parallelogram in the range 10 to 30, inclusive, and then computes the area and perimeter of the parallelogram.
 */
import java.util.Scanner;

public class Parallel{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int b = (int)(Math.random() * 21 + 10);
        int h = (int)(Math.random() * 21 + 10);
        int a = (int)(Math.random() * 21 + 10);
        
        double area = b * h;
        double perim = 2 * a + 2 * b;
        
        System.out.println("Base: " + b + " | Height: " + h + " | Side: " + a);
 
        System.out.println("\nPerimeter: " + perim);
        System.out.println("Area: " + area);
    }
}
//Benjamin Schoelkopf
//9/24/18
//Calculate the area and circumference of a circle
import java.util.Scanner;

public class Circle{
    public static void main(String[] args){
        //Variables
        Scanner scan = new Scanner(System.in);
        final double PI = 3.14159265358979323846264338327;
        double r, c, a;
        //Prompt
        System.out.print("Enter a radius: ");
        //Get user input
        r = scan.nextDouble();
        
        //Calculations
        c = 2 * PI * r;
        a = PI * r * r;
        
        //Display results
        System.out.println("Circumference: " + c);
        System.out.println("Area: " + a );
    }
}
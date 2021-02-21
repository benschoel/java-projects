/*
 * Benjamin Schoelkopf
 * 11-8-18
 * Determines what activity to do depending on user inputted temperature.
 */
import java.util.Scanner;

public class Activity{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String res = "";
        System.out.print("Enter the current temperature: ");
        double temp = scan.nextDouble();
        
        if(temp > 95 || temp < 20)
            res = "Visit Our Shops";
        else if(temp >= 80)
            res = "swimming";
        else if (temp >= 60)
            res = "tennis";
        else if (temp >= 40)
            res = "golf";
        else if (temp < 40)
            res = "skiing";
        
        System.out.println("\n" + res);
        
    }
}
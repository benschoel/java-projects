/*
 * Benjamin Schoelkopf
 * 11-9-18
 * Calculate a salesperson's commission using nested if’s.
 */
import java.util.Scanner;

public class Cars{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String co;
        System.out.print("Enter the number of doors on the car: ");
        if(scan.nextInt() == 2){
            System.out.print("Enter (1) if the car is a sport, or (2) if the car is a coupe: ");
            if(scan.nextInt() == 1){
                co = "3";
            } else {
                co = "1";
            }
        } else {
            System.out.print("Enter (1) if the car is an SUV, or (2) if the car is a sedan: ");
            if(scan.nextInt() == 1){
                co = "2";
            } else {
                co = "1.5";
            }
        }

        
        
        
        System.out.println("Your Commision Is: " + co + "%");
    }
}
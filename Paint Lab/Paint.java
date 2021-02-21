/*
 * Benjamin Schoelkopf
 * 9/24/18
 * Calculate how many gallons of paint would be needed for a room based on user input
 */
import java.util.Scanner;

public class Paint{
    public static void main(String[] args){
        final int COVERAGE = 350;
        int length, width, height, doors, windows;
        double totalSqFt, paintNeeded, windowSqFt, doorSqFt;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("ROOM LENGTH: ");
        length = scan.nextInt();
        
        System.out.print("ROOM WIDTH: ");
        width = scan.nextInt();
        
        System.out.print("ROOM HEIGHT: ");
        height = scan.nextInt();
        
        System.out.print("# OF DOORS: ");
        doors = scan.nextInt();
        
        System.out.print("# OF WINDOWS: ");
        windows = scan.nextInt();
        
        totalSqFt = (length * height * 2) + (width * height * 2);
        windowSqFt = windows * 15;
        doorSqFt = doors * 20;
        totalSqFt -= windowSqFt + doorSqFt;     
        paintNeeded = totalSqFt / COVERAGE;
        
        System.out.println("\n");
        System.out.println("LENGTH: " + length);
        System.out.println("WIDTH: " + width);
        System.out.println("HEIGHT: " + height);
        System.out.println("# OF WINDOWS: " + windows);
        System.out.println("# OF DOORS: " + doors);
        System.out.println("SQUARE FEET TO BE PAINTED: " + totalSqFt);
        System.out.println("\nNUMBER OF GALLONS NEEDED: " + paintNeeded);
        
    }
}
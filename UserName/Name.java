/*
 * Benjamin Schoelkopf
 * 10-11-18
 * Generates a user name based on first and last name
 */
import java.util.Scanner;

public class Name{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String first, last;
        
        System.out.print("First Name: ");
        first = scan.nextLine();
        
        System.out.print("Last Name: ");
        last = scan.nextLine();
        
        String username = first.substring(0, 1) + last.substring(0, 5) + (int)(Math.random() * (99-10+1) + 10);
        
        System.out.println("Your Username: " + username);
    }
}
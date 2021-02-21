/*
 * Benjamin Schoelkopf
 * 10-11-18
 * Change a string with s' in it
 */
import java.util.Scanner;

public class Changer{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input;
        
        System.out.print("Enter your string: ");
        input = scan.nextLine();
        
        int l = input.length(), i = input.indexOf("e");
        String u = input.toUpperCase();
        String lo = input.toLowerCase();
        String sub1 = input.substring(1);
        String sub2 = input.substring(0, l - 1);
        String r = input.replace('s', 'q').replace('S', 'Q');
        
        
        System.out.println("\nThe length of that string is: " + l);
        System.out.println("Uppercase: " + u);
        System.out.println("Lowercase: " + lo);
        System.out.println("Substring with one parameter: " + sub1);
        System.out.println("Substring with two parameters: " + sub2);
        System.out.println("Replace \'s\' with \'q\': " + r);
        System.out.println("Index of the character \'e\': " + i);
        
        System.out.print("Enter another string: ");
        String input2 = scan.nextLine();
        
        boolean e = input2.equals(input);
        int c = input2.compareTo(input);
        
        System.out.println("\nResult of equals: " + e);
        System.out.println("Result of compare to: " + c);
        
        
        
    }
}
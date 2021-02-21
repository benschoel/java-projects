// ****************************************************************
// LoveCS.java
//
// Use a while loop to print many messages declaring your
// passion for computer science
// ****************************************************************
import java.util.Scanner;
public class LoveCS
{
    public static void main(String[] args)
    {
        final int LIMIT = 10;
        Scanner scan = new Scanner(System.in);
        int count = 1, userLimit, total = 0;
        System.out.print("Enter the number of times you would like it printed: ");
        userLimit = scan.nextInt();
        
        
        while (count <= userLimit){
            System.out.println(count + ": I love Computer Science!!");
            total += count;
            count++;
        }
        
        System.out.println("Message printed " + (count - 1) + " times. The sum of the numbers from 1 to " + (count - 1) + " is " + total);
    }
}
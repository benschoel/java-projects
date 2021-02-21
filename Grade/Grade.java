/*
 * Benjamin Schoelkopf
 * 11-9-18
 * Determine a person's letter grade
 */
import java.util.Scanner;
public class Grade{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int q1, q2, midterm;
        double a;
        String g = "";
        System.out.print("Enter your q1 grade: ");
        q1 = scan.nextInt();
        System.out.print("Enter your q2 grade: ");
        q2 = scan.nextInt();
        System.out.print("Enter your midterm grade: ");
        midterm = scan.nextInt();
        a = (q1 * .4 + q2 * .4 + midterm * .2);
        if(a <= 100 && a >= 90)
            g = "A";
        else if (a < 90 && a >= 80)
            g = "B";
        else if (a < 80 && a >= 70)
            g = "C";
        else if (a < 70 && a >= 60)
            g = "D";
        else if (a < 60 && a >= 50)
            g = "E";
        else if (a < 50 && a >= 40)
            g = "F";
            
        System.out.println("\nYour Average: " + a);
        System.out.println("Your Letter Grade: " + g);
    }
}
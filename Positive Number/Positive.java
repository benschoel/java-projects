import java.util.Scanner;

public class Positive{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = 2;
        while(num >= 0){
            System.out.print("Enter a number(will continue until you enter a positive number): ");
            num = scan.nextInt();
        }
        System.out.println("\nStopping because you entered a negative number.");
    }
}
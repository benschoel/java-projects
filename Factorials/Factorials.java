/*
 * Benjamin Schoelkopf
 * 11-26-18
 * Program for interacting with factorials
 */
import java.util.Scanner;
public class Factorials{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int enteredNum = -1, total = 1;

        while(enteredNum < 0){
            System.out.print("Enter a non-negative number: ");
            enteredNum = scan.nextInt();
        }

        total = factorial(enteredNum);
        
        System.out.println(total);

    }
    
    public static int factorial(int n){
        if(n == 0){
            return 1;
        } else {
            int c = 1;
            int t = 1;
            while(c <= n){
                t *= c;
                c++;
            }
            return t;
        }
    }
}

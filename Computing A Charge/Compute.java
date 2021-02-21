/*
 * Benjamin Schoelkopf
 * 11-27-18
 * Computes and manipulates the charge of a credit card
 */
import java.util.Scanner;
import java.text.NumberFormat;

public class Compute{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double prevBal, totalCharges, interest, newBal, minPayment;
        
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        System.out.print("Enter your previous balance: $");
        prevBal = scan.nextDouble();
        System.out.print("Enter your charges for the month: $");
        totalCharges = scan.nextDouble();
        interest = prevBal > 0 ? 1.02 : 1.0;
        newBal = (prevBal + totalCharges) * interest;
        minPayment = newBal < 50 ? newBal : newBal <= 300 ? 50.0 : newBal * 1.2;
        
        
        System.out.println();
        System.out.println("CS Card International Statement");
        System.out.println("===============================\n");
        System.out.println("Previous Balance: \t" + fmt.format(prevBal));
        System.out.println("Additional Charges: \t" + fmt.format(totalCharges));
        System.out.println("Interest: \t\t" + fmt.format(interest) + "\n");
        System.out.println("New Balance: \t\t" + fmt.format(newBal) + "\n");
        System.out.println("Minimum Payment: \t" + fmt.format(minPayment));
    }
}
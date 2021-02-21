// ***********************************************************************
//   BaseConvert.java
//   Benjamin Schoelkopf
//   Converts base 10 numbers to another base (at most 4 digits in the other 
//   base).  The base 10 number and the base are input.
// ***********************************************************************
import java.util.Scanner;
 
public class BaseConvert{
   public static void main (String[] args){
       int base;        // the new base
       int base10Num;   // the number in base 10
       int maxNumber;   // the maximum number that will fit in 4 digits in the new base
 
       int place0;      // digit in the 1's (base^0) place
       int place1;      // digit in the base^1 place
       int place2;      // digit in the base^2 place
       int place3;      // digit in the base^3 place
       int quotient;    // quotient when dividing by the base
 
       Scanner scan = new Scanner(System.in);
 
       String baseBNum = new String (""); // the number in the new base
 
       // read in the base 10 number and the base
       System.out.print("Enter the base that you would like to convert into: ");
       base = scan.nextInt();
       maxNumber = (base * base * base * base) - 1;
       System.out.print("Enter a base 10 number to convert to base " + base + ".(Range: 0 - " + maxNumber + "): ");
       base10Num = scan.nextInt();
       // Compute the maximum base 10 number that will fit in 4 digits 
       // in the new base and tell the user what range the number they
       // want to convert must be in
       
       place0 = base10Num % base;
       quotient = base10Num / base;
       place1 = quotient % base;
       quotient /= base;
       place2 = quotient % base;
       quotient /= base;
       place3 = quotient % base;
       quotient /= base;
       
       baseBNum += place3;
       baseBNum += place2;
       baseBNum += place1;
       baseBNum += place0;
       
 
       System.out.print(baseBNum);
       
      
    }
}

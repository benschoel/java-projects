/**
 * Ben Schoelkopf
 * 11-1-18
 * Tests the Name class
 */
import java.util.Scanner;

class TestNames{
    public static void main(String[] args){
        String n1f, n1m, n1l, n2f, n2m, n2l;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter Person 1 First Name: ");
        n1f = scan.next();
        System.out.print("Enter Person 1 Middle Name: ");
        n1m = scan.next();
        System.out.print("Enter Person 1 Last Name: ");
        n1l = scan.next();
        System.out.println();
        System.out.print("Enter Person 2 First Name: ");
        n2f = scan.next();
        System.out.print("Enter Person 2 Middle Name: ");
        n2m = scan.next();
        System.out.print("Enter Person 2 Last Name: ");
        n2l = scan.next();
        
        Name n1 = new Name(n1f, n1m, n1l);
        Name n2 = new Name(n2f, n2m, n2l);
        
        System.out.println();
        System.out.println("-------------------------------------------------------------------");
        System.out.println();
        
        
        //N1
        System.out.println("First Middle Last: " + n1.firstMiddleLast());
        System.out.println("Last First Middle: " + n1.lastFirstMiddle());
        System.out.println("Initials: " + n1.initials());
        System.out.println("Length: " + n1.len());
        
        System.out.println();
        
        //N2
        System.out.println("First Middle Last: " + n2.firstMiddleLast());
        System.out.println("Last First Middle: " + n2.lastFirstMiddle());
        System.out.println("Initials: " + n2.initials());
        System.out.println("Length: " + n2.len());
        
        System.out.println();
        
        if(n1.same(n2)){
            System.out.println("These names are the same.");
        } else {
            System.out.println("These names are not the same.");
        }
    }
}
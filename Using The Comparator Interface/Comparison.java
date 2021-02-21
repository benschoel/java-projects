import java.util.Scanner;
public class Comparison{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //         System.out.print("Enter a string: ");
        //         String s1 = scan.nextLine();
        //         System.out.print("Enter a string: ");
        //         String s2 = scan.nextLine();
        //         System.out.print("Enter a string: ");
        //         String s3 = scan.nextLine();
        // 
        //         System.out.println("\nThe largest string is " + Compare3.largest(s1, s2, s3) + "\n");

        System.out.print("Enter an integer: ");
        int z1 = scan.nextInt();
        System.out.print("Enter an integer: ");
        int z2 = scan.nextInt();
        System.out.print("Enter an integer: ");
        int z3 = scan.nextInt();

        System.out.println("\nThe largest integer is " + Compare3.largest(z1, z2, z3));
    }
}
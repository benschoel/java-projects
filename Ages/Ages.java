/*
 * Benjamin Schoelkopf
 * 11-9-18
 * What you can do depending on your age
 */
import java.util.Scanner;

public class Ages{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        String res = "";
        int age = scan.nextInt();
        if(age > 24)
            res = "You Can Rent A Car";
        else if (age > 20)
            res = "You Can Purchase Alchohol";
        else if (age > 17)
            res = "You Can Purchase Lottery Tickets";
        else if (age == 17)
            res = "You Can Get Into An R-Rated Movie";
        else if (age == 16)
            res = "You Can Learn To Drive";
        else
            res = "You Have No Rights";

        System.out.println(res);
    }
}
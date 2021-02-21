//   LabGrade.java
//   This program computes a student's lab grade from the grades on the three components of lab:  
//   the pre-lab assignment, the lab itself, and the post-lab assignment.
 
import java.util.Scanner;

public class LabGrade  {
    public static void main (String[] args)   {
        double inWeight;         // in-class weight
        double outWeight;        // out-of-class weight
        int preLabPts;           //number of points earned on the pre-lab assignment
        int preLabMax;              //maximum number of points possible for pre-lab
        int labPts;                 //number of points earned on the lab
        int labMax;              //maximum number of points possible for lab
        int postLabPts;             //number of points earned on the post-lab assignment
        int postLabMax;             //maximum number of points possible for the post-lab
        double outClassAvg;         //average on the out of class (pre and post) work
        double inClassAvg;          //average on the in-class work
        double labGrade;            //final lab grade
        
        Scanner scan = new Scanner(System.in);
    
        System.out.println("\nWelcome to the Lab Grade Calculator\n");
        System.out.print("Enter the number of points you earned on the pre-lab: ");
        preLabPts = scan.nextInt();
        System.out.print("What was the maximum number of points you could have earned? ");
        preLabMax = scan.nextInt();
        System.out.print("Enter the number of points you earned on the lab: ");
        labPts = scan.nextInt();
        System.out.print("What was the maximum number of points for the lab? ");
        labMax = scan.nextInt();
        System.out.print("Enter the number of points you earned on the post-lab: ");
        postLabPts = scan.nextInt();
        System.out.print("What was the maximum number of points for the post-lab? ");
        postLabMax = scan.nextInt();
        System.out.println();
        
        System.out.println ("What weight is assigned to the in-class work? ");
        System.out.print ("Enter the number in decimal form (e.g. .4 for 40%): ");
        inWeight = scan.nextDouble();
    
        outClassAvg = (double)(preLabPts + postLabPts) / (preLabMax + postLabMax) * 100;      // Calculate the average for the out of class work
        
        inClassAvg = (double)labPts / labMax * 100; // Calculate the average for the in-class work
        
        outWeight = 1 - inWeight;                   // Calculate the weighted average
        labGrade = outWeight * outClassAvg + inWeight * inClassAvg;
        
        System.out.println("Your average on out-of-class work is " + outClassAvg + "%"); 
        System.out.println("Your average on in-class work is " + inClassAvg + "%");
        System.out.println("Your lab grade is " + labGrade + "%");
        System.out.println( );
    }
}

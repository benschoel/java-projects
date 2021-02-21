// ********************************************************************
//   Salary.java
//
//   Computes the amount of a raise and the new salary for an employee.  
//   The current salary and a performance rating (an integer 1-10) are 
//   input.  
// ********************************************************************

import java.util.Scanner;

public class Salary
{
    public static void main (String[] args)
    {
        double currentSalary;  // employee's current  salary
        double raise = 0;          // amount of the raise
        double newSalary;      // new salary for the employee
        int rating;            // performance rating

        Scanner scan = new Scanner(System.in);
        System.out.print ("Enter the current salary: ");
        currentSalary = scan.nextDouble();
        System.out.print ("Enter the performance rating (1 - 10): ");
        rating = scan.nextInt();

        // Compute the raise using if ...
        if(rating > 6){
            raise = currentSalary * 0.06;
        } else if (rating > 3){
            raise = currentSalary * 0.04;
        } else if (rating > 0){
            raise = currentSalary * 0.015;
        } else {
            System.out.println("This employee is fired.");
            System.exit(0);
        }

  
        newSalary = currentSalary + raise;
        // Print the results
        System.out.println();
        System.out.println("Current Salary:       " + currentSalary);
        System.out.println("Amount of your raise: " + raise);
        System.out.println("Your new salary:      " + newSalary);
        System.out.println();
    }
}

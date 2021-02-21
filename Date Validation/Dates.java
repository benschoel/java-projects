// ****************************************************************
// Dates.java
//
// Determine whether a 2nd-millenium date entered by the user
// is valid
//          
// ****************************************************************
import java.util.Scanner;

public class Dates
{
    public static void main(String[] args)
    {
        int month, day, year;   //date read in from user
        int daysInMonth;        //number of days in month read in 
        boolean monthValid, yearValid, dayValid;  //true if input from user is valid
        boolean leapYear;  //true if user's year is a leap year
        Scanner scan = new Scanner(System.in);
        int[] dayCounts = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        //Get integer month, day, and year from user
        System.out.print("Enter the month: ");
        month = scan.nextInt();
        System.out.print("Enter the day: ");
        day = scan.nextInt();
        System.out.print("Enter the year: ");
        year = scan.nextInt();
        //Check to see if month is valid
        monthValid = month >= 1 && month <= 12;
        //Check to see if year is valid
        yearValid = year >= 1000 && year <= 1999;
        //Determine whether it's a leap year
        leapYear = year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
        //Determine number of days in month
        daysInMonth = month == 2 && leapYear ? 29 : dayCounts[month - 1];
        //User number of days in month to check to see if day is valid
        dayValid = day >= 1 && day <= daysInMonth;      
        //Determine whether date is valid and print appropriate message
        if(dayValid && monthValid && yearValid){
            System.out.println("This date is valid.");
            System.out.println(leapYear ? "This is a leap year." : "This is not a leap year");
        } else {
            System.out.println("This date is not valid.");
        }
    }
}

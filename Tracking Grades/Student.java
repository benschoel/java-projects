// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades, 
//   compute the average, and print student's name.
// ****************************************************************
import java.util.Scanner;

public class Student{
    //declare instance data 
    private String name;
    private double test1;
    private double test2;

    //constructor
    public Student(String studentName){
        //add body of constructor
        name = studentName;
        test1 = 0;
        test2 = 0;
        //remember all instance data needs to be instantiated
    }

    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".

    public void inputGrades(){
        //add body of inputGrades
        //Instantiation of Scanner object goes inside this method
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter test grade 1 for " + name + ": ");
        double t1 = scan.nextDouble();
        if(t1 > 0 && t1 <= 100){
            test1 = t1;
        } else {
            System.out.println("Error. Invalid Test Score");
            System.exit(0);
        }
        
        System.out.print("Enter test grade 2 for " + name + ": ");
        double t2 = scan.nextDouble();
        if(t2 > 0 && t2 <= 100){
            test2 = t2;
        } else {
            System.out.println("Error. Invalid Test Score");
            System.exit(0);
        }
    }

    //getAverage: compute and return the student's test average

    //add header for getAverage
    public double getAverage(){
        //add body of getAverage
        return (test1 + test2) / 2.0;
    }

    //getName: return the student's name

    //add header for getName 
    public String getName(){
        //add body of getName
        return name;
    }

    //toString: return the student's name, test1 and test2
    //add a header for toString
    public String toString(){
        //add body of toString
        return "Name: " + name + "\nTest 1: " + test1 + "\nTest 2: " + test2;
    }
}
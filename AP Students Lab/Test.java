import java.util.Scanner;

public class Test{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the student's first name: ");
        String first = scan.nextLine();
        System.out.print("Enter the student's last name: ");
        String last = scan.nextLine();
        
        APStudent student = new APStudent(first, last);
        
        String input = "";
        
        
        
        do{
            System.out.print("Enter the subject: ");
            String subject = scan.next();
            System.out.print("Enter your score: ");
            int score = scan.nextInt();
            
            student.addExam(new APExam(subject, score));
            
            
            
            System.out.print("Enter \"end\" to quit, or anything else to continue.");
            input = scan.next();
        }while(!input.toUpperCase().equals("END"));
        
        System.out.println("\n-------------------------------------------------\n");
        System.out.println("Average Exam Score: " + student.computeExamAverage());
        System.out.println("Highest Exam Score: " + student.findHighestExamScore());
        System.out.println("Number Of Fives: " + student.numberOfFives());
        
    }
}
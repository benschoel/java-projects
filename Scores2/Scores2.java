import java.util.Scanner;

public class Scores2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double[] scores = new double[5];
        double total = 0, average = 0;
        
        for(int i = 0; i < 5; i++){
            System.out.print("Enter score " + (i + 1) + ": ");
            scores[i] = scan.nextDouble();
        }
        
        for(int i = 0; i < scores.length; i++){
            total += scores[i];
        }
        
        average = total / 5;
        
        System.out.println("Average: " + average);
        
        
    }
}
import java.util.Scanner;

public class QuizGrader{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int totalQ = 0;
        String answerKeyString;
        System.out.print("How many questions on the quiz?: ");
        totalQ = scan.nextInt();
        String[] answerKey = new String[totalQ];
        
        System.out.print("\nEnter the key on one line: ");
        answerKeyString = scan.nextLine();
        
        for(int i = 0; i < answerKeyString.length(); i++){
            answerKey[i] = Character.toString(answerKeyString.charAt(i));
        }
        
        String playAgain;
        
        do{
            
            String inputKey;
            System.out.print("Enter this quiz's answers: ");
            inputKey = scan.nextLine();
            double totalCorrect = 0;
            
            for(int i = 0; i < answerKey.length; i++){
                if(answerKey[i].equals(Character.toString(inputKey.charAt(i) ))){
                    totalCorrect++;
                }
            }
            
            System.out.println("Total Correct: " + totalCorrect);
            System.out.println("Grade: " + (totalCorrect / totalQ));
            
            System.out.print("Would you like to grade another paper(enter \"y\")");
            playAgain = scan.next();
        }while(playAgain.toUpperCase().equals("Y"));
        
        
    }
}
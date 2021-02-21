//****************************************************************
// Guess.java
// Play a game where the user guesses a number from 1 to 10
// ****************************************************************
import java.util.Scanner;
public class Guess
{
    public static void main(String[] args)
    {
        int numToGuess; //Number the user tries to guess
        int guess, numOfTries = 1; //The user's guess
        Scanner scan = new Scanner(System.in);

        //randomly generate the number to guess
        numToGuess = (int)(Math.random() * 10) + 1;
        //print message asking user to enter a guess
        System.out.print("Make A Guess: ");
        //read in guess
        guess = scan.nextInt();
        while (guess != numToGuess ) //keep going as long as the guess is wrong
        {
            //print message saying guess is wrong
            System.out.println("That's not it chief. Too " + (guess > numToGuess ? "high" : "low"));
            //get another guess from the user
            System.out.print("Make A Guess: ");
            guess = scan.nextInt();
            numOfTries++;
        }
        //print message saying guess is right
        System.out.println("\nCorrect, the number was " + numToGuess);
        System.out.println("That took you " + numOfTries + " tries");
    }
}
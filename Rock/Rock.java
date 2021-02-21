// ****************************************************************
// Rock.java
// Play Rock, Paper, Scissors with the user
// ****************************************************************
import java.util.Scanner;
public class Rock
{
    public static void main(String[] args)
    {
        String personPlay; //User's play -- "R", "P", or "S"
        String computerPlay; //Computer's play -- "R", "P", or "S"
        int computerInt; //Randomly generated number used to
        String playAgainSelection = "y";
        Scanner scan = new Scanner(System.in);

        while(playAgainSelection.toUpperCase().equals("Y")){
            //determine computer's play
            computerInt = (int)(Math.random() * 3 + 1);
            computerPlay = computerInt == 1 ? "R" : computerInt == 2 ? "P" : "S";
            //Get player's play -- note that this is stored as a string
            System.out.print("Enter your play (r, p, or s): ");
            personPlay = scan.next().toUpperCase();
            //Make player's play uppercase for ease of comparison
            //Generate computer's play (0,1,2)
            //Translate computer's randomly generated play to string
            //Print computer's play
            System.out.println("Computer plays " + computerPlay);
            //See who won. Use nested ifs instead of &&;.
            if (personPlay.equals(computerPlay)){
                System.out.println("It's a tie!");
            } else if (personPlay.equals("R")){
                if (computerPlay.equals("S")){
                    System.out.println("Rock crushes scissors. You win!!");
                } else {
                    System.out.println("Paper covers rock. You Lose!!");
                }
            } else if (personPlay.equals("S")){
                if (computerPlay.equals("P")){
                    System.out.println("Scissors cuts paper. You win!!");
                } else {
                    System.out.println("Rock crushes scissors. You Lose!!");
                }
            } else if (personPlay.equals("P")){
                if (computerPlay.equals("R")){
                    System.out.println("Paper covers rock. You win!!");
                } else {
                    System.out.println("Scissors cuts paper. You Lose!!");
                }
            }
            System.out.print("Would you like to play again(Enter 'y' if so, or otherwise enter any other letter): ");
            playAgainSelection = scan.next();
        }
    }
}

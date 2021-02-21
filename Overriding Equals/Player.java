// **********************************************************
// Player.java
//
// Defines a Player class that holds information about an athlete.
// **********************************************************
import java.util.Scanner;
public class Player implements Comparable
{
    private String name;
    private String team;
    private int jerseyNumber;

    //-----------------------------------------------------------
    // Prompts for and reads in the player's name, team, and 
    // jersey number.
    //-----------------------------------------------------------

    public void readPlayer()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Name: ");
        name = scan.nextLine();
        System.out.print("Team: ");
        team = scan.nextLine();
        System.out.print("Jersey number: ");
        jerseyNumber = scan.nextInt();
    }

    public String getTeam(){
        return team;
    }

    public int getJerseyNumber(){
        return jerseyNumber;
    }

    //-----------------------------------------------------------
    // Returns true if the given player is on the same team and has
    // the same jersey number as this player
    //-----------------------------------------------------------

    public int compareTo(Object o){
        Player otherPlayer = (Player)o;

        if(otherPlayer.getTeam().equals(team) && otherPlayer.getJerseyNumber() == jerseyNumber){
            return 1;
        } else {
            return -1;
        }

    }
}

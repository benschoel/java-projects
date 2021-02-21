/*
 * Benjamin Schoelkopf
 * 10-11-18
 * Roll two dice and show their independent and sum values
 */

public class Dice{
    public static void main(String[] args){
        

        int die1 = (int)Math.floor(Math.random() * 7);
        int die2 = (int)Math.floor(Math.random() * 7);
        
        System.out.println("You rolled a " + die1 + " and a " + die2 + " for a total of " + (die1 + die2));


    }
}
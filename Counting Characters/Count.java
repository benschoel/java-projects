// *************************************************************************
// Count.java
//
// This program reads in strings (phrases) and counts the number of blank
// characters and certain other letters in the phrase.
// *************************************************************************
import java.util.Scanner;
public class Count
{
    public static void main (String[] args)
    {
        String wannaQuit = "";

        System.out.println ("Counts the number of a selected character in a string");
        System.out.println ("Character Counter");

        while(!wannaQuit.equals("quit")){
            String phrase; // a string of characters
            int countBlank, countA, countE, countS, countT; // the number of blanks (spaces) in the phrase
            int length; // the length of the phrase
            char ch; // an individual character in the string
            Scanner scan = new Scanner(System.in);
            // Print a program header

            System.out.println ();
            // Read in a string and find its length
            System.out.print ("Enter a sentence or phrase: ");
            phrase = scan.nextLine();
            length = phrase.length();
            // Initialize counts
            countBlank = 0;
            countA = 0;
            countE = 0;
            countS = 0;
            countT = 0;
            // a for loop to go through the string character by character
            // and count the blank spaces

            for(int i = 0; i < phrase.length(); i++){
                countBlank += phrase.charAt(i) == ' ' ? 1 : 0;
                countA += phrase.toUpperCase().charAt(i) == 'A' ? 1 : 0;
                countE += phrase.toUpperCase().charAt(i) == 'E' ? 1 : 0;
                countS += phrase.toUpperCase().charAt(i) == 'S' ? 1 : 0;
                countT += phrase.toUpperCase().charAt(i) == 'T' ? 1 : 0;
            }

            // Print the results
            System.out.println ();
            System.out.println ("Number of blank spaces: " + countBlank);
            System.out.println ("Number of a's: " + countA);
            System.out.println ("Number of e's: " + countE);
            System.out.println ("Number of s': " + countS);
            System.out.println ("Number of t's: " + countT);
            System.out.println ();
            System.out.print("Enter anything to continue, or \"quit\" to quit: ");
            wannaQuit = scan.next();
        }

    }
}
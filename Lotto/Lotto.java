/*
 * Benjamin Schoelkopf
 * 10-11-18
 * Generate lotto numbers
 */

public class Lotto{
    public static void main(String[] args){
        int ball1 = (int)(Math.random() * 59 + 1);
        int ball2 = (int)(Math.random() * 59 + 1);
        int ball3 = (int)(Math.random() * 59 + 1);
        int ball4 = (int)(Math.random() * 59 + 1);
        int ball5 = (int)(Math.random() * 59 + 1);
        int pball = (int)(Math.random() * 35 + 1);
        
        System.out.println("Your lotto numbers are " + ball1 + " " + ball2 + " " + ball3 + " " + ball4 + " " + ball5 + " and " + pball);
        

    }
}
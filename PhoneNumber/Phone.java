/*
 * Benjamin Schoelkopf
 * 10-11-18
 * Generate a random phone number
 */

public class Phone{
    public static void main(String[] args){
        int digit1 = digit(0, 7);
        int digit2 = digit(0, 7);
        int digit3 = digit(0, 7);
        int digit4 = digit(1, 7);
        int digit5 = digit(0, 9);
        int digit6 = digit(0, 9);
        int digit7 = digit(0, 9);
        int digit8 = digit(0, 9);
        int digit9 = digit(0, 9);
        int digit10 = digit(0, 9);
        
        System.out.println("Phone #: " + digit1 + digit2 + digit3 + "-" + digit4 + digit5 + digit6 + "-" + digit7 + digit8 + digit9 + digit10);
    }
    static int digit(int min, int max){
        return (int)(Math.random() * (max - min + 1) + min);
    }
}
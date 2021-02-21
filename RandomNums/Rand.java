import java.util.Scanner;
public class Rand{
    public static void main(String[] args){
        int num1;
        double num2;
        double max = 152, min = 47;
        
        for(int i = 0; i < 10; i++){
            int rand = (int)(Math.random() * (max - min + 1) + min);
            System.out.println("Random Number: " + rand);         
        }
    }
}
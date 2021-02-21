/*
 * Benjamin Schoelkopf
 * 11-29-18
 * Produce specific outputs using nested for loops
 */

public class Loops{
    public static void main(String[] args){

        //Output 1
        for(int i = 1; i <= 5; i++){
            for(int x = 1; x <= i; x++){
                System.out.print(x);
            }
            System.out.println();
        }

        System.out.println();

        //Output 2
        for(int i = 1; i <= 5; i++){
            for(int x = 1; x <= 5 - i; x++){
                System.out.print(" ");
            }
            for(int x = 1; x <= i; x++){
                System.out.print(i);
            }
            System.out.println();
        }

        System.out.println();

        //Output 3
        for(int i = 5; i >=1; i--){
            for(int x = 1; x <= i; x++){
                System.out.print("*");
            }
            System.out.println();
        } 

        System.out.println();

        //Output 4
        for(int i = 1; i <= 9; i++){
            
            int n = (9-i) * 2;
            
            for(int x = 1; x <= n / 2; x++){
                System.out.print(" ");
            }
            for(int x = 1; x <= i * 2; x++){
                System.out.print(x % 2 == 0 ? " " : "*");
            }
            System.out.println();
            
        } 

    }
}










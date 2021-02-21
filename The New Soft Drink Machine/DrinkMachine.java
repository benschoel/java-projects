/*
 * Benjamin Schoelkopf
 * 12-4-18
 * Simulates the functionality of a drink machine and allows somebody to purchase drinks, which prices fluctuate in correlation with the weather.
 */
import java.util.Scanner;
import java.text.NumberFormat;

public class DrinkMachine{

    private Scanner scan = new Scanner(System.in);
    private NumberFormat nf1 = NumberFormat.getCurrencyInstance();
    private double temp, price, change;

    public DrinkMachine(){
        temp = 0.0;
        price = 0.0;
        change = 0.0;
    }

    public void getTemp(){
        temp = (int)(Math.random() * (101));
        System.out.println("The current temperature is " + temp + "º");
    }

    public void tellPrice(){
        if(isBetween(temp, -100000000, 49)){
            price = .50;
        } else if (isBetween(temp, 50, 60)){
            price = .55;
        } else if (isBetween(temp, 61, 65)){
            price = .60;
        } else if (isBetween(temp, 66, 70)){
            price = .65;
        } else if (isBetween(temp, 71, 75)){
            price = .75;
        } else if (isBetween(temp, 76, 80)){
            price = .80;
        } else if (isBetween(temp, 81, 85)){
            price = .85;
        } else if (isBetween(temp, 86, 90)){
            price = .90;
        } else if (isBetween(temp, 91, 100000000)){
            price = 1.00;
        }
        System.out.println("Price: " + nf1.format(price));
    }

    public void getMoney(){
        System.out.print("\nEnter your money: ");
        double in = scan.nextDouble();
        change = in - price;
    }

    public void completeTransaction(){
        if(change < 0){
            System.out.println("\nSorry, not enough funds.");
        } else {
            System.out.println("\nThank you, your change is: " + getChange());
        }
    }

    private String getChange(){
        String f = "";

        f += "\n" + (int)(change / 1) + " dollars\n";
        change %= 1;
        change *= 100;
        f += (int)(change / 25) + " quarters\n";
        change -= (int)(change / 25) * 25;
        f += (int)(change / 10) + " dimes\n";
        change -= (int)(change / 10) * 10;

        f += (int)(change / 05) + " nickels\n";
        change -= .05 * (int)(change / 05);
        f += (int)(change / 01) + " pennies\n";

        return f;
    }

    private boolean isBetween(double val, int x, int y){
        return val >= x && val <= y;
    }
}
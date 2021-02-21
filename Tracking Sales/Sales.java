// ****************************************************************
// Sales.java
//
// Reads in and stores sales for each of 5 salespeople. Displays
// sales entered by salesperson id and total sales for all salespeople.
//
// ****************************************************************
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        final int SALESPEOPLE = 5;
        
        int sum, maxSale = Integer.MIN_VALUE, maxID = 0, minSale = Integer.MAX_VALUE, minID = 0;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the number of sales: ");
        int totalSales = scan.nextInt();
        
        int[] sales = new int[totalSales];
        
        
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + i + ": ");
            sales[i] = scan.nextInt();
            if(sales[i] > maxSale){
                maxSale = sales[i];
                maxID = i + 1;
            }
            if(sales[i] < minSale){
                minSale = sales[i];
                minID = i + 1;
            }
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i + 1) + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("Average Sale: " + (sum / SALESPEOPLE));
        System.out.println("Salesperson " + maxID + " had the highest sale of $" + maxSale);
        System.out.println("Salesperson " + minID + " had the lowest sale of $" + minSale);
    
        System.out.print("Enter a value: $");
        double val = scan.nextDouble();
        int totalEx = 0;
    
        for(int i = 0; i < sales.length; i++){
            if(sales[i] > val){
                System.out.println("Salesperson " + (i + 1) + " exceeded that value with a total sale of " + sales[i]);
                totalEx++;
            }
        }
        
        System.out.println(totalEx + " salespeople exceeded that value.");
        
        
        
        
        
        
        
    }
}
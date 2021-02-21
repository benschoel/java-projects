// *******************************************************************************
//Temps.java
// This program reads in a sequence of hourly temperature readings (beginning with midnight) and prints
// the maximum temperature (along with the hour, on a 24-hour clock, it occurred) and the minimum
// temperature (along with the hour it occurred).
// ******************************************************************************
import java.util.Scanner;
public class Temps
{
    public static void main (String[] args)
    {
        final int HOURS_PER_DAY = 6;
        int temp; // a temperature reading
        Scanner scan = new Scanner(System.in);
        // print program heading
        System.out.println ();
        System.out.println ("Temperature Readings for 24 Hour Period");
        System.out.println ();
        int maxTemp = Integer.MIN_VALUE;
        int timeAtMax = Integer.MIN_VALUE;
        int minTemp = Integer.MAX_VALUE;
        int timeAtMin = Integer.MAX_VALUE;
        for (int hour = 0; hour < HOURS_PER_DAY; hour++)
        {
            System.out.print ("Enter the temperature reading at " + hour + " hours: ");
            temp = scan.nextInt();
            if(temp > maxTemp){
                timeAtMax = hour;
                maxTemp = temp;
            }
            if(temp < minTemp){
                timeAtMin = hour;
                minTemp = temp;
            }
        }
        // Print the results
        System.out.println("Max Temperature: " + maxTemp + " at hour " + timeAtMax);
        System.out.println("Min Temperature: " + minTemp + " at hour " + timeAtMin);
    }
}
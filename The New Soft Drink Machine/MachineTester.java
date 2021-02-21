/*
 * Ben Schoelkopf
 * 12-4-18
 * Tester class for the drink machine. Runs through the transaction steps
 */

public class MachineTester{
    public static void main(String[] args){
        DrinkMachine m = new DrinkMachine();
        m.getTemp();
        m.tellPrice();
        m.getMoney();
        m.completeTransaction();
    }
}
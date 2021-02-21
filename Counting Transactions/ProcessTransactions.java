import java.util.Scanner;

public class ProcessTransactions
{
    public static void main(String[] args){

        Account acct1, acct2;       //two test accounts
        String keepGoing = "y";         //more transactions?
        String keepGoingDay = "y";
        String action;                  //deposit or withdraw
        double amount;                //how much to deposit or withdraw
        double acctNumber;            //which account to access

        Scanner scan = new Scanner(System.in);
        
        do{
            //Create two accounts
            acct1 = new Account(1000, "Sue", 123);
            acct2 = new Account(1000, "Joe", 456);

            System.out.println("The following accounts are available:\n");
            acct1.printSummary();

            System.out.println();
            acct2.printSummary();

            while (keepGoing.equalsIgnoreCase("y"))
            {
                //get account number, what to do, and amount
                System.out.print("\nEnter the number of the account you would like to access: ");
                acctNumber = scan.nextDouble();
                System.out.print("Would you like to make a deposit (D) or withdrawal (W)? ");
                action = scan.next();
                System.out.print("Enter the amount: ");
                amount = scan.nextDouble();

                if (amount > 0)
                    if (acctNumber == acct1.getAcctNumber())
                        if (action.equalsIgnoreCase("w"))
                            acct1.withdraw(amount);
                        else if (action.equalsIgnoreCase("d"))
                            acct1.deposit(amount);
                        else 
                            System.out.println("Sorry, invalid action.");
                    else if (acctNumber == acct2.getAcctNumber())
                        if (action.equalsIgnoreCase("w"))
                            acct1.withdraw(amount);
                        else if (action.equalsIgnoreCase("d"))
                            acct1.deposit(amount);
                        else 
                            System.out.println("Sorry, invalid action.");
                    else
                        System.out.println("Sorry, invalid account number.");
                else
                    System.out.println("Sorry, amount must be > 0.");

                System.out.print("\nMore transactions? (y/n)");
                keepGoing = scan.next();
            }

            //Print number of deposits
            System.out.println("Number Of Deposits: " + Account.getNumDeposits());
            //Print number of withdrawals
            System.out.println("Number Of Withdrawals: " + Account.getNumWithdrawals());
            //Print total amount of deposits
            System.out.println("Total Deposit Amount: $" + Account.getTotalDeposits());
            //Print total amount of withdrawals
            System.out.println("Total Withdrawal Amount: $" + Account.getTotalWithdrawals());
            
            System.out.println("Would you like to go for another day? Enter y to continue");
            keepGoingDay = scan.next();
            Account.resetStatics();
            
        }while(keepGoingDay.toUpperCase().equals("Y"));

    }
}


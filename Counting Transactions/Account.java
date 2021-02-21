//*******************************************************
// Account.java
//
// A bank account class with methods to deposit, withdraw, 
// and check the balance.
//*******************************************************
public class Account
{
    private double balance;
    private String name;
    private double acctNum;
    private static int numDeposits, numWithdrawals;
    private static double totalDeposits, totalWithdrawals;

    //----------------------------------------------
    //Constructor -- initializes balance, owner, and account number
    //----------------------------------------------
    public Account(double initBal, String owner, double number)
    {
        balance = initBal;
        name = owner;
        acctNum = number;
    }

    public static int getNumDeposits(){
        return numDeposits;
    }

    public static int getNumWithdrawals(){
        return numWithdrawals;
    }

    public static double getTotalDeposits(){
        return totalDeposits;
    }

    public static double getTotalWithdrawals(){
        return totalWithdrawals;
    }

    //----------------------------------------------
    // Checks to see if balance is sufficient for withdrawal.
    // If so, decrements balance by amount; if not, prints message.
    //----------------------------------------------
    public void withdraw(double amount)
    {
        if (balance >= amount){
            balance -= amount;
            numWithdrawals++;
            totalWithdrawals += amount;
        }else
            System.out.println("Insufficient funds");

    }

    //----------------------------------------------
    // Adds deposit amount to balance.
    //----------------------------------------------
    public void deposit(double amount)
    {
        balance += amount;
        numDeposits++;
        totalDeposits += amount;
    }

    //----------------------------------------------
    // Returns balance.
    //----------------------------------------------
    public double getBalance()
    {
        return balance;
    }

    //----------------------------------------------
    // Returns account number
    //----------------------------------------------
    public double getAcctNumber()
    {
        return acctNum;
    }

    //----------------------------------------------
    // Prints account number, name, and balance
    //----------------------------------------------
    public void printSummary()
    {
        System.out.println("Account number: " + acctNum);
        System.out.println("Account owner: " + name);
        System.out.println("Account balance: " + balance);
    }
    
    public static void resetStatics(){
        numDeposits = 0;
        numWithdrawals = 0;
        totalDeposits = 0;
        totalWithdrawals = 0;
    }

}

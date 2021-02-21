public class BoxCars
{
   //-----------------------------------------------------------------
   //  Rolls a pair of dice multiple times, counting the number of
   //  box cars (two sixes) that occur.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      final int ROLLS = 1000, TARGET = 12;
      int total, count = 0;

      PairOfDice dice = new PairOfDice();

      for (int roll=1; roll <= ROLLS; roll++)
      {
         total = dice.roll();
         if (total == TARGET)
           count++;
      }

      System.out.println ("Number of rolls: " + ROLLS);
      System.out.println ("Number of Box Cars: " + count);
   }
}

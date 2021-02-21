
/**
 * Write a description of class ListDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListDriver
{
	public static void main (String args[])
	{
		IntegerList temp = new IntegerList(5);
		
		temp.randomize();
		temp.print();
		System.out.println("Search for the value 8");
		if(temp.linearSearch(8) == -1)
			System.out.println("You didn't find the value 8");
		else
			System.out.println("Congrats, 8 is found");
}
}


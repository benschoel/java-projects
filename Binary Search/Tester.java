
public class Tester
{
    public static void main(String args[])
    {
        IntegerList list = new IntegerList(5);
    
        list.randomize();   
        list.sort();
    
        list.binarySearch(8);
        list.print(); 
   
        
          System.out.println("Search for the value 8");
        if(list.binarySearch(8) == -1)
            System.out.println("You didn't find the value 8");
        else
            System.out.println("Congrats, 8 is found");
}
}





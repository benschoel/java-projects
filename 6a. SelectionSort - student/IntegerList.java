
public class IntegerList
{
    int[] list; //values in the list

    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
    }

    //-------------------------------------------------------
    //fill listay with integers between 1 and 10, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 10) + 1;
    }

    //-------------------------------------------------------
    //print listay elements with indices
    //-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    //-------------------------------------------------------
    //selection sorts listay elements
    //-------------------------------------------------------
    public void selectionSort()
    {
        for(int i = 0; i < list.length; i++){ //Goes through each element in the array
            int lowest = Integer.MAX_VALUE; //Makes sure it can sort any integer
            int lowesti = -1; //Index of the lowest integer
            for(int j = i; j < list.length; j++){ //Goes through every element after the current index
                if(list[j] < lowest){ //Checks if it is lower, gets the lowest element and sets the index to that elemenet
                    lowest = list[j];
                    lowesti = j;

                }
            }
            int temp = list[i]; //Swaps current index with lowest index
            list[i] = lowest;
            list[lowesti] = temp;
        }

    }  
}

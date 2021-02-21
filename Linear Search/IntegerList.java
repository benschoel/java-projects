/**
 * create an integer list class that randomly generates an array of numbers
 *  
 */
public class IntegerList{

    int[] list; //values in the list
    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
    }

    //-------------------------------------------------------
    //fill array with integers between 1 and 10, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++)
            list[i] = (int)(Math.random() * 10) + 1;
    }

    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
        for (int i=0; i<list.length; i++)
            System.out.println(i + ":\t" + list[i]);
    }


    public int linearSearch(int target)
    {
        int val = -1; //initialized starter value at -1 so that if the value is not found it returns -1
        for(int i = 0; i < list.length; i++){ //loops through every element in the list array
            if(list[i] == target){ //Determines if current element is the target
                val = i;//Since is it, set val to that elements index
                break; //Gets out of for-loop, so that it returns the first occurence of target
            }
        }
        return val; //returns index of element

    }
}



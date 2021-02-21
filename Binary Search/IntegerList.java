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

    //-------------------------------------------------------
    //sorts array elements
    //-------------------------------------------------------
    public void sort()
    {
        int min, temp;

        for (int i=0; i<list.length; i++)    //goes through list
        {
            min=i;                         //sets min to current outer loop index
            for(int test=i+1;test<list.length;test++)
                if(list[test]<list[min])
                    min=test;
            //swap the values
            temp = list[min];
            list[min] = list[i];
            list[i] = temp;

        }    
    }

    //-------------------------------------------------------
    //return the index of the first occurrence of target in the list.
    //return -1 if target does not appear in the list
    //-------------------------------------------------------
    public int binarySearch(int target)
    {
        int low = 0; //the lowest point that the value could be
        int high = list.length - 1; //the highest point that the value could be
        int middle = (low + high) / 2; // the midpoint, truncated, between low and high
        
        while(list[middle] != target && low <= high){ //loops through until index is found or the lowest point is greater than the highest point
            if(target < list[middle]){ //This means that the value is less than the lower half of the list
                high = middle - 1; //Makes the highest point one less than the middle, one less because we already checked to maek sure that list[middle] was not the value
            } else {
                low = middle + 1; //Makes the lowest point one greater than the middle, one more because we already checked to make sure that list[middle] was not the value
            }
            middle = (low + high) / 2; //Resets the midpoint based upon the new high and low
        }
        
        if(list[middle] == target){ //Found value
            return middle; //Returns the index
        } else {
            return -1; //Returns -1, signifiying that the value cannot be found
        }

    }

}

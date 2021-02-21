
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
    //fill array with integers between 1 and 100, inclusive
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
    //insertion sorts array elements
    //-------------------------------------------------------

    public void insertionSort()
    { //5, 7, 9, 8, 3
        for(int i = 1; i < list.length; i++){ //Goes through every element in the array
            int key = list[i]; //Sets the current element as the key
            int position = i; //Sets the position of the key
            while(position > 0 && list[position - 1] > key){ //Makes sure that you don't go into a negative position and makes sure you don't swap elements that are already correct
                list[position] = list[position - 1];//sets the current position to the element prior(shifts forward)
                position--;//puts the position one less
            }
            list[position] = key; //Sets the correct position to the key value
        }

    }

}

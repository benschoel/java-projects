// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************

public class DogTest
{
    public static void main(String[] args)
    {
        Labrador dog2 = new Labrador("Spike", "Red");
        System.out.println(dog2.getName() + " says " + dog2.speak());
        Yorkshire dog3 = new Yorkshire("Spike");
        System.out.println(dog3.getName() + " says " + dog3.speak());

        System.out.println(dog2.avgBreedWeight());
        System.out.println(dog3.avgBreedWeight());

    }
}
/*
 * Ben Schoelkopf
 * 11-2-18
 * Test out the home class
 */

public class HomeTest{
    public static void main(String[] args){
        Home h = new Home(3, 2, "3 Main St. Danbury CT");
        
        h.setGarageOpen(true);
        h.setSprinklerOn(true);
        h.setNumOfBedrooms(4);
        h.setNumOfBathrooms(3);
        h.setAddress("9 Wicks Manor Drive, Danbury CT");
        
        System.out.println("Number Of Bedrooms: " + h.getNumOfBedrooms());
        System.out.println("Number Of Bathrooms: " + h.getNumOfBathrooms());
        System.out.println("Address: " + h.getAddress());
        System.out.println("Is Garage Open?: " + h.isGarageOpen());
        System.out.println("Is Sprinkler On?: " + h.isSprinklerOn());
        System.out.println();
        System.out.println("Estimated House Value: " + h.getHouseValue());
        System.out.println("Square Footage Of Bedrooms: " + h.squareFootageOfBedrooms());
        
    }
}
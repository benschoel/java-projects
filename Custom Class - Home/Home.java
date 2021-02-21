/*
 * Ben Schoelkopf
 * 11-2-18
 * A class that represents a home
 */

public class Home{
    
    //Instance Data
    private int numOfBedrooms, numOfBathrooms;
    private String address;
    private boolean garageOpen, sprinklerOn;

    //Default Constructor
    public Home(){
        numOfBedrooms = 0;
        numOfBathrooms = 0;
        garageOpen = false;
        address = "";
        sprinklerOn = false;
    }

    //Other Constructor
    public Home(int nOfBed, int nOfBath, String addy){
        numOfBedrooms = nOfBed;
        numOfBathrooms = nOfBath;
        address = addy;
        garageOpen = false;
        sprinklerOn = false;
    }

    //Getters
    public int getNumOfBedrooms(){
        return numOfBedrooms;
    }
    public int getNumOfBathrooms(){
        return numOfBathrooms;
    }
    public String getAddress(){
        return address;
    }
    public boolean isGarageOpen(){
        return garageOpen;
    }
    public boolean isSprinklerOn(){
        return sprinklerOn;
    }
    
    //Setters
    public void setGarageOpen(boolean status){
        garageOpen = status;
    }
    public void setSprinklerOn(boolean status){
        sprinklerOn = status;
    }
    public void setNumOfBedrooms(int numOfBed){
        numOfBedrooms = numOfBed;
    }
    public void setNumOfBathrooms(int numOfBath){
        numOfBathrooms = numOfBath;
    }
    public void setAddress(String add){
        address = add;
    }
    
    //Interesting Methods
    public double getHouseValue(){
        return (numOfBedrooms * 20000) + (numOfBathrooms * 10000); 
    }
    public int squareFootageOfBedrooms(){
        return (numOfBedrooms * 300);
    }
}
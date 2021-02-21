public class Car implements Comparable{
    
    private int myMaxSpeed, myGas;
    private String myMake, myModel;
    
    Car(String make, String model, int maxSpeed){
        myMake = make;
        myModel = model;
        myMaxSpeed = maxSpeed;
        myGas = 0;
    }
    
    public void drive(){
        myGas--;
    }
    
    public int fillUp(int gas){
        myGas += gas;
        return myGas;
    }
    
    public int getMaxSpeed(){
        return myMaxSpeed;
    }
    
    public int compareTo(Object obj){
        Car otherCar = (Car)obj;
        return myMaxSpeed > otherCar.getMaxSpeed() ? 1 : myMaxSpeed < otherCar.getMaxSpeed() ? -1 : 0;
    }
}
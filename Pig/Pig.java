/*
 * Ben Schoelkopf
 * 10-23-18
 */

public class Pig{    
    private double weight;
    private String name;

    public Pig(){
        name = "";
        weight = 0;
    }

    public String noise(){
        return "Oink";
    }

    public double weight(){
        return weight;
    }

    public String toString(){
        return "Pig Name: " + name + "\nPig Weight: " + this.weight();
    }
}
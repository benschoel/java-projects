public class Balloon{
    private double circ;
    private String name, color;
    
    public Balloon(){
        circ = 0;
        name = "";
        color = "";
    }
    
    public Balloon(String n, int cc, String c){
        circ = cc;
        name = n;
        color = c;
    }
    
    public void myCircumference(){
        System.out.println("My Circumference Is: " + circ);
    }
    
    public void myColor(){
        System.out.println("My Color Is: " + color);
    }
    
    public void pop(){
        circ = 0;
        System.out.println(color + " says pop");
    }
    
    public String toString(){
        return "color: " + color + "\ncircumference: " + circ + "\nname: " + name;
    }
    
    
}
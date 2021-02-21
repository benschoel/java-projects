public class Main{
    public static void main(String[] args){
       Child c = new Child(7, 5);
    }

}

class Parent{

}

class Child extends Parent{
    private int at;
    
    public Child(int a, int b){
        at = a;
    }
}
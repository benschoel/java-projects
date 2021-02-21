public class Tester{
    public static void main(String[] args){
        Car c1 = new Car("Honda", "Accord", 100);
        Car c2 = new Car("Ferrari", "LaFerrari", 200);
        
        System.out.println(c2.compareTo(c1));
    }
}
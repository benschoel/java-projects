/*
 * Benjamin Schoelkopf
 * 10-11-18
 * Solve a quadrilateral
 */

public class Quad{
    public static void main(String[] args){
        double a = -7.0, b = 2.0, c = 9.0;
        double qpos = ((b * -1) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        double qmin = ((b * -1) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
        
        System.out.println("Solution: \n" + qpos + "\n" + qmin);
    }
}
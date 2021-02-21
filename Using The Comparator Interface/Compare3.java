public class Compare3{
    public static Comparable largest(Comparable x, Comparable y, Comparable z){
        if(x.compareTo(y) >= 0 && x.compareTo(z) >= 0)
            return x;
        else if(y.compareTo(x) >= 0 && y.compareTo(z) >= 0)
            return y;
        else
            return z;
    }
}
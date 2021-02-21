/*
 * Ben Schoelkopf
 * 11-1-18
 * Does stuff with people's names
 */

public class Name{
    private String first;
    private String middle;
    private String last;
    
    public Name(String f, String m, String l){
        first = f;
        middle = m;
        last = l;
    }
    
    public String getFirst(){
        return first;
    }
    
    public String getMiddle(){
        return middle;
    }
    
    public String getLast(){
        return last;
    }
    
    public String firstMiddleLast(){
        return first + " " + middle + " " + last;
    }
    
    public String lastFirstMiddle(){
        return last + ", " + first + " " + middle;
    }
    
    public boolean same(Name otherName){
        return this.firstMiddleLast().equalsIgnoreCase(otherName.firstMiddleLast());
    }
    
    public String initials(){
        return first.substring(0, 1).toUpperCase() + middle.substring(0, 1).toUpperCase() + last.substring(0, 1).toUpperCase();
    }
    
    public int len(){
        return first.length() + middle.length() + last.length();
    }
}
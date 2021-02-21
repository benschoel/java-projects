public class Alpha{
    public static void main(String[] args){
        char[] alphabet = new char[26];
        for(int i = 65; i < 91; i++){
            alphabet[i - 65] = (char)i;
        } 
        System.out.println(alphabet);
    }
}
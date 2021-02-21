public class Even{
    public static void main(String[] args){
        int num = 4;
        while(num < 19){
            System.out.print(num % 2 == 0 ? num : "\n");
            num ++;
        }
    }
}
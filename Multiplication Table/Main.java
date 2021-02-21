public class Main{
    public static void main(String[] args){
        int[][] table = new int[12][12];
        
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        
        for(int i = 0; i < table.length; i++){
            System.out.println(java.util.Arrays.toString(table[i]));
        }
        
    }
}
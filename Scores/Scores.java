public class Scores{
    public static void main(String[] args){
        double[] scores = {99, 88, 77, 101, 81};
        double total = 0, average = 0;
        for(int i = 0; i < scores.length; i++){
            total += scores[i];
        }
        
        average = total / 5;
        System.out.println(average);
    }
}
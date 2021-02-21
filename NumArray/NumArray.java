public class NumArray{
    public static void main(String[] args){

        int[] nums = new int[10];
        for(int i = 1; i <= 10; i++){
            nums[i - 1] = i;
        }
        
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
        
    }
}
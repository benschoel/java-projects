import java.util.Scanner;

public class Reverse{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int t = scan.nextInt();
        int[] nums = new int[t];
        for(int i = 0; i < t; i++){
            System.out.print("Enter a value to add to the array: ");
            nums[i] = scan.nextInt();
        }
        
        for(int i = 0; i < nums.length; i++){
            System.out.print(i != nums.length - 1 ? nums[i] + ", " : nums[i] + "\n");
        }
        
        for(int i = 0; i < nums.length / 2; i++){
            int n1 = nums[i];
            int n2 = nums[nums.length - 1 - i];
            nums[i] = n2;
            nums[nums.length - 1 - i] = n1;
            
        }
        
        for(int i = 0; i < nums.length; i++){
            System.out.print(i != nums.length - 1 ? nums[i] + ", " : nums[i] + "\n");
        }
        
        
        
    }
    
}
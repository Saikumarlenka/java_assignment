import java.util.Arrays;
import java.util.Scanner;

public class Nine {

    public static int FindLargest(int[] nums){

        int largest = nums[0];

        for(int num: nums){
            if ( num >largest){
                largest = num;
            }
            
        }
        return largest;

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];
        System.out.println("Enter the numbers: ");
        for (int i=0; i<5; i++){
           nums[i]  = sc.nextInt();
        }

        System.out.println(Arrays.toString(nums));

        int result = FindLargest(nums);

        System.out.println("The largest of the given numbers is: " + result);
    }

    
    
    
    
}
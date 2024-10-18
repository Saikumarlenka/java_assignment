import java.util.Scanner;

public class Ten {

    public static void CommonFactors(int[] nums){

        int smallest = nums[0];

        for (int num : nums){

            if(num<smallest){
                smallest = num;
            }
        }
        

    
    for (int i=1; i<=smallest; i++){

        boolean isCommon = true;

        for (int num : nums){
            if (num%i!=0){
                isCommon = false;
                break;
            }
        }
        if (isCommon){System.out.println(i + " ");

        }

        
        
    }

    
}
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no of numbers: ");
    int count = sc.nextInt();

    int[] nums = new int[count];

    System.out.println("Enter the numbers: ");

    for (int i=0; i<count; i++){
        nums[i]=sc.nextInt();
    }
    CommonFactors(nums);

}
}
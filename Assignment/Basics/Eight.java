import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Eight {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i=0; i<5; i++){
            System.out.println("Enter a number " + (i+1) + ":");
            numbers[i] = sc.nextInt();

        }
        
        System.out.println("Array before reversing: " + Arrays.toString(numbers));

        for( int i=4; i>=0; i--){
            System.out.print(numbers[i] + " ");

        }
    }
    
}
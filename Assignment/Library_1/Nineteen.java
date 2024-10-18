import java.util.Random;

public class Nineteen {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        int sum = 0;

        
        System.out.println("Array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1; 
            System.out.print(arr[i] + " ");
            sum += arr[i]; 
        }

        
        double average = (double) sum / arr.length;
        System.out.println("\nAverage of the array: " + average);

        
        System.out.println("Elements greater than average:");
        for (int num : arr) {
            if (num > average) {
                System.out.print(num + " ");
            }
        }
    }
}
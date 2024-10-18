import java.util.Scanner;

public class Six {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int largestFactor = 1;

        for (int i = num/2; i>=1; i--){
            if (num % i == 0){
                largestFactor = i;
                break;
            }
            sc.close();
            
        }
        System.out.println("The Largest Factor of the given number is: " + largestFactor);
        

    }
    
    
}
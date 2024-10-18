import java.util.Scanner;

public class Five {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        
        for (int i =1; i<=5; i++){
            System.out.print("Enter a number " + i +":");
            int num = sc.nextInt();
            sum += num;

        }
        sc.close();

        int average = sum/5;

        System.out.println("The average of the five numbers is: " + average);

        

    }
}

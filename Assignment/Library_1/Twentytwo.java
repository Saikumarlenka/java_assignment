import java.util.Scanner;

public class Twentytwo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();

        
        System.out.println("Positions of spaces in the string: ");
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == ' ') {
                System.out.println("Space found at position: " + (i + 1)); 
            }
        }

        sc.close();
    }
}
import java.util.Scanner;

public class Twenty {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Accepting a string from the user
        System.out.println("Enter a string: ");
        String input = sc.nextLine();

        // Display the string vertically
        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }

        sc.close();
    }
}
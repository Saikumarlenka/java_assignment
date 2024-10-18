import java.util.Scanner;

public class Twentythree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();

        
        StringBuilder invertedString = new StringBuilder();
        for (char ch : inputString.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                invertedString.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                invertedString.append(Character.toUpperCase(ch));
            } else {
                invertedString.append(ch); 
            }
        }

    
        System.out.println("Inverted case string: " + invertedString.toString());

        sc.close();
    }
}
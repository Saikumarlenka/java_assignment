import java.util.ArrayList;
import java.util.Scanner;

public class Twentyfive {

    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String name;

        System.out.println("Enter names (type 'END' to stop):");


        while (true) {
            name = sc.nextLine();
            if (name.equalsIgnoreCase("END")) {
                break;
            }
            names.add(name); 
        }

        
        String result = String.join("-", names);

        
        System.out.println("Names: " + result);
        
        sc.close();
    }
}
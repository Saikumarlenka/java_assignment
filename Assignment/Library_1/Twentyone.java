import java.util.Scanner;

public class Twentyone {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter marks separated by commas: ");
        String marksInput = sc.nextLine();

        
        String[] marksArray = marksInput.split(",");

        int total = 0;

        
        for (String mark : marksArray) {
            total += Integer.parseInt(mark.trim());
        }

        
        System.out.println("Total Marks: " + total);

        sc.close();
    }
}
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Twentysix {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        
        
        System.out.println("Enter the starting date (DD-MM-YYYY):");
        String startDateInput = sc.nextLine();
        System.out.println("Enter the ending date (DD-MM-YYYY):");
        String endDateInput = sc.nextLine();
        
        
        LocalDate startDate = LocalDate.parse(startDateInput, formatter);
        LocalDate endDate = LocalDate.parse(endDateInput, formatter);
        
        
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        
        
        System.out.println("Number of days between the two dates: " + daysBetween);
        
        sc.close();
    }
}
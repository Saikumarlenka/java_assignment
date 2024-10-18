package Basics;
import java.util.Scanner;

public class Four {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day of the week: ");
        int day = sc.nextInt();
        System.out.println("Enter the no of hours woked: ");
        int hours = sc.nextInt();

        int hourlywages ;

        hourlywages = switch(day){

        case 1,2,3 -> 200;

        case 4,5 -> 400;

        case 6 -> 600;

        case 7 -> 700;

        default -> 0;
        
    };
    sc.close();

    int totalwage = hours * hourlywages;

    if (totalwage > 2000){
        totalwage += totalwage * 0.10;
    }

    System.out.println(totalwage);
    
}
    
}




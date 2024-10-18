package oops_2;
// 29. Accept five strings which contain numbers 
// and display the total for those numbers. Make your program fault tolerant.
import java.util.*;
public class TwentyNine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =1;
        String num;
        int sum=0;
        while (n<6) {
            try{
            num=s.nextLine();
            sum+=Integer.valueOf(num);
            n++;
            }
         catch (NumberFormatException e) {
            System.out.println(e.getLocalizedMessage());
            // TODO: handle exception
        }
            

    }
        
        System.out.println(sum);
        
      
            
        
        
    }
}

// 44. Write a program to accept a string & display each word on a separate line (use any separator)
import java.util.*;
public class FortyFour {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str= s.nextLine();
        String[] arr = str.split("\\s");
        for(String strr:arr){
            System.out.println(strr);
        }
        
        
    
}
}
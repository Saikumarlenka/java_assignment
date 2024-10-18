
// 43. Write a program to accept pan no and check whether it is valid or not.
import java.util.*;
import java.util.regex.Pattern;
public class FortyThree {
    public static void main(String[] args) {
        String regex = "[A-Z]{5}[0-9]{4}[A-Z]{1}";
        
        
        Scanner s = new Scanner(System.in);
        String ss = s.nextLine().toUpperCase();
        if(Pattern.matches(regex, ss)){
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
     
    }
    
}

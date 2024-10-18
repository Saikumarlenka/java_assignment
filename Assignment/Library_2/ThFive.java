package Library_2;
// 35. Write a program to display lines that contains more than 5 characters.

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class ThFive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String file = s.nextLine();
        List<String> arr = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))
        ) {
            String line;
            while ((line=br.readLine())!=null) {
                if(line.length()>=5){
                    arr.add(line);
                }
                
            }
            arr.forEach(System.out::println);
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
    
}

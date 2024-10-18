import java.io.*;
import java.util.*;



public class ThSeven {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("marks.txt");
             Scanner s = new Scanner(System.in);

        ) {
           int i =1;
           while(i<=5){
            String marks=s.nextLine();
            fw.write(marks);
            i++;
           }
           fw.flush();
        
        }
         catch (Exception e) {
            // TODO: handle exception
        }
        
    }
   
        
        
    }
    


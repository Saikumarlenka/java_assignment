package Library_2;
// 33. Write a program to accept names from users until
//  'END' is given and write them into names.txt as one name for the line.

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ThThree {
    public static void main(String[] args) {
        try {
        Scanner s = new Scanner(System.in);
        String file = s.nextLine();
        BufferedWriter fw = new BufferedWriter(new FileWriter(file));
        String str;
        while(!(str=s.nextLine()).equalsIgnoreCase("end")){
            fw.write(str+System.lineSeparator());
            
        }
        fw.flush();
        

        
        
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
    
}

package Library_2;
// 34. Write a program to accept a filename from the user and display
//  how many uppercase, lowercase and digits the file has.

import java.io.FileReader;
import java.util.Scanner;

public class ThFour {
    public static void main(String[] args) {
        try {
        Scanner s = new Scanner(System.in);
        String filename = s.nextLine();
        FileReader fr = new FileReader(filename);
        int ch;
        int uc=0;
        int sc=0;
        int d=0;
        while((ch=fr.read())!=-1){
            if(Character.isUpperCase((char)ch)){
                uc++;
            }
            else if(Character.isLowerCase((char) ch)){
                sc++;

            }
            else if(Character.isDigit(ch)){
                d++;
            }


        }
        System.out.println(uc);
        System.out.println(sc);
        System.out.println(d);


            
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
    
}

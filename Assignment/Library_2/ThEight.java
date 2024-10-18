import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ThEight {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            String src= s.nextLine();
            String trg = s.nextLine();
            FileReader fr = new FileReader(src);
            FileWriter fw = new FileWriter(trg);
            int ch = fr.read();
            while(ch!=-1){
                fw.write(Character.toUpperCase((char)ch));
                ch= fr.read();
            }
            fw.flush();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}

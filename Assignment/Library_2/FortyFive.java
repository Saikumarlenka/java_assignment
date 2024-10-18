// 45. Write a program to accept a file and replace one (or) more spaces with a single space.
import java.io.*;
import java.util.*;
public class FortyFive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String filename = s.nextLine();
        String target = s.nextLine();
        try(BufferedReader br = new BufferedReader(new FileReader(filename));
        FileWriter fw = new FileWriter(target)) {
            String line;
            while((line=br.readLine())!=null){
                fw.write(line.replaceAll("\s+","\s"));
            }
            fw.flush();
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

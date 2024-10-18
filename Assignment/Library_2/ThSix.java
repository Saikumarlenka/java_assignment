package Library_2;
// 36. File Marks.txt, which have marks separated by comma in different lines
// .Find the total marks of each line and display them.(Use fault tolerance)

import java.io.BufferedReader;
import java.io.FileReader;

public class ThSix {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("marks.txt"))) {
            String line;
            int total=0;
            while ((line=br.readLine())!=null) {
                String arr[]= line.split(",");
                for(String num:arr){
                    total+=Integer.parseInt(num);

                }
                
            }
            System.out.println(total);
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}

// 46. Write  a program to accept strings until 'end' is given and sort them and write them into Codes.txt 
// and the string must be one/more alphabets followed by one/more digits.
// (use Regular Expressions)
import java.util.*;
import java.util.regex.Pattern;
import java.io.*;
public class Fortysix {
    public static void main(String[] args) {
        List<String> arr = new ArrayList<>();
           
        try (Scanner s = new Scanner(System.in);
        FileWriter fw = new FileWriter("Codes.txt")) {
            String str;
            String regex = "^[a-zA-Z]+[0-9]+$";
            while(!((str=s.nextLine()).equalsIgnoreCase("end"))){
                if(Pattern.matches(regex, str)){
                    arr.add(str);

                }
                
                


                

            }
            arr.sort(new Comparator<String>() {
                public int compare(String s1, String s2){
                    return s1.compareTo(s2);
                }
                
            });
            arr.forEach(n->{
            try {
                fw.write(n+System.lineSeparator());
            } catch (Exception e) {
                // TODO: handle exception
            }}
            );
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
}

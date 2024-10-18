
import java.util.*;
public class Fortytwo {
    // 42. Create a treeset of strings and sort them by length (use Comparator)

    public static void main(String[] args) {
        // Set<String> arr = new TreeSet<>(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder()));
        Set<String> arr = new TreeSet<>(new Comparator <String>(){
            public int compare(String s1, String s2){
                int lengthdiff= s1.length()-s2.length();
                if(lengthdiff!=0){
                    return lengthdiff;
                }
                else{
                   return s1.compareTo(s2);
                }

            }
        });
        arr.add("mango");
        arr.add("dango");
        arr.forEach(System.out::println);
        
        
    }

    
}

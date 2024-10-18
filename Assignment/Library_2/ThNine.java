// Write a program to take names from names.txt & display unique names in sorted order.

import java.io.*;
import java.util.*;

public class ThNine {
    public static void main(String[] args) {
        Set<String> names= new TreeSet<>();
        try(BufferedReader br = new BufferedReader(new FileReader("names.txt"));
         
        ) {
            String name;
            while ((name=br.readLine())!=null) {
                names.add(name);

                
            }
            names.forEach(System.out::println);
        } catch (Exception e) {
            // TODO: handle exception
        }
        
    }
    
}

package Library_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Forty {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        // Using LinkedHashSet to maintain insertion order and ensure uniqueness
        Set<String> names = new TreeSet<>();
        
        try (
            FileReader fr1 = new FileReader("names1.txt");
            FileReader fr2 = new FileReader("names2.txt");
            BufferedReader br1 = new BufferedReader(fr1);
            BufferedReader br2 = new BufferedReader(fr2);
        ) {
            String name;

            // Reading from the first file and adding names to the set
            while ((name = br1.readLine()) != null) {
                names.add(name);
            }

            // Reading from the second file and adding names to the set
            while ((name = br2.readLine()) != null) {
                names.add(name);
            }

            // Printing unique names in the order they appear
            names.stream().forEach(System.out::println);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Closing the Scanner resource
            s.close();
        }
    }
}

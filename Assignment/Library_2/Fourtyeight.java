import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Fourtyeight {
    public static void main(String[] args) {
        List<String> customers = new ArrayList<>();
        File file = new File("customers.txt");
        Pattern pattern = Pattern.compile("([A-Za-z]+)\\s+([0-9]+)");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                Matcher matcher = pattern.matcher(line);
                if (matcher.matches()) {
                    customers.add(matcher.group(1));
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }

        Collections.sort(customers);
        for (String customer : customers) {
            System.out.println(customer);
        }
    }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fourtyseven {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java Fourtyseven <directory-path> <search-string>");
            return;
        }

        File directory = new File(args[0]);
        String searchString = args[1];

        if (!directory.isDirectory()) {
            System.out.println("Invalid directory path");
            return;
        }

        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    try (Scanner scanner = new Scanner(file)) {
                        while (scanner.hasNextLine()) {
                            String line = scanner.nextLine();
                            if (line.contains(searchString)) {
                                System.out.println("File: " + file.getName());
                                break;
                            }
                        }
                    } catch (FileNotFoundException e) {
                        System.out.println("File not found: " + file.getName());
                    }
                }
            }
        }
    }
}

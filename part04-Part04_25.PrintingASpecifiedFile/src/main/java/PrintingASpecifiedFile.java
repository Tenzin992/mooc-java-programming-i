import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName;
        
        fileName = scanner.nextLine();
        findFile(fileName);

    }

    public static void findFile(String fileName) {
        try ( Scanner scanner = new Scanner(Paths.get(fileName))) {

            // we read the file until all lines have been read
            while (scanner.hasNextLine()) {
                // we read one line
                String row = scanner.nextLine();
                // we print the line that we read
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }
    }
}

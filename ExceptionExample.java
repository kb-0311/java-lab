import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample {
    public ExceptionExample(String message) {
    }

    public static void main(String[] args) {
        // Checked Exception Example
        try {
            FileReader file = new FileReader("file.txt");
            BufferedReader reader = new BufferedReader(file);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Unchecked Exception Example
        try {
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block.");
        }
    }
}

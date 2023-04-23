import java.io.*;
import java.util.*;

public class EmployeeRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> employeeRecords = new ArrayList<String>();
        File file = new File("employee_records.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        while (employeeRecords.size() < 100) {
            System.out.println("Enter employee record in the following format: ID, Name, Position, Salary");
            String input = sc.nextLine();
            employeeRecords.add(input);
        }

        try {
            FileWriter writer = new FileWriter("employee_records.txt");
            for (String record : employeeRecords) {
                writer.write(record + "\n");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("Employee records saved to file.");

        System.out.println("Enter employee ID to search for:");
        String searchId = sc.nextLine();

        try {
            Scanner fileReader = new Scanner(file);
            boolean found = false;
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                if (data.contains(searchId)) {
                    System.out.println("Employee record found: " + data);
                    found = true;
                    break;
                }
            }
            fileReader.close();
            if (!found) {
                System.out.println("Employee record not found.");
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        sc.close();
    }

}

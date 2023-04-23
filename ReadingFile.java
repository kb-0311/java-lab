
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
    public static void main(String[] args) {
        try {


            FileReader myReader = new FileReader("./PharmacyShopInventory.txt");
            BufferedReader bufferedReader = new BufferedReader(myReader);
            String line;
            while ((line= bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


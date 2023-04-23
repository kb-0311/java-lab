

import java.io.FileWriter;
import java.io.IOException;

public class CreatingPharmacyShopInventory {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("./PharmacyShopInventory.txt");
            myWriter.write("Item Name: Aspirin\n");
            myWriter.write("Item Description: Pain reliever\n");
            myWriter.write("Item Code: AS-1234\n");
            myWriter.write("Manufacturer: Bayer\n");
            myWriter.write("Quantity in Stock: 100\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}



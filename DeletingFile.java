

import java.io.File;

public class DeletingFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("./PharmacyShopInventory.txt");
            if (myObj.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


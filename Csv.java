import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Csv {
      public static void loadCSV(String filePath, BST tree) {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values.length >= 5) {
                    String sku = values[0];
                    double priceRetail = Double.parseDouble(values[1]);
                    double priceCurrent = Double.parseDouble(values[2]);
                    String productName = values[3];
                    String category = values[4];
                    tree.insert(sku, productName, category, priceRetail, priceCurrent);
                }
            }
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error al leer el archivo CSV: " + e.getMessage());
        }
    }}


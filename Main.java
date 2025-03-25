import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BST tree = new BST();
        String searchSKU = "";
        
        // Ruta del archivo CSV
        String filePath ="home appliance skus lowes.csv"; 
        
        // Cargar los datos en el BST
        Csv.loadCSV(filePath, tree);

        // String searchSKU = "1002543648"; 
        
        while (!searchSKU.equalsIgnoreCase("exit")) {
    
            System.out.print("Ingrese el SKU del producto a buscar o escribe 'exit' para cerrar el programa: ");
            searchSKU = scanner.nextLine();
            Node result = tree.search(searchSKU);

            if (result != null) {
                System.out.println("Producto encontrado:");
                System.out.println("SKU: " + result.key);
                System.out.println("Nombre: " + result.productName);
                System.out.println("Categoría: " + result.category);
                System.out.println("Precio Retail: " + result.priceRetail);
                System.out.println("Precio Actual: " + result.priceCurrent);
            } else {
                System.out.println("Producto no encontrado.");
            }
        }
}}

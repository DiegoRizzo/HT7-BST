public class Main {
    public static void main(String[] args) {
        BST tree = new BST();
        
        // Reemplaza con la ruta real de tu archivo CSV
        String filePath ="Hoja de trabajo 7\\home appliance skus lowes.csv"; 
        
        // Cargar los datos en el BST
        Csv.loadCSV(filePath, tree);

        String searchSKU = "1002543648"; 
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
}}

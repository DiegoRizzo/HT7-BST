public class Node{
    String key;
    String productName;
    String category;
    double priceRetail;
    double priceCurrent;
    Node left, right;

    public Node(String key, String productName, String category, double priceRetail, double priceCurrent) {
        this.key = key;
        this.productName = productName;
        this.category = category;
        this.priceRetail = priceRetail;
        this.priceCurrent = priceCurrent;
        this.left = this.right = null;
    }
}
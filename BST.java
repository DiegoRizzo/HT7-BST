public class BST {
    private Node root;

    public BST() {
        this.root = null;
    }

    public void insert(String key, String productName, String category, double priceRetail, double priceCurrent) {
        root = insertRec(root, key, productName, category, priceRetail, priceCurrent);
    }

    private Node insertRec(Node root, String key, String productName, String category, double priceRetail, double priceCurrent) {
        if (root == null) {
            return new Node(key, productName, category, priceRetail, priceCurrent);
        }
        if (key.compareTo(root.key) < 0) {
            root.left = insertRec(root.left, key, productName, category, priceRetail, priceCurrent);
        } else if (key.compareTo(root.key) > 0) {
            root.right = insertRec(root.right, key, productName, category, priceRetail, priceCurrent);
        }
        return root;
    }

    public Node search(String key) {
        return searchRec(root, key);
    }

    private Node searchRec(Node root, String key) {
        if (root == null || root.key.equals(key)) {
            return root;
        }
        if (key.compareTo(root.key) < 0) {
            return searchRec(root.left, key);
        }
        return searchRec(root.right, key);
    }
}
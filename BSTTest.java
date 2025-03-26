import org.junit.Assert;
import org.junit.Test;

public class BSTTest {
    @Test
    public void testBSTsearch() {
        BST tree = new BST();
        Assert.assertEquals(null, tree.search("1002543648"));
    }

    @Test
    public void testBSTInsert() {
        BST tree = new BST();
        tree.insert("1002543648", "Samsung 4.5-cu ft High Efficiency Stackable Front-Load Washer (White) ENERGY STAR", "Washers & Dryers", 999.00, 999.00);
        Assert.assertEquals("Samsung 4.5-cu ft High Efficiency Stackable Front-Load Washer (White) ENERGY STAR", tree.search("1002543648").productName);
    }
}

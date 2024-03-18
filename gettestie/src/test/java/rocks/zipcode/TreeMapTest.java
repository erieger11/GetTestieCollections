package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;
public class TreeMapTest {
    Map<String, Integer> trees = new TreeMap<>();

    @Test
    public void treeMapTest1(){
        trees.put("Maple", 30);
        trees.put("Oak", 19);
        trees.put("Birch", 28);
        trees.put("Walnut ", 10);
        trees.put("Willow", 5);

        Assert.assertTrue(trees.containsKey("Maple"));

    }
    @Test
    public void treeMapTest2(){
        trees.put("Maple", 30);
        trees.put("Oak", 19);
        trees.put("Birch", 28);
        trees.put("Walnut ", 10);
        trees.put("Willow", 5);

        Assert.assertEquals(5,trees.size());
    }
}

package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
public class HashSetTest {
    @Test
    public void
    hashsetTest1(){
        Set<String> set = new HashSet<>();
        set.add("zip");
        set.add("code");
        set.add("rocks");
        Assert.assertTrue(set.contains("zip"));
        Assert.assertFalse(set.contains("ZIP"));
    }
    @Test
    public void
    hashsetTest2(){
        Set<String> set = new HashSet<>();
        set.add("zip");
        set.add("");
        set.add("rocks");
        int size = set.size();
        assertEquals(3, size);
        Assert.assertFalse(set.contains(4));
    }
}

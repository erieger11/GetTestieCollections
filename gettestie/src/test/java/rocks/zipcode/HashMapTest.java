package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;
public class HashMapTest {
    HashMap<String, String> capitalCities = new HashMap<>();
    @Test
    public void hashMapTest1(){
            capitalCities.put("England", "London");
            capitalCities.put("Germany", "Berlin");
            capitalCities.put("France", "Paris");
            Assert.assertEquals(3,capitalCities.size());

    }
    @Test
    public void hashMapTest2(){
        HashMap<String, String> capitalCities = new HashMap<String, String>();
            capitalCities.clear();
        Assert.assertEquals(0,capitalCities.size());

    }

}

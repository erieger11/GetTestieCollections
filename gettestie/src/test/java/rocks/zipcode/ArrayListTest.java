package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class ArrayListTest {
    @Test
    public void arrayListTest1(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        Assert.assertEquals(4,numbers.size());

    }
    @Test
    public void arrayListTest2(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.remove(3);
        numbers.remove(1);
        Assert.assertEquals(2,numbers.size());

    }

}

package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

import static org.junit.Assert.*;
public class VectorTest {
    @Test
    public void vectorTest1() {
        Vector<String> goodMorningFull = new Vector<>();
        goodMorningFull.add("Good ");
        goodMorningFull.add("morning ");
        goodMorningFull.add("kind ");
        goodMorningFull.add("sir!");

        goodMorningFull.remove(2);

        Vector<String> goodMorningExpected = new Vector<>();
        goodMorningExpected.add("Good ");
        goodMorningExpected.add("morning ");
        goodMorningExpected.add("sir!");

        Assert.assertEquals(goodMorningFull, goodMorningExpected);
    }

    @Test
    public void vectorTest2(){
        ArrayList<String> words = new ArrayList<>(Arrays.asList("Good ", "morning ", "sir!"));

        Vector<String> goodMorning = new Vector<>();
        goodMorning.addAll(words);

        assertEquals(3, goodMorning.size());

    }
}

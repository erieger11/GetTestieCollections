package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.Assert.*;
public class ComparableTest {
    @Test
    public void comparableTest1(){
        ArrayList<String> alphabet = new ArrayList<>();
        alphabet.add("a");
        alphabet.add("c");
        alphabet.add("d");
        alphabet.add("b");
        alphabet.add("f");
        alphabet.add("e");

        ArrayList<String> expected = new ArrayList<>();
        expected.add("a");
        expected.add("b");
        expected.add("c");
        expected.add("d");
        expected.add("e");
        expected.add("f");

        Collections.sort(alphabet);

        Assert.assertEquals(expected, alphabet);
    }

    @Test
    public void comparableTest2() {
        ArrayList<String> alphabet = new ArrayList<>();
        alphabet.add("a");
        alphabet.add("b");
        alphabet.add("c");
        alphabet.add("d");
        alphabet.add("e");
        alphabet.add("f");

        alphabet.clear();
        alphabet.add("a");

        Assert.assertEquals(1,alphabet.size());
    }

}

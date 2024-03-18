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
        alphabet.add("a");
        alphabet.add("b");
        alphabet.add("c");
        alphabet.add("d");
        alphabet.add("e");
        alphabet.add("f");

       Collections.sort(alphabet);

        Assert.assertEquals(expected, alphabet);


    }

}

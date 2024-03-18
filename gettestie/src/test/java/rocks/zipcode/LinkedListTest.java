package rocks.zipcode;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {
    LinkedList<String> sports = new LinkedList<>();
    @Test
    public void linkedListTest1(){
        sports.add("Football");
        sports.add("Basketball");
        sports.add("Soccer");
        sports.add("Hockey");
        sports.add("Baseball");

        assertEquals("Baseball",sports.get(4));
    }
    @Test
    public void linkedListTest2(){
        sports.add("Football");
        sports.add("Basketball");
        sports.add("Soccer");
        sports.add("Hockey");
        sports.add("Baseball");

        assertEquals("Football",sports.getFirst());
    }
}

package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

import static org.junit.Assert.*;
public class PriorityQueueTest {
    PriorityQueue<String> celebs = new PriorityQueue<>();
    @Test
    public void priorityQueueTest1(){
        celebs.add("Elon Musk");
        celebs.add("Chris Pratt");
        celebs.add("Joe Rogan");

        assertEquals("Chris Pratt", celebs.peek());
    }
    @Test
    public void priorityQueueTest2(){
        celebs.add("Elon Musk");
        celebs.add("Chris Pratt");
        celebs.add("Joe Rogan");

        Assert.assertFalse(celebs.contains("Chris Rogan"));
    }

}

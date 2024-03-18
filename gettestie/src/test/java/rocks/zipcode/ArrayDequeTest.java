package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

import static org.junit.Assert.*;

public class ArrayDequeTest {
    @Test
    public void arrayDequeTest1(){
        Deque<String> stack = new ArrayDeque<>();
        stack.push("first");
        stack.push("second");

        assertEquals("second", stack.getFirst());
    }
    @Test
    public void arrayDequeTest2(){
        Deque<String> queue = new ArrayDeque<>();
        queue.offer("howdy");
        queue.offer("bonjour");
        queue.offer("hola");
        assertEquals("hola", queue.getLast());

    }

}

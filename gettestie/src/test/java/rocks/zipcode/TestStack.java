package rocks.zipcode;

import org.junit.Assert;

import static org.junit.Assert.*;

import java.util.Optional;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }






    @org.junit.Test
    public void TestStackPop(){
        Stack<Integer> newStack1 = new Stack<>();
        newStack1.push(1);
        newStack1.push(2);
        newStack1.push(3);
        newStack1.push(4);

        Integer expected = 4;
        Integer actual = newStack1.pop();

        Assert.assertEquals(expected,actual);

    }
    @org.junit.Test
    public void TestStackPush(){
        Stack<Integer> newStack2 = new Stack<>();
        newStack2.push(1);
        newStack2.push(2);
        newStack2.push(3);
        newStack2.push(4);

        Integer expected = 7;
        Integer actual = newStack2.push(7);

        Assert.assertEquals(expected,actual);
    }
    @org.junit.Test
    public void TestStackPeek(){
        Stack<Integer> newStack3 = new Stack<>();
        newStack3.push(1);
        newStack3.push(2);
        newStack3.push(3);
        newStack3.push(4);
        newStack3.push(5);

        Integer expected = 5;
        Integer actual = newStack3.peek();

        Assert.assertEquals(expected,actual);
    }
    @org.junit.Test
    public void TestStackIsEmpty(){
        Stack<Integer> newStack4 = new Stack<>();
        newStack4.push(1);
        newStack4.push(2);
        newStack4.push(3);
        newStack4.push(4);

        newStack4.clear();

        Assert.assertTrue(newStack4.isEmpty());
    }


}







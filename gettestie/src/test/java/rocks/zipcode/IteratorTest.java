package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.Assert.*;
public class IteratorTest {
    ArrayList<String> states = new ArrayList<>();
    @Test
    public void iteratorTest1(){
        states.add("Alabama");
        states.add("Arkansas");
        states.add("Alaska");

        Iterator<String> excited = states.iterator();
        int index = 0;
        while(excited.hasNext()){
            String theEnd = excited.next();
            states.set(index, new StringBuilder().append(theEnd).append("!").toString());
            index++;
        }
        Assert.assertEquals("Alabama!", states.get(0));
    }
    @Test
    public void iteratorTest2(){

        states.add("Alabama");
        states.add("Arkansas");
        states.add("Alaska");

        Iterator<String> excited = states.iterator();
        int index = 0;
        while(excited.hasNext()){
            String theEnd = excited.next();
            states.set(index, new StringBuilder().append(theEnd).append("!").toString());
            index++;
        }
        Assert.assertEquals("Alaska!", states.get(2));
    }

}

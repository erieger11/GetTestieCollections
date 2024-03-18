package rocks.zipcode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.*;
public class TreeSetTest {
    TreeSet<Integer> luckyNumbers = new TreeSet<>();
    @Test
    public void treeSetTest1(){
        luckyNumbers.add(14);
        luckyNumbers.add(364);
        luckyNumbers.add(345);
        luckyNumbers.add(2);
        luckyNumbers.add(13);

        TreeSet<Integer> expectedSet = new TreeSet<>();
        expectedSet.add(364);
        expectedSet.add(345);
        expectedSet.add(14);
        expectedSet.add(13);
        expectedSet.add(2);

        Set<Integer> subSet = luckyNumbers.subSet(2, 365);

        assertEquals(expectedSet, subSet);

    }
    @Test
    public void treeSetTest2() {
        TreeSet<Integer> luckyNumbers = new TreeSet<>();
        luckyNumbers.add(200);
        luckyNumbers.add(201);
        luckyNumbers.add(202);
        luckyNumbers.add(203);
        luckyNumbers.add(204);

        Set<Integer> subSet = luckyNumbers.tailSet(200);

        assertEquals(subSet, luckyNumbers.subSet(200, true, 204, true));
    }

}

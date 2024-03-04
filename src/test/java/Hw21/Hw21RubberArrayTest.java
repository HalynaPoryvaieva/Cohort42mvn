package Hw21;

import lesson21.hm21.RubberArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * AIT-TR, cohort 42.1, Java Basic,Hw21,Task 1
 * @version 4-Mar-24
 * @author Halyna Poryvaieva
 */
public class Hw21RubberArrayTest {

    private RubberArray rubberArray;

    @BeforeEach
    public void init() {
        rubberArray = new RubberArray();
    }

    @Test
    public void testAdd() {
        Assertions.assertEquals(0, rubberArray.sise());
        rubberArray.add(25);
        Assertions.assertEquals(1, rubberArray.sise());
        Assertions.assertEquals(25, rubberArray.get(0));
    }

    @Test
    public void testAddByIndex() {
        rubberArray.add(25);
        rubberArray.add(25);
        rubberArray.add(25);
        rubberArray.add(7, 1);
        Assertions.assertEquals(4, rubberArray.sise());
        Assertions.assertEquals(7, rubberArray.get(1));
    }

    @Test
    public void testGet() {
        rubberArray.add(12);
        Assertions.assertEquals(12, rubberArray.get(0));
    }

    @Test
    public void testRemove() {
        rubberArray.add(-1);
        rubberArray.add(3);
        Assertions.assertEquals(2, rubberArray.sise());
        rubberArray.remove(1);
        Assertions.assertEquals(1, rubberArray.sise());
    }

    @Test
    public void testContains() {
        rubberArray.add(-1);
        rubberArray.add(3);
        Assertions.assertEquals(true, rubberArray.contains(-1));
        Assertions.assertEquals(false, rubberArray.contains(5));
    }

    @Test
    public void testIndexOf() {
        rubberArray.add(-1);
        rubberArray.add(3);
        Assertions.assertEquals(1, rubberArray.indexOf(3));
        Assertions.assertEquals(-1, rubberArray.indexOf(5));
    }

    @Test
    public void testToStrind(){

        rubberArray.add(-1);
        rubberArray.add(3);
        Assertions.assertEquals("[-1,3]",rubberArray.toString());
    }
}


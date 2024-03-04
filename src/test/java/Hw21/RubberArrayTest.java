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
public class RubberArrayTest {

    private RubberArray rubberArray;

    @BeforeEach
    public void init() {
        rubberArray = new RubberArray();
        rubberArray.add(9);
        rubberArray.add(5);
        rubberArray.add(7);
    }

    //Task1
    @Test
    public void testToString() {
        StringBuilder strSb = new StringBuilder();
        strSb.append("[1,2,3]");
        String expected = "[1,2,3]";
        String actual = strSb.toString();
        Assertions.assertEquals(expected, actual);
    }

    //Task2
    @Test
    public void containsTest() {
        int expected = 9;
        boolean actuale = rubberArray.contains(expected);
        Assertions.assertTrue(actuale);
    }

    //Task3
    @Test
    public void indexOfTest() {
        int expected = 0;
        int actual = rubberArray.indexOf(9);
        Assertions.assertEquals(expected, actual);
    }

    //Task4
    @Test
    public void addTest() {
        int value = 1;
        int index = 2;
        rubberArray.add(1, 2);
        Assertions.assertEquals(value, rubberArray.get(index));
        Assertions.assertEquals(9, rubberArray.toString().length());
    }
}

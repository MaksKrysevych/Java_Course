package Course.Task3;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void test1() {
        int[] arr = new int[]{1,2,3,4,5,6};
        assertEquals(Implementation.IsSorted(null,arr), SortOrder.ASC);
    }

    @Test
    public void test2() {
        assertEquals(Implementation.Transform(null, new int[]{15,10,3}), new int[]{15,11,5});

    }

    @Test
    public void test3() {
        int actual = Implementation.MultArithmeticElements(5,3,4);
        int expected = 6160;
        assertEquals(actual, expected);
    }

    @Test
    public void test4() {
        int actual = Implementation.SumGeometricElements(100,0.5,20);
        int expected = 175;
        assertEquals(actual, expected);
    }
}
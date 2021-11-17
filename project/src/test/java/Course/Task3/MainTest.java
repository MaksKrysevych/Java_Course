package Course.Task3;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void test1() {
        int actual = Implementation.MultArithmeticElements(5,3,4);
        int expected = 6160;
        assertEquals(actual, expected);
    }

    @Test
    public void test2() {
        int actual = Implementation.MultArithmeticElements(-5,3,4);
        int expected = 40;
        assertEquals(actual, expected);
    }

    @Test
    public void test3() {
        int actual = Implementation.MultArithmeticElements(13,51,3);
        int expected = 95680;
        assertEquals(actual, expected);
    }
}
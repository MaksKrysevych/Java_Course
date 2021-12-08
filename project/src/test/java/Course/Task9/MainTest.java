package Course.Task9;
import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void test1() {
        double[][] arr = { {1,2,3}, {1,2,3}, {1,2,3} };

        Matrix matrix = new Matrix(arr);
        System.out.println(matrix.additionOfMatrix());
        assertEquals(18, matrix.additionOfMatrix(), 0);
    }
    @Test
    public void test2() {
        double[][] arr = { {1,2,3}, {1,2,3}, {1,2,3} };

        Matrix matrix = new Matrix(arr);
        System.out.println(matrix.deducationOfMatrix());
        assertEquals(-9, matrix.deducationOfMatrix(), 0);
    }
    @Test
    public void test3() {
        double[][] arr = { {1,2,3}, {1,2,3}, {1,2,3} };

        Matrix matrix = new Matrix(arr);
        System.out.println(matrix.multiplicationOfTMatrix());
        assertEquals(36, matrix.multiplicationOfTMatrix(), 0);
    }
    @Test
    public void test5() {
        double[][] arr = { {1,2,3}, {1,2,3}, {1,2,3} };
        Matrix matrix = new Matrix(arr);
        matrix.setMatrixValue(1,1,24);
        assertEquals(24, matrix.getMatrixValue(1,1), 0);
    }
}
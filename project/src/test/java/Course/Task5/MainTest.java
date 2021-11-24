package Course.Task5;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void test1() {
        assertEquals(new Rectangle(8, 5).area(), 40, 0);
        assertEquals(new Rectangle(8).area(), 40, 0);
        assertEquals(new Rectangle().area(), 12, 0);
        assertEquals(new Rectangle(8, 5).perimeter(), 26, 0);
        assertEquals(new Rectangle(8).perimeter(), 26, 0);
        assertEquals(new Rectangle().perimeter(), 14, 0);
    }
    @Test
    public void test2() {
        Rectangle[] arrOfRectangle = new Rectangle[] {new Rectangle(), new Rectangle(7), new Rectangle(10, 23)};
        ArrayRectangles arrayRectangles = new ArrayRectangles(arrOfRectangle);
        double maxArea = arrayRectangles.numberMaxArea();
        assertEquals(maxArea, 1, 0);
        double minPerimeter = arrayRectangles.numberMinPerimeter();
        assertEquals(minPerimeter, 1, 0);
    }
}
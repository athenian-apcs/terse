import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyTests {
    @Test
    public void testIsBiggerThanTen() {
        assertTrue(MyMain.isBiggerThanTen(11));
        assertTrue(MyMain.isBiggerThanTen(100));
        assertFalse(MyMain.isBiggerThanTen(10));
        assertFalse(MyMain.isBiggerThanTen(0));
        assertFalse(MyMain.isBiggerThanTen(-5));
    }

    @Test
    public void testGetSign() {
        assertEquals("negative", MyMain.getSign(-1));
        assertEquals("negative", MyMain.getSign(-100));
        assertEquals("positive", MyMain.getSign(0));
        assertEquals("positive", MyMain.getSign(1));
        assertEquals("positive", MyMain.getSign(100));
    }

    @Test
    public void testCloserTo5() {
        assertEquals(4, MyMain.closerTo5(4, 7));
        assertEquals(6, MyMain.closerTo5(3, 6));
        assertEquals(5, MyMain.closerTo5(5, 10));
        assertEquals(5, MyMain.closerTo5(0, 5));
        assertEquals(4, MyMain.closerTo5(4, 6)); // Equidistant case, should return first argument
        assertEquals(3, MyMain.closerTo5(3, 7)); // Equidistant case, should return first argument
        assertEquals(-1, MyMain.closerTo5(-1, 15)); // Very different numbers
    }

    @Test
    public void testGetSize() {
        assertEquals("small", MyMain.getSize(0));
        assertEquals("small", MyMain.getSize(9));
        assertEquals("medium", MyMain.getSize(10));
        assertEquals("medium", MyMain.getSize(99));
        assertEquals("large", MyMain.getSize(100));
        assertEquals("large", MyMain.getSize(1000));
        assertEquals("small", MyMain.getSize(-5)); // Negative numbers
    }
}
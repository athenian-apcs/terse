import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class MyTests {
    @Test
    public void testSumAll() {
        assertEquals(15, MyMain.sumAll(Arrays.asList(1, 2, 3, 4, 5)));
        assertEquals(0, MyMain.sumAll(Arrays.asList(0, 0, 0)));
        assertEquals(0, MyMain.sumAll(Collections.emptyList()));
        assertEquals(-5, MyMain.sumAll(Arrays.asList(5, -10)));
    }

    @Test
    public void testProductAll() {
        assertEquals(120, MyMain.productAll(Arrays.asList(1, 2, 3, 4, 5)));
        assertEquals(0, MyMain.productAll(Arrays.asList(1, 2, 0, 4)));
        assertEquals(1, MyMain.productAll(Collections.emptyList()));
        assertEquals(-24, MyMain.productAll(Arrays.asList(2, -3, 4)));
    }

    @Test
    public void testFindMax() {
        assertEquals(Optional.of(5), MyMain.findMax(Arrays.asList(1, 3, 5, 2, 4)));
        assertEquals(Optional.of(10), MyMain.findMax(Arrays.asList(10, 5, 7)));
        assertEquals(Optional.of(-1), MyMain.findMax(Arrays.asList(-1, -5, -3)));
        assertEquals(Optional.empty(), MyMain.findMax(Collections.emptyList()));
    }

    @Test
    public void testCountStringsWithLength() {
        assertEquals(3, MyMain.countStringsWithLength(Arrays.asList("cat", "dog", "mouse", "rat"), 3));
        assertEquals(0, MyMain.countStringsWithLength(Arrays.asList("hello", "world"), 3));
        assertEquals(0, MyMain.countStringsWithLength(Collections.emptyList(), 5));
        assertEquals(3, MyMain.countStringsWithLength(Arrays.asList("a", "b", "c", "def"), 1));
    }

    @Test
    public void testAverageIfAllPositive() {
        assertEquals(Optional.of(3.0), MyMain.averageIfAllPositive(Arrays.asList(1, 2, 3, 4, 5)));
        assertEquals(Optional.empty(), MyMain.averageIfAllPositive(Arrays.asList(1, 2, -3, 4)));
        assertEquals(Optional.empty(), MyMain.averageIfAllPositive(Collections.emptyList()));
    }

    @Test
    public void testFindLongestStrings() {
        assertEquals(Arrays.asList("elephant", "platypus"),
                MyMain.findLongestStrings(Arrays.asList("cat", "dog", "elephant", "platypus", "mouse")));
        assertEquals(Arrays.asList("apple"),
                MyMain.findLongestStrings(Arrays.asList("apple", "cat", "dog")));
        assertEquals(Collections.emptyList(),
                MyMain.findLongestStrings(Collections.emptyList()));
    }

    @Test
    public void testExtractValidUserIds() {
        assertEquals(Arrays.asList("USER_00123", "USER_00456", "USER_12345"),
                MyMain.extractValidUserIds(Arrays.asList("USER_00123", "invalid", "USER_00456", "USER_1234", "USER_123456", "USER_12345")));
        assertEquals(Collections.emptyList(),
                MyMain.extractValidUserIds(Arrays.asList("user_12345", "USER123456", "User_00123")));
    }
}
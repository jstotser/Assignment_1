import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

// Test for Finder Class
public class JUnitTest {

    // Test methods for valid arrays with findMax and findMin functions
    @Test
    public void testFindMax_ValidArray() {
        int validArray[] = {0, 5, -1, -3, 7, 25, 24};
        Integer maxReturned = Finder.findMax(validArray);
        assertEquals((long)26, (long)maxReturned);
    }
    @Test
    public void testFindMin_ValidArray () {
        int validArray[] = {0, 5, -1, -3, 7, 24, 26};
        Integer minReturned = Finder.findMin(validArray);
        assertEquals((long)-3, (long)minReturned);
    }

    // Test methods for invalid arrays for findMax
    @Test
    public void testFindMax_EmptyArray() {
        int invalidArray[] = {};
        Integer maxReturned = Finder.findMax(invalidArray);
        assertNull(maxReturned);
    }
    @Test
    public void testFindMax_NullArray() {
        int invalidArray[] = null;
        Integer maxReturned = Finder.findMax(invalidArray);
        assertNull(maxReturned);
    }

    // Test methods for invalid arrays for findMin
    @Test
    public void testFindMin_EmptyArray() {
        int invalidArray[] = {};
        Integer minReturned = Finder.findMin(invalidArray);
        assertNull(minReturned);
    }
    @Test
    public void testFindMin_NullArray() {
        int invalidArray[] = null;
        Integer minReturned = Finder.findMax(invalidArray);
        assertNull(minReturned);
    }
}

package slidingWindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static slidingWindow.Main.*;

class MainTest {

    @Test
    void test() {
        assertEquals(9, maxSumSubarrayK(new int[] {2, 1, 5, 1, 3, 2}, 3));
    }

    @Test
    void test2() {
        assertEquals(7, maxSumSubarrayK(new int[] {2, 3, 4, 1, 5}, 2));
    }


    @Test
    void test3() {
        assertEquals(2, smallestSubarrayGivenSum(new int[] {2, 1, 5, 2, 3, 2}, 7));
        assertEquals(1, smallestSubarrayGivenSum(new int[] {2, 1, 5, 2, 8}, 7));
        assertEquals(3, smallestSubarrayGivenSum(new int[] {3, 4, 1, 1, 6}, 8));
        assertEquals(0, smallestSubarrayGivenSum(new int[] {3, 4, 1, 1, 6}, 100));
    }
}
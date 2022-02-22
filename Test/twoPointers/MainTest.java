package twoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static twoPointers.Main.*;

class MainTest {

    @Test
    void test1() {
        assertArrayEquals(new int[] {1, 3}, pairSum(new int[] {1, 2, 3, 4, 6}, 6));
        assertArrayEquals(new int[] {0, 2}, pairSum(new int[] {2, 5, 9, 11}, 11));
    }

    @Test
    void test2() {
        assertEquals(4, removeDuplicates(new int[] {2, 3, 3, 3, 6, 9, 9}));
        assertEquals(2, removeDuplicates(new int[] {2, 2, 2, 11}));
    }

    @Test
    void test3() {
        assertArrayEquals(new int[] {0, 1, 4, 4, 9}, squareSortedArray(new int[] {-2, -1, 0, 2, 3}));
        assertArrayEquals(new int[] {0, 1, 1, 4, 9}, squareSortedArray(new int[] {-3, -1, 0, 1, 2}));
    }
}
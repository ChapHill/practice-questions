package twoPointers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

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

    @Test
    void test4() {

    }

    @Test
    void test5() {
        assertEquals(1, threeSumClosestToTarget(new int[] {-2, 0, 1, 2}, 2));
        assertEquals(0, threeSumClosestToTarget(new int[] {-3, -1, 1, 2}, 1));
        assertEquals(3, threeSumClosestToTarget(new int[] {1, 0, 1, 1}, 100));
    }

    @Test
    void test6() {
        assertEquals(2, threeSumSmallerThanTarget(new int[] {-1, 0, 2, 3}, 3));
        assertEquals(4, threeSumSmallerThanTarget(new int[] {-1, 4, 2, 1, 3}, 5));
    }
}
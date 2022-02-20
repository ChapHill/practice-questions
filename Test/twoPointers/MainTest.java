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
}
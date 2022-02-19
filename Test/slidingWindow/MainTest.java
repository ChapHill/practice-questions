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

    @Test
    void test4() {
        assertEquals(4, longestSubstringKDistinct("araaci", 2));
        assertEquals(2, longestSubstringKDistinct("araaci", 1));
        assertEquals(5, longestSubstringKDistinct("cbbebi", 3));
    }

    @Test
    void test5() {
        assertEquals(3, fruitsIntoBaskets(new char[] {'A', 'B', 'C', 'A', 'C'}));
        assertEquals(5, fruitsIntoBaskets(new char[] {'A', 'B', 'C', 'B', 'B', 'C'}));
        assertEquals(5, fruitsIntoBaskets(new char[] {'A','A','A','B','C','B','B','C','A','A','Z'}));
    }

    @Test
    void test6() {
        assertEquals(3, noRepeatSubstring("aabccbb"));
        assertEquals(2, noRepeatSubstring("abbbb"));
        assertEquals(3, noRepeatSubstring("abccde"));
    }

    @Test
    void test7() {
        assertEquals(5, longestSubstringAfterReplace("aabccbb", 2));
        assertEquals(4, longestSubstringAfterReplace("abbcb", 1));
        assertEquals(3, longestSubstringAfterReplace("abccde", 1));
    }
}
package slidingWindow;

import java.util.HashMap;
import java.util.HashSet;

/**
 * In problems when dealing with a contiguous array or list of a given size,
 * sliding window shines
 */
public class Main {

    public static void main(String[] args) {

    }


    //given array of positive numbers and positive 'k' find the maximum
    //sum of any contiguous subarray of size 'k'
    public static int maxSumSubarrayK(int[] array, int k) {
        int max = 0;
        int left = 0;
        int sum = 0;

        for(int right = 0; right < array.length; right++) {
            sum += array[right];

            if(right >= k-1) {
                max = Math.max(max, sum);
                sum -= array[left++]; //move left pointer up as well
            }
        }

        return max;
    }


    //given an array of positive numbers and positive 'sum' find the length of the smallest
    //contiguous subarray whose sum is greater than or euqal to 'sum'. Return 0 if DNE
    public static int smallestSubarrayGivenSum(int[] array, int sum) {
        int left = 0;
        int smallest = Integer.MAX_VALUE;
        int currSum = 0;

        for(int right = 0; right < array.length; right++) {
            currSum += array[right];

            while(currSum >= sum) {
                smallest = Math.min(smallest, right-left + 1);
                currSum -= array[left++];
            }
        }

        return smallest == Integer.MAX_VALUE ? 0 : smallest;
    }


    //given a string, find the length of the longest substring in it with no more
    //than K distinct characters
    public static int longestSubstringKDistinct(String s, int k) {
        int left = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
            //map.put(c, map.getOrDefault(c, 0) + 1);
            //or --->
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

            while(map.size() > k) {
                char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);

                if(map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }
                left++;
            }
            max = Math.max(max, right - left + 1);
        }

        return max;
    }


    public static int fruitsIntoBaskets(char[] arr) {
        int left = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for(int right = 0; right < arr.length; right++) {
            char c = arr[right];
            map.put(c, map.getOrDefault(c, 0) + 1);

            while(map.size() > 2) {
                char leftChar = arr[left];
                map.put(leftChar, map.get(leftChar) - 1);

                if(map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }

    public static int noRepeatSubstring(String s) {
        int left = 0;
        int max = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for(int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if(map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }

            map.put(c, right);
            max = Math.max(max, right - left + 1);
        }

        return max;
    }

}

package slidingWindow;
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

}

package twoPointers;

public class Main {

    //given an array of sorted nums and a target sum... find the pair in the array
    //that add up to the target sum and return their indicies.
    public static int[] pairSum(int[] nums, int target) {
        int i = 0;
        int j = nums.length-1;
        while(i < j) {
            int potential = nums[i] + nums[j];

            if(potential == target) {
                return new int[] {i, j};
            } else if(potential > target) {
                j--;
            } else {
                i++;
            }
        }
        
        //pair not found
        return new int[] {0, 0};
    }
}

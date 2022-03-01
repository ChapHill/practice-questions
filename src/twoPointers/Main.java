package twoPointers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        threeSum(new int[] {-3, 0, 1, 2, -1, 1, -2});
    }

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

    //given array of sorted numbers remove all duplicates and do it in place
    //do not use extra space
    //return the 'length' of the new array
    public static int removeDuplicates(int[] arr) {
        int curr = 1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]) {
                continue;
            } else {
                arr[curr++] = arr[i];
            }
        }

        return curr;
    }

    public static int[] squareSortedArray(int[] arr) {
        int[] ret = new int[arr.length];
        int i = 0;
        int j = arr.length-1;
        int k = ret.length-1;

        while(i <= j) {
            if(Math.abs(arr[i]) > Math.abs(arr[j])) {
                ret[k--] = arr[i] * arr[i];
                i++;
            } else {
                ret[k--] = arr[j] * arr[j];
                j--;
            }
        }

        return ret;
    }

    //return a list of lists containing all the possible combinations of
    //3 numbers to sum to zero... do not include duplicate entries
    public static List<List<Integer>> threeSum(int[] array) {
        Arrays.sort(array);
        List<List<Integer>> list = new LinkedList<>();

        for(int i = 0; i < array.length-2; i++) {
            if(i == 0 || i > 0 && array[i] != array[i-1]) {
                int low = i + 1;
                int high = array.length-1;
                int sum = 0 - array[i];

                while(low < high) {
                    if(array[low] + array[high] == sum) {
                        list.add(Arrays.asList(array[i], array[low], array[high]));

                        while(low < high && array[low] == array[low+1]) {
                            low++;
                        }

                        while(low < high && array[high] == array[high-1]) {
                            high--;
                        }

                        low++;
                        high--;
                    } else if(array[low] + array[high] < sum) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }

        return list;
    }

    public static int threeSumClosestToTarget(int[] arr, int target) {
        Arrays.sort(arr);
        int close = arr[0] + arr[1] + arr[2];

        for(int i = 0; i < arr.length-2; i++) {
            int low = i + 1;
            int high = arr.length-1;

            while(low < high) {
                int potential = arr[i] + arr[low] + arr[high];

                if(Math.abs(potential - target) < Math.abs(close - target)) {
                    close = potential;
                }

                if(arr[i] + arr[low] + arr[high] < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }

        return close;

    }

    public static int threeSumSmallerThanTarget(int[] arr, int target) {
        Arrays.sort(arr);
        int count = 0;

        for(int i = 0; i < arr.length-2; i++) {
            int low = i + 1;
            int high = arr.length-1;

            while(low < high) {
                int potential = arr[i] + arr[low] + arr[high];

                if(potential < target) {
                    count += high - low;
                }

                if(potential < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }

        return count;
    }

    public static int[] dutchNationalFlag(int[] arr) {
        int low = 0;
        int high = arr.length-1;

        for(int i = 0; i <= high;) {
            if(arr[i] == 0) {
                int temp = arr[i];
                arr[i] = arr[low];
                arr[low] = temp;
                i++; low++;
            } else if(arr[i] == 1) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[high];
                arr[high] = temp;
                high--;
            }
        }

        return arr;
    }
}

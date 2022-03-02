package fastSlowPointers;

import java.util.HashSet;

public class Main {

    private static int compute(int n) {
        int sum = 0;
        while(n != 0) {
            sum += (n%10) * (n%10);
            n /= 10;
        }

        return sum;
    }

    public static boolean happyNumber(int n) {
        /*HashSet<Integer> set = new HashSet<>();

        while(n != 1) {
            int curr = n;
            int sum = 0;
            while(curr > 0) {
                int digit = curr % 10;
                sum += digit * digit;
                curr /= 10;
            }

            if(set.contains(sum)) {
                return false;
            }

            set.add(sum);
            n = sum;
        }

        return true;*/


        int slow = n;
        int fast = n;

        do {
            slow = compute(slow);
            fast = compute(compute(fast));

            if(slow == 1) {
                return true;
            }
        } while(slow != fast);

        return false;


    }
}

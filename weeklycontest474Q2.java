
import java.util.*;

public class weeklycontest474Q2 {
    public static long maxProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        long answer = Long.MIN_VALUE;

        long R = 100000;
        long L = -100000;

        // Function to get max product of any 3 numbers in array
        // when nums[i] is replaced by val
        for (int i = 0; i < n; i++) {

            int original = nums[i];

            // Try replacing nums[i] with +100000
            nums[i] = (int) R;
            answer = Math.max(answer, computeMaxTriple(nums));

            // Try replacing nums[i] with -100000
            nums[i] = (int) L;
            answer = Math.max(answer, computeMaxTriple(nums));

            // Restore
            nums[i] = original;
        }

        return answer;
    }

    private static long computeMaxTriple(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);

        long a = nums[n-1], b = nums[n-2], c = nums[n-3];
        long x = nums[0], y = nums[1];

        return Math.max(a*b*c, a*x*y);
    }
    public static void main(String[] args) {
        int nums[] = {-5,7,0};
        System.out.println(maxProduct(nums));
    }
}

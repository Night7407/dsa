import java.util.Arrays;

public class BiweeklyContest192 {


    public static int longestSubarray(int[] nums, int k) {
        // int maxlen = 0;
        // for(int i = 0;i<nums.length;i++){
        //     int sum = 0;
        //     for(int j = i;j<nums.length;j++){
        //         sum += nums[j];

        //         if(sum % k == 0){
        //             maxlen = Math.max(maxlen,j-i+1);
        //         }
        //         for(int a = i;a<=j;a++){
        //             int newSum = sum - 2 * nums[a];

        //             if(newSum % k == 0){
        //                 maxlen = Math.max(maxlen,j-i+1);
        //                 break;
        //             }
        //         }
        //     }     
        // }
        // return maxlen;

        int n = nums.length;
        long[] S = new long[n + 1];
        for (int t = 1; t <= n; t++) {
            S[t] = S[t - 1] + nums[t - 1];
        }
 
        int maxLen = 0;
 
       
        int[] firstSeen = new int[k];
        Arrays.fill(firstSeen, -1);
        firstSeen[0] = 0; // S[0] = 0
        for (int t = 1; t <= n; t++) {
            int r = (int) (((S[t] % k) + k) % k);
            if (firstSeen[r] == -1) {
                firstSeen[r] = t;
            } else {
                maxLen = Math.max(maxLen, t - firstSeen[r]);
            }
        }
 
       
        int[] leftMin = new int[k];
        Arrays.fill(leftMin, -1);
 
        for (int a = 0; a < n; a++) {
            int ra = (int) (((S[a] % k) + k) % k);
            if (leftMin[ra] == -1) leftMin[ra] = a;
 
            long twoNumsA = ((2L * nums[a]) % k + k) % k;
            for (int m = a + 1; m <= n; m++) {
                int target = (int) ((((S[m] - twoNumsA) % k) + k) % k);
                if (leftMin[target] != -1) {
                    maxLen = Math.max(maxLen, m - leftMin[target]);
                }
            }
        }
 
        return maxLen;
    }

    public static void main(String[] args) {
        int nums[] = {5,3,4};
        int k = 7;
        System.out.println(longestSubarray(nums, k));
    }
}

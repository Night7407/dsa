import java.util.*;

public class BiweeklyContest181 {
    // public static int findMax(int nums[]){
    //     int max = Integer.MIN_VALUE;
    //     int j = 0;
    //     for(int i = 0;i<nums.length;i++){
    //         if(nums[i]>max){
    //             max = nums[i];
    //             j = i;
    //         }
    //     }
    //     return j;
    // }
    // public static int compareBitonicSums(int[] nums) {
    //     int max_nums = findMax(nums);
    //     long sum1 = 0;
    //     long sum2 = 0;
    //     for(int i = 0;i<=max_nums;i++){
    //         sum1+=nums[i];
    //     }
    //     for(int j = max_nums;j<nums.length;j++){
    //         sum2 += nums[j];
    //     }
    //     if(sum1>sum2){
    //         return 0;
    //     }
    //     else if(sum1 == sum2){
    //         return -1;
    //     }
    //     return 1;
    // }

    public static int[] kthRemainingInteger(int[] nums, int[][] queries) {
        int ans[] = new int[queries.length];
        int kIdx = 0;

        for (int q[] : queries) {
            int l = q[0];
            int r = q[1];
            int x = q[2];

        
        List<Integer> even_check = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (nums[i] % 2 == 0) {
                even_check.add(nums[i] / 2); 
            }
        }

        int prev = 0;
        int res = 0;

        for (int i = 0; i < even_check.size(); i++) {
            int curr = even_check.get(i);

            int missing = curr - prev - 1;

            if (x <= missing) {
                res = prev + x;
                break;
            }

            x -= missing;
            prev = curr;
        }

        if (res == 0) {
            res = prev + x;
        }

        ans[kIdx++] = res * 2; 
    }

    return ans;    
    }
    public static void main(String[] args) {
        int nums[] = {1,4,7};
        int queries[][] = {{0,2,1},{1,1,2},{0,0,3}};
        System.out.println(Arrays.toString(kthRemainingInteger(nums, queries)));
    }
}




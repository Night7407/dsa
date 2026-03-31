public class leetcode3640 {
    public static long maxSumTrionic(int[] nums) {
        long maxsum = Integer.MIN_VALUE;
        int l = 0,r = nums.length-1;
        while(r-l+1>=5){
            int p = -1,q = -1;
            
            for(int i = l;i<r;i++){
                if(nums[i] >= nums[i+1]){
                    p = i;
                    break;
                }
            }
            if (p == -1) {
                l++;
                r--;
                continue;
            }
            for(int i = r;i>l;i--){
                if(nums[i] <= nums[i-1]){
                    q = i;
                    break;
                }
            }
            if (q == -1 || q <= p) {
                l++;
                r--;
                continue;
            }
            
            boolean validMid = true;
            for (int i = p; i < q - 1; i++) {
                if (nums[i] <= nums[i + 1]) {
                    validMid = false;
                    break;
                }
            }

            if (validMid) {
                long sum = 0;
                for (int i = l; i <= r; i++) {
                    sum += nums[i];
                }
                maxsum = Math.max(maxsum, sum);
            }

            l++;
            r--;
        }
        return maxsum;
        
    }

    public static void main(String[]args){
        int nums[] = {0,-2,-1,-3,0,2,-1};
        System.out.println(maxSumTrionic(nums));
    }
}




public class leetcode1493 {
   
    public static int longestSubarray(int[] nums) {
        int left = 0;
        int maxlength= 0;
        int zerocount =0;
        for(int right= 0 ;right<nums.length;right++){
            if(nums[right] == 0){
                zerocount++;
            }
            System.out.println(right);
            while(zerocount>1){
                if(nums[left] == 0){
                    zerocount--;
                }
                left++;
                System.out.println(left);
            }
            maxlength = Math.max(maxlength, right-left);
        }
        return maxlength;
    }
    public static void main(String[]args){
        int num[] = {0,1,1,1,0,1,1,0,1};
        System.out.println(longestSubarray(num));

    }
}

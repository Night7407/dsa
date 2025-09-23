
public class nicesubarray {
    
    public static int longestNiceSubarray(int[] nums) {
        int maxcount = 0,l = 0,current = 0;
        for(int i = 0;i<nums.length;i++){
            while((current & nums[i]) != 0){
                current^=nums[l];
                l++;
            }
            current |= nums[i];
            maxcount = Math.max(maxcount, i - l + 1);
        }

        return maxcount;

    }
    public static void main(String[] args) {
        int nums[] ={1,3,8,48,10};
        System.out.println(longestNiceSubarray(nums));
    }
}



public class leetcode3835 {
    // public static long isSub(int nums[],int l,int r){
    //     long max = Long.MIN_VALUE;
    //     long min = Long.MAX_VALUE;
    //     for(int i = l;i<=r;i++){
    //         if(nums[i]>max){
    //             max = nums[i];
    //         }
    //     }
    //     for(int j = l;j<=r;j++){
    //         if(nums[j]<min){
    //             min = nums[j];
    //         }
    //     }
    //     return max-min;
    // }
    public static long countSubarrays(int[] nums, long k) {
        long count = 0;
        
        for(int i = 0;i<nums.length;i++){
            long min = nums[i];
            long max = nums[i];
            for(int j= i;j<nums.length;j++){
                min = Math.min(min,nums[j]);
                max = Math.max(max,nums[j]);
                

                if((max-min)*(j-i+1)<=k){
                    count++;
                }
            }
        }
        return count;
        
    }
    public static void main(String[]args){
        int nums[] = {1,2,3};
        long k = 4;
        System.out.println(countSubarrays(nums, k));
    }
}

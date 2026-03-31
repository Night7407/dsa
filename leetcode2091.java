public class leetcode2091 {
    public static int getmaxIndex(int nums[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }
        return max;
    
    }

    public static int getminIndex(int nums[]){
        int min=Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;
    }
    public static int minimumDeletions(int[] nums) {
        int max = getmaxIndex(nums);
        int min = getminIndex(nums);
        int max_index  = 0;
        int min_index  = 0;

        for(int i =0;i<nums.length;i++){
            if(nums[i] == max){
                max_index = i;
            }
        }
        for(int i =0;i<nums.length;i++){
            if(nums[i] == min){
                min_index = i;
            }
        }
        int result = Integer.MAX_VALUE;
        int mid = (0+nums.length-1)/2;
    
        
    }
}

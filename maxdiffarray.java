public class maxdiffarray {
    public static int maximumDifference(int[] nums){
        int max = Integer.MIN_VALUE;
        int i = 0,n = nums.length;
        while(i<n-1){
            for(int j = i+1;j<n;j++){
                if(i<j && nums[i]<nums[j]){
                    int diff = nums[j]-nums[i];
                    max = Math.max(max, diff);
        
                }
               
            }
            i++;
            
        }
        if (max == Integer.MIN_VALUE) return -1;

        return max;
    }
    public static void main(String [] args){
        int nums[] = {9,4,3,2};
        System.out.println(maximumDifference(nums));
    }
}

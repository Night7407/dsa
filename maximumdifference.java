public class maximumdifference{
    public static int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int max = Math.abs(nums[n-1] - nums[0]);
        for(int i = 0;i<n-1;i++){
            int diff = Math.abs(nums[i] - nums[i+1]);
            if(diff>max){
                max = diff;
            }
        }
        return max;


    }
    public static void main(String[]args){
        int nums[] = {-5,-10,-5};
        System.out.println(maxAdjacentDistance(nums));
    }

}
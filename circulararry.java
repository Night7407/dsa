class circulararry{
    public static int maxSubarraySumCircular(int[] nums) {
        if(nums.length == 1) return nums[0];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int total = 0,currentmin = 0;
        int currentmax = 0;
        int n = nums.length;
        for(int i = 0;i<n;i++){
            total +=nums[i];
            currentmax = Math.max(nums[i],currentmax+nums[i]);
            max= Math.max(max,currentmax);

            currentmin = Math.min(nums[i],currentmin+nums[i]);
            min= Math.min(min,currentmin);
        }
        if(max<0){
            return max;
        }
    
        return Math.max(max,total-min);
    }
    public static void main(String[] args) {
        int nums[] = {8,-15,-29,-19};
        System.out.println(maxSubarraySumCircular(nums));   
    }
}
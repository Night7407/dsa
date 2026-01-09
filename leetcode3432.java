class leetcode3432{
    public static int countPartitions(int[] nums) {
        int count = 0;
        int totalsum = 0;
        int leftsum = 0;
        int rightsum = 0;
        for(int num:nums){
            totalsum += num;
        }
        for(int i = 0;i<nums.length-1;i++){
            leftsum +=nums[i];
            rightsum = totalsum - leftsum;
            if((rightsum-leftsum) % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[]args){
        int nums[] = {10,10,3,7,6};
        System.out.println(countPartitions(nums));
    }
}
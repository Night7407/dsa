class leetcode1848{
    public static int getMinDistance(int[] nums, int target, int start) {
        int distance = Integer.MAX_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target){
                int current_distance = Math.abs(i-start);
                distance = Math.min(current_distance,distance);
            }
        }
        return distance;
    }
    public static void main(String[]args){
        int nums[] = {1,2,3,4,5};
        int target = 5;
        int start = 3;
        System.out.println(getMinDistance(nums, target, start));
    }
}
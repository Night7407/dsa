public class trinangle{
    public static String triangleType(int[] nums) {
        if (nums[0] + nums[1] <= nums[2] || 
            nums[0] + nums[2] <= nums[1] || 
            nums[1] + nums[2] <= nums[0]) {
            return "none";
    }
    if(nums[0] == nums[1] && nums[1]== nums[2]){
        return "equilateral";
    }
    else if(nums[0] == nums[1] || nums[1] ==nums[2] || nums[0] == nums[2]){
        return "isosceles";
    }
    else{
        return "scalene";
    }
}
    public static void main(String[] args) {
        int nums[] = {2,7,7};
        String x = triangleType(nums);
        System.out.println(x);
    }
}

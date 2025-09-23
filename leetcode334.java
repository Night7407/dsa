public class leetcode334 {
    public static boolean increasingTriplet(int[] nums) {
        if(nums.length<3) return false;
        int first_largest = Integer.MAX_VALUE;
        int second_largest = Integer.MAX_VALUE;
        for(int num:nums){
            if(num<=first_largest){
                first_largest = num;
            }
            else if(num<=second_largest){
                second_largest = num;
            }
            else{
                return true;
            }
        }
        return false;

    }
    public static void main(String []args){
        int nums[] = {1,2,3,4,5};
        System.out.println(increasingTriplet(nums));
    }
}

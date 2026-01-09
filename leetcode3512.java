public class leetcode3512 {
    public static int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int num:nums){
            sum+= num;
        }
        if(sum<k){
            return sum;
        }
        else if(sum %k == 0){
            return 0;
        }
        int diff = sum - k;
        return sum-diff-1;
    }
    public static void main(String[]args){
        int nums[] = {18};
        int k = 5;
        System.out.println(minOperations(nums,k));
    }
}

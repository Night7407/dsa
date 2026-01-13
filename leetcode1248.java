public class leetcode1248 {
    public static int numberOfSubarrays(int[] nums, int k) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            int odd_count = 0;
            for(int j = i;j<nums.length;j++){
                if(nums[j] %2 !=0){
                    odd_count++;
                    
                }
                if (odd_count == k) {
                    count++;
                } else if (odd_count > k) {
                    break;              
                } 
            }
        }
        return count;
    }
    public static void main(String[]args){
        int nums[] = {2,2,2,1,2,2,1,2,2,2};
        int k = 2;
        System.out.println(numberOfSubarrays(nums, k));
    }
}

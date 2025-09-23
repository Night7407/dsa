

public class leetcode461 {
    public static boolean isSorted(int[] nums) {
    for (int i = 1; i < nums.length; i++) {
        if (nums[i] < nums[i - 1]) {
            return false;
        }
    }
    return true;
}
    public static boolean isTrionic(int[] nums) {
        // int p = 0,q=0;
        // if(isSorted(nums)) return false;
        // for(int i = 0;i<nums.length-1;i++){
        //     if(nums[i]> nums[i+1] && nums[i+1] > nums[i+2]){
        //         p = nums[i+2];
        //         q = nums[i+1];
        //         System.out.println(p);
        //         System.out.println(q);
        //     }
        // }
        // for(int i = 0;i<p;i++){
        //     if(nums[i]> nums[i+1]){
        //         return false;
        //     }
        // }
        // for(int i = p;i<q;i++){
        //     if(nums[i]< nums[i+1]){
        //         return false;
        //     }
        // }
        // for(int i= q;i<nums.length-1;i++){
        //     if(nums[i]> nums[i+1]){
        //         return false;
        //     }
        // }
        // return true;

        int n = nums.length;
        int i = 0;

        while (i < n - 1 && nums[i] < nums[i + 1]) {
            i++;
        }

       
        if (i == 0) return false;

    
        int p = i;
        while (i < n - 1 && nums[i] > nums[i + 1]) {
            i++;
        }

        
        if (i == p) return false;

      
        int q = i;
        while (i < n - 1 && nums[i] < nums[i + 1]) {
            i++;
        }

      
        if (i == q) return false;

        return i == n - 1;
    }
    public static void main(String[]args){
        int nums[] = {1,3,5,4,2,6};
        System.out.println(isTrionic(nums));
    }
}

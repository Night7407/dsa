import java.util.Arrays;

class leetcode324{
    public static int[] helpme(int nums[]){
        Arrays.sort(nums);
        int ans[] = new int[nums.length];
       
        // while(l!=r &&i<nums.length){
        //     ans[i] = nums[l];
        //     i++;
        //     ans[i] = nums[r];
        //     i++;
        //     l++;
        //     r--;
        // }
        // return ans;
        // ans[i++] = nums[l++];
        //     if (i < nums.length) {
        //         ans[i++] = nums[r--];
        //     }
        // }
        // return ans;

        int n = nums.length;
        int left = (n - 1) / 2;  
        int right = n - 1;       

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                ans[i] = nums[left--];
            } 
            else {
            ans[i] = nums[right--];
        }
    }
    return ans;
    }
        
    public static void wiggleSort(int[] nums){
        int[] result = helpme(nums);

        
        for (int i = 0; i < nums.length; i++) {
            nums[i] = result[i];
        }
        
    }
    public static void main(String[]args){
        int nums[] = {1,3,2,2,3,1};
        wiggleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
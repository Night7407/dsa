import java.util.Arrays;

public class finddouble {
    public static int findDuplicate(int[] nums){
        Arrays.sort(nums);
        // int n = nums.length;
        // int low = nums[0],high = nums[n-1];
        // while(low<=high){
        //     int mid = (low+high)/2;
        //     if(nums[mid] == nums[mid-1] || nums[mid] == nums[mid+1]){
        //         return nums[mid];
        //     }
        //     else{
        //         low = mid+1;
        //     }
        // }
        // return -1;
        // 
        int n = nums.length;
        for(int  i = 0;i<n;i++){
            if((nums[i]^nums[i+1]) == 0) return nums[i];
        }
        return -1;

    }
    public static void main(String[] args) {
        int nums[] = {3,1,3,4,2};
        System.out.println(findDuplicate(nums));   
    }
}

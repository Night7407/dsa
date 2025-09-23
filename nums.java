import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class nums {
    public  static int findValueOfPartition(int[] nums) {
        ArrayList<Integer> nums1 = new ArrayList<Integer>();
        ArrayList<Integer> nums2 = new ArrayList<Integer>();
        // Arrays.sort(nums);
        int max1 = Arrays.stream(nums).max().getAsInt();
        int n = nums.length;
        int m = (n/2)+1;
        for(int i = 0;i<n;i++){
            if(i<m && nums[i] >= max1 ){
                nums2.add(nums[i]);
            }
            else{
                nums1.add(nums[i]);
            }
        }
        System.out.println("Array one is " +nums1);
        System.out.println("Array two is " +nums2);

        int max = Collections.max(nums1);
        int min = Collections.min(nums2);
        return Math.abs(max-min);
       
    }

    public static void main(String[]args){
        int nums[] = {100,1,10};
        System.out.println(findValueOfPartition(nums));
        
    }
}

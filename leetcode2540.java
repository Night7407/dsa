import java.util.*;

public class leetcode2540 {
    public static int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> set = new TreeSet<>();
        for(int i = 0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        for(int i = 0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                return nums2[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int nums1[] = {1,2,3};
        int nums2[] = {2,3};
        System.out.println(getCommon(nums1, nums2));
    }
}

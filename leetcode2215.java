import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class leetcode2215 {
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        HashSet<Integer> nums1s = new HashSet<>();
        HashSet<Integer> nums2s = new HashSet<>();
        for(Integer nums:nums1){
            nums1s.add(nums);
        }
        for(Integer nums:nums2){
            nums2s.add(nums);
        }
        ArrayList<Integer> one  = new ArrayList<>(); 
        ArrayList<Integer> two  = new ArrayList<>();
        for(Integer nums:nums1s){
            if(!nums2s.contains(nums)){
                one.add(nums);
            }
        }
        ans.add(one);
        for(Integer nums:nums2s){
            if(!nums1s.contains(nums)){
                two.add(nums);
            }
        }
        ans.add(two);
        return ans;

    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,3};
        int nums2[] = {1,1,2,2};
        System.out.println(findDifference(nums1, nums2));

    }
}

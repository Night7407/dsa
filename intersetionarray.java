import java.util.ArrayList;

public class intersetionarray {
    public static int[] intersection(int[] nums1, int[] nums2){
        int n =nums1.length;
        int m = nums2.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(nums1[i] == nums2[j]){
                    ans.add(nums1[i]);
                    nums2[j] = -1;
                    break;
                }
            }
        }
        
        int[] intersectArray = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            intersectArray[i] = ans.get(i);
        }
        

        return intersectArray;
    }
    public static void main(String[]args){
        int nums1[] = {4,9,5};
        int nums2[] = {9,4,9,8,4};
        int[] result = intersection(nums1, nums2);

        // Print the result
        for(int num : result){
            System.out.print(num + " ");}
        

    }
}

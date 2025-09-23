
import java.util.*;

public class leetcode1207 {
    public static  boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        HashMap<Integer,Integer> ans = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(Integer nums:arr){
            ans.put(nums,ans.getOrDefault(nums, 0)+1);
        }
        for(Integer nums:ans.values()){
            result.add(nums);
        }
        Collections.sort(result);
        for(int i = 0;i<result.size()-1;i++){
            if(Objects.equals(result.get(i), result.get(i+1))){
                return false;
            }
        }
        System.out.println(result);
        return true;
    }
    public static void main(String[]args){
        int arr[] = {26,2,16,16,5,5,26,2,5,20,20,5,2,20,2,2,20,2,16,20,16,17,16,2,16,20,26,16};
        System.out.println(uniqueOccurrences(arr));
    }
}

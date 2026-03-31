import java.util.*;

public class leetcode1200 {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int diff= Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            diff = Math.min(diff, arr[i + 1] - arr[i]);
        }
        List<List<Integer>> nas = new ArrayList<>();
        for(int i = 0;i<arr.length-1;i++){
            
            if(Math.abs(arr[i] - arr[i+1]) == diff){
                List<Integer> ans = new ArrayList<>();
                ans.add(arr[i]);
                ans.add(arr[i+1]);
                nas.add(ans);

            }

        }
        return nas;

        
    }

    public static void main(String[]args){
        int arr[] = {4,2,1,3};
        System.out.println(minimumAbsDifference(arr));
    }
}

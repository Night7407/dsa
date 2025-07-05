
import java.util.HashMap;

class leetcode1394{
    public static  int findLucky(int[] arr) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            ans.put(arr[i],ans.getOrDefault(arr[i], 0)+ 1);

        }
        int max = -1;
        for (int key : ans.keySet()) {
            if (key == ans.get(key)) {
                max = Math.max(max, key);
            }
        }
        return max;
    }
    public static void main(String[]args){
        int arr[] = {2,2,3,4};
        System.out.println(findLucky(arr));

    }
}
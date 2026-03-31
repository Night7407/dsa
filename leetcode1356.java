
import java.util.*;

public class leetcode1356 {
    public static int[] sortByBits(int[] arr) {
        
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            int count = Integer.bitCount(arr[i]);
            map.putIfAbsent(count, new ArrayList<>());
            map.get(count).add(arr[i]);
        }
        List<Integer> result = new ArrayList<>();
         for (Integer key : new TreeSet<>(map.keySet())) {
            result.addAll(map.get(key));
        }
        int[] ans = result.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    
        
    }
    public static void main(String[]args){
        int arr[] = {0,1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(sortByBits(arr)));
    }
}

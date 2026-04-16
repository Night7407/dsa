import java.util.*;

public class leetcode3488 {

    public static int circularDistance(int i, int j, int n) {
    int diff = Math.abs(i - j);
    return Math.min(diff, n - diff);
}
    public static List<Integer> solveQueries(int[] nums, int[] queries) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.putIfAbsent(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < queries.length; i++) {

            int qIndex = queries[i];
            List<Integer> list = map.get(nums[qIndex]);

            if (list.size() == 1) {
                ans.add(-1);
                continue;
            }

            int minDist = Integer.MAX_VALUE;

            for (int idx : list) {
                if (idx == qIndex) continue;

                int dist = circularDistance(qIndex, idx, nums.length);
                minDist = Math.min(minDist, dist);
            }

            ans.add(minDist);
        }

        return ans;
        
        
    }

    public static void main(String[] args) {
        int nums[] = {1,3,1,4,1,3,2};
        int queries[] = {0,3,5};
        System.out.println(solveQueries(nums, queries));
    }
}


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class leetcode1488 {
    public static int[]  avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        Map<Integer, Integer> lakeLastRain = new HashMap<>();
        TreeSet<Integer> dryDays = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) {
                dryDays.add(i);
                ans[i] = 1;
            } else {
                int lake = rains[i];
                ans[i] = -1;

                if (lakeLastRain.containsKey(lake)) {
                    
                    Integer dryDay = dryDays.higher(lakeLastRain.get(lake));
                    if (dryDay == null) {
                        
                        return new int[0];
                    }
                    ans[dryDay] = lake;
                    dryDays.remove(dryDay);
                }

                lakeLastRain.put(lake, i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int rains[] = {1,2,0,0,1,2};
        System.out.println(Arrays.toString(avoidFlood(rains)));
    }
}

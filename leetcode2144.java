import java.util.*;

public class leetcode2144 {
    public static int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum = 0;
        for(int i = cost.length;i>=0;i--){
            if((cost.length - i) % 3 == 0) {
                continue;
            }
            sum+=cost[i];
        }
        return sum;
        
    }

    public static void main(String[] args){
        int nums[] = {6,5,7,9,2,2};
        System.out.println(minimumCost(nums));
    }
}



import java.util.Arrays;
import java.util.HashSet;
import javax.lang.model.element.Element;

public class leetcode2561 {
    public static  long minCost(int[] basket1, int[] basket2) {
        Arrays.sort(basket1);
        Arrays.sort(basket2);

        HashSet<Integer> b1 = new HashSet<>();
        HashSet<Integer> b2 = new HashSet<>();

        for(Integer nums: basket1){
            b1.add(nums);
        }
        for(Integer nums: basket2){
            b2.add(nums);
        }
        long cost = 0;
        int minOfB1 = basket1[0];

        for(Integer element:b2){
            if(!b1.contains(element)){
                cost += Math.min(minOfB1, element);
            }

        }
        if()

        
    }
}

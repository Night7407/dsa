import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BiweeklyContest191 {
    public static int countSpecialIntegers(int[] nums) {
        int count = 0;
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
            
        }

        for(Map.Entry<Integer,List<Integer>> entry:map.entrySet()){
            List<Integer> list = entry.getValue();
            if (list.size() >= 3) {
                int difference = list.get(1) - list.get(0);
                boolean special = true;
                
                for (int j = 2; j < list.size(); j++) {
                    if (list.get(j) - list.get(j - 1) != difference) {
                        special = false;
                        break;
                    }
                }
                if (special) {
                    count++;
                }
            }
        }

        return count;
    }

    public static int minDays(int n) {
        int count = 0;
        int i = 1;
        int ans = 0;
        while(ans!=n){
            if (ans + i <= n) {
            ans += i;
            i++;
        } 
        else {
            i = 1;  
        }

        count++;    

        }
        
        return count;
    
    }

    public static void main(String[] args) {
        int nums[] = {1,8,1,5,1,5,8,5};
        int n = 2;
        System.out.println(minDays(n));

    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biweekly186 {
    public static int maximumWidth(int[] planks) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<planks.length;i++){
            map.put(planks[i], map.getOrDefault(planks[i], 0) + 1);
        }
        int highest = Integer.MIN_VALUE;
        int maxWidth = 0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>=highest && entry.getKey()>maxWidth){
                highest = entry.getValue();
                maxWidth = entry.getKey();
            }
        }
        
        int count = 0;
        List<Integer> used = new ArrayList<>();
        for(int i = 0;i<planks.length;i++){
            for(int j = i+1;j<planks.length;j++){
                int total = planks[i]+planks[j];
                if(total == maxWidth && (!used.contains(j) && !used.contains(i))){
                    used.add(i);
                    used.add(j);
                    count++;
                }
            }
        }

        return count+highest;
    }

    public static void main(String[] args) {
        int planks[] = {1,3,2,5,7,5,4,2,1};
        System.out.println(maximumWidth(planks));
    }
}


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class leetcode3843 {
    public static int firstUniqueFreq(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer num:nums){
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        List<Integer> values = new ArrayList<>(map.values());
        System.out.println(values);
        Collections.sort(values);
        int value = 0;
        for(int i =0;i<values.size()-1;i++){
            if(!Objects.equals(values.get(i), values.get(i+1))){
                value = values.get(i+1);
                break;
            }
        }
        for(Map.Entry<Integer,Integer> x:map.entrySet()){
            if(x.getValue() == value){
                return x.getKey();
            }
        }
        return -1;    
    }
    public static void main(String[]args){
        int nums[] = {10,10,20,20};
        System.out.println(firstUniqueFreq(nums));
    }
}

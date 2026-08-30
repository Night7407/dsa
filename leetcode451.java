import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class leetcode451 {
    public static String frequencySort(String s) {
        Map<Character,Integer> map = new TreeMap<>();
        for(Character ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> a.getValue() - b.getValue());

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entry:list){
            for (int i = 0; i < entry.getValue(); i++) {
                sb.append(entry.getKey());
            }
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args){
        String s = "Aabb";
        System.out.println(frequencySort(s));
    }
}

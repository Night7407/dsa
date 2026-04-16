
public class leetcode2515 {
    public static  int closestTarget(String[] words, String target, int startIndex) {
        int min_distance = Integer.MAX_VALUE;
        int n = words.length;

        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                int direct = Math.abs(i - startIndex);
                int circular = n - direct;
                int distance = Math.min(direct, circular);

                min_distance = Math.min(min_distance, distance);
            }
        }

        return min_distance == Integer.MAX_VALUE ? -1 : min_distance;

        // Map<String,List<Integer>> map = new HashMap<>(); 
        // for(int i = 0;i<words.length;i++){ 
        //     map.putIfAbsent(words[i], new ArrayList<>()); 
        //     map.get(words[i]).add(i); 
        // }

        // if(!map.containsKey(target)){
        //     return -1;
        // }
        // int min = Integer.MAX_VALUE;
        // for(Map.Entry<String,List<Integer>> entry : map.entrySet()){
        //     if(entry.getKey().equals(target)){
        //         List<Integer> list = entry.getValue();
                
        //         for(Integer num:list){
        //             min = Math.min(Math.abs(startIndex-num),min);
        //         }
        //     }
        
        // }
        // return min;
        
    }

    public static void main(String[] args) {
        String words[] = {"a","b","leetcode"};
        String target = "leetcode";
        int startIndex = 0;
        System.out.println(closestTarget(words, target, startIndex));
    }
}

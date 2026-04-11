import java.util.*;


class leetcode3741{
    public static int minimumDistance(int[] nums) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }

        Integer min = Integer.MAX_VALUE;
        boolean found = false;
        for(Map.Entry<Integer,List<Integer>> entry:map.entrySet()){
            List<Integer> ans = entry.getValue();
            if(ans.size()>=3){
                found = true;
                
                for(int i = 0;i<ans.size()-2;i++){
                    Integer current_min = Math.abs(ans.get(i)-ans.get(i+1)) + Math.abs(ans.get(i+1)-ans.get(i+2)) +Math.abs(ans.get(i+2)-ans.get(i));
                    min = Math.min(min,current_min);
                }
            }
            
        }
        return found ? min : -1;
    }

    public static void main(String[]args){
        int nums[] = {1};
        System.out.println(minimumDistance(nums));
    }
}
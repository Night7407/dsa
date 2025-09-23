import java.util.HashMap;

public class dividethearray{
    public static boolean divideArray(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            
            map.put(num,map.getOrDefault(num, 0)+1);
        }
        for (int count : map.values()) {
            if (count % 2 != 0) {
                return false;
            }
        }

        return true;

    }
    public static void main(String[] args) {
        int nums[] = {3,2,3,2,2,2};
        boolean x = divideArray(nums);
        System.out.println(x);
    }

}
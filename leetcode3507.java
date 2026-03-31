import java.util.ArrayList;
import java.util.List;

public class leetcode3507 {
    public static boolean isNonDecreasing(List<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }
    public static  int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) list.add(num);

        int count = 0;

        while (!isNonDecreasing(list)) {
            int minSum = Integer.MAX_VALUE;
            int idx = 0;

           
            for (int i = 0; i < list.size() - 1; i++) {
                int sum = list.get(i) + list.get(i + 1);
                if (sum < minSum) {
                    minSum = sum;
                    idx = i;
                }
            }

            
            list.remove(idx + 1);
            list.remove(idx);
            count++;
        }

        return count;
    }
    public static void main(String[]args){
        int nums[] = {5,2,3,1};
        System.out.println(minimumPairRemoval(nums));
    }
}

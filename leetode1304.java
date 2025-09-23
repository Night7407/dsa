import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class leetode1304 {
    public static int[] sumZero(int n) {
        Random rand = new Random();
        Set<Integer> set = new HashSet<>();
        while (set.size() < n) {
            int num = rand.nextInt(n - n + 1) + (-n); 
            set.add(num); 
        }


        int[] ans = set.stream().mapToInt(Integer::intValue).toArray();
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(sumZero(n)));   
    }
}


import java.util.Arrays;

public class leetcode3074 {
    public static int minimumBoxes(int[] apple, int[] capacity) {
        int sum = 0;
        for(int i = 0;i<apple.length;i++){
            sum +=apple[i];
        }
        int count = 0;
        Arrays.sort(capacity);
        for(int i = capacity.length-1;i>=0;i--){
            sum -= capacity[i];
            count++;
            if (sum <= 0) {
                return count;
            }
            

        }
        return count;
    }
    public static void main(String[]args){
        int apple[] = {1,3,2};
        int capacity[] = {4,3,1,5,2};
        System.out.println(minimumBoxes(apple, capacity));
    }
}

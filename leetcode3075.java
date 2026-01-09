import java.util.*;

public class leetcode3075 {
    public static long maximumHappinessSum(int[] happiness, int k) {
        long sum = 0;
        int count = 0;
        int n = k;
        Arrays.sort(happiness);
        for(int i = happiness.length-1;i>=0;i--){
            if(happiness[i] - count <=0){
                return sum;
            }
            sum +=happiness[i] - count;
            count++;
            n--;
            if(n == 0){
                return sum;
            }
        }
        return sum;
    }
    public static void main(String[]args){
        int happiness[] = {12,1,42};
        int k = 3;
        System.out.println(maximumHappinessSum(happiness, k));
    }
}

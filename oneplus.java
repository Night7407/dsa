
import java.util.Arrays;

public class oneplus {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        int ans[] = new int[n+1];
        for(int i = 0;i<n;i++){
            ans[i+1] = digits[i];
        }

        for (int i = n; i>=0; i--) {
            if (ans[i] < 9) {
                ans[i]++;
                return Arrays.copyOfRange(ans, i == 0 ? 0 : 1, n + 1);
            }
            ans[i] = 0;
        }

        // If all digits were 9
        ans[0] = 1;
        return ans;

    }
    public static void main(String[]args){
        int nums[] = {4,3,2,1};
        System.out.println(Arrays.toString(plusOne(nums)));
    }
}

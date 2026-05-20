
import java.util.Arrays;

public class leetcode2657 {

    public static int check(int a[] ,int b[] ,int k){
        int count = 0;
        for(int i = 0;i<=k;i++){
            for(int j = 0;j<=k;j++){
                if(a[i] == b[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int ans[] = new int[A.length];
        for(int i = 0;i<A.length;i++){
            ans[i] = check(A,B,i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int A[] = {2,3,1};
        int B[] = {3,1,2};
        System.out.println(Arrays.toString(findThePrefixCommonArray(A, B)));
    }
}

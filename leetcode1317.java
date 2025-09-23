import java.util.Arrays;

public class leetcode1317 {
    public static  int[] getNoZeroIntegers(int n) {
        for(int i = 1;i<n;i++){
            int k = n-i;
            if(!String.valueOf(i).contains("0") && !String.valueOf(k).contains("0")){
                return new int[]{i,k};
            }
            
        }
        return new int[0];
    }
    public static void main(String[]args){
        int n = 1010;
        System.out.println(Arrays.toString(getNoZeroIntegers(n)));
    }
}

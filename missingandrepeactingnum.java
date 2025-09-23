
import java.util.ArrayList;
import java.util.Arrays;

public class missingandrepeactingnum {
    public static void return_one_d_array(int[][] nums){
        int[] arr1 = Arrays.stream(nums)
                            .flatMapToInt(Arrays::stream)
                            .toArray();
    }
    public static int[] misssing_number_repeated_number(int [] arr1){
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int n = arr1.length;
        int sum1 = n*(n+1)/2;
        int sum2 = 0;
        for(int i = 0;i<arr1.length-1;i++){
            sum2 +=arr1[i];
            ans.add(sum1-sum2);
            for(int j = 1;j<arr1.length-1;j++){
                if(arr1[i] == arr1[j]){
                    ans.add(arr1[i]);
                }
            }
        }
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[]args){
        
    }
}

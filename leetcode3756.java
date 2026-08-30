import java.util.*;

public class leetcode3756{
    public static int[] sumAndMultiply(String s, int[][] queries) {
        List<Integer> ans =  new ArrayList<>();
        for(int i = 0;i<queries.length;i++){
            int left = queries[i][0];
            int right = queries[i][1];
            StringBuilder sb = new StringBuilder();
            int sum = 0;
            for(int j = left;j<=right;j++){
                if(s.charAt(j) != '0'){
                    sb.append(s.charAt(j));
                    sum += Character.getNumericValue(s.charAt(j));
                }
            }
            if (sb.length() != 0) {
                ans.add(sum*Integer.parseInt(sb.toString()));
            }
            

        }
        int result[] = new int[ans.size()];
        for(int k = 0;k<ans.size();k++){
            result[k] = ans.get(k);
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] queries = {{0,3},{1,1}};
        String s = "1000";
        System.out.println(Arrays.toString(sumAndMultiply(s, queries)));
    }
}
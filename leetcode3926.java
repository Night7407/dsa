
import java.util.Arrays;

class leetcode3926{
    public static int[] countWordOccurrences(String[] chunks, String[] queries) {
        int ans[] = new int[queries.length];
        StringBuilder sb = new StringBuilder();
        for(String chunk:chunks){
            sb.append(chunk);
        }
        for(int i = 0;i<queries.length;i++){
            int count = 0;
            
            for(int j = 0;j<sb.length();j++){
                {
                    count++;
                }
            }
            ans[i] = count;
        
        }
        
        System.out.println(sb.length());
        return ans;

    }
    public static void main(String[] args) {
        String[] chunks = {"a--b a-","-c"};
        String[] queries = {"a","b","c"};
        System.out.println(Arrays.toString(countWordOccurrences(chunks, queries)));
    }
}
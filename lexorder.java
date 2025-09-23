import java.util.ArrayList;
import java.util.List;

public class lexorder {
    public static List<Integer> lexicalOrder(int n){
        List<Integer> ans = new ArrayList<Integer>();
        for(int i = 1;i<=n;i++){
            ans.add(i);
        }
        ans.sort((a, b) -> String.valueOf(a).compareTo(String.valueOf(b)));
        return ans;
    }
    public static void main(String[] args) {
        int n = 13;
        System.out.println(lexicalOrder(n));
    }
}

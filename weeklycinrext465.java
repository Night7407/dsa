import java.util.ArrayList;
import java.util.Arrays;

public class weeklycinrext465 {
    public static int[] recoverOrder(int[] order, int[] friends) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i<order.length;i++){
            for(int j = 0;j<friends.length;j++){
                if(order[i] == friends[j]){
                    ans.add(order[i]);
                    break;
                }
            }
        }
        
        int result[] = new int[ans.size()];
        for(int k = 0;k<ans.size();k++){
            result[k] = ans.get(k);
        }
        return result;
    }
    public static void main(String[] args) {
        int order[] = {3,1,2,5,4};
        int friends[] ={1,3,4};
        System.out.println(Arrays.toString(recoverOrder(order, friends)));
        
    }
}

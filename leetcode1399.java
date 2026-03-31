import java.util.*;

public class leetcode1399 {
    public static int countLargestGroup(int n){
        if(n<=9) return n;
        // Set<Integer> check = new HashSet<>();
        // int count = 0;
        // for(int i = 1;i<=n;i++){
        //     if(check.contains(i%9)){
        //         count++;
        //     }
        //     check.add(i%9);
        // }
        // return count;
        Map<Integer,Integer> check = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i<n;i++){
            ans.add(i%9);
            
        }
        System.out.println(ans);
        for(Integer num:ans){
            check.put(num,check.getOrDefault(num,0)+1);
        }
        System.out.println(check);
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry:check.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
            }
        }
        int count = 0;
        for(Map.Entry<Integer,Integer> entry:check.entrySet()){
            if(entry.getValue() == max){
                count++;
            }
        }
        return count;

    }

    public static void main(String[]args){
        int n = 38;
        System.out.println(countLargestGroup(n));
    }
}

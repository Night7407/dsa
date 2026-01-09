import java.util.*;
public class leetcode2300 {
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0;i<spells.length;i++){
            int count = 0;
            for(int j= 0;j<potions.length;j++){
                if(spells[i] * potions[j] >= success){
                    count++;
                }
            }
            ans.add(count);
        }
        int result[] = new int[ans.size()];
        for(int i = 0;i<ans.size();i++){
            result[i] = ans.get(i);
        }
        return result;
    }
    public static void main(String[]args){
        int spells[] = {5,1,3};
        int potions[] = {1,2,3,4,5};
        long success = 7;
        System.out.println(Arrays.toString(successfulPairs(spells, potions, success)));
    }
}

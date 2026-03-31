
import java.util.ArrayList;



public class leetcode3477 {
    public static  int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(Integer nums:baskets){
            ans.add(nums);
        }
        int count = 0;
        for (int i = 0; i < fruits.length; i++) {
            boolean placed = false;

            for (int j = 0; j < ans.size(); j++) {
                if (fruits[i] <= ans.get(j)) {
                    count++;
                    ans.remove(j);
                    placed = true;
                    break;
                }
            }
        }

        return fruits.length-count;

    }
    public static void main(String[]args){
        int fruits[] = {1,4};
        int baskets[] = {8,1};
        System.out.println(numOfUnplacedFruits(fruits, baskets));
    }

}

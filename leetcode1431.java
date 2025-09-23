import java.util.ArrayList;
import java.util.List;

public class leetcode1431 {
    public static  List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int max_index = 0;
        for(int i = 0;i<candies.length;i++){
            if(candies[i] > max){
                max= candies[i];
                max_index = i;
            }
        }
        
        for(int i = 0;i<candies.length;i++){
            if(i == max_index) ans.add(true);
            else{
            if(candies[i]+extraCandies >= max) ans.add(true);
            else ans.add(false);
        }
        }
        return ans;
    }
    public static void main(String[]args){
        int candies[] ={4,2,1,1,2};
        int extraCandies = 1;
        System.out.println(kidsWithCandies(candies, extraCandies));
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class leetcode3842 {
    public static List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        List<Integer> check = new ArrayList<>();
        for(Integer bulb:bulbs){
            if(!check.contains(bulb)){
                check.add(bulb);
            }
            else{
                check.remove(bulb);
            }
        }
        Collections.sort(check);
        return check;
    }
    public static void main(String[]args){
        List<Integer> bulbs = new ArrayList<>(Arrays.asList(10,30,20,10));
        System.out.println(toggleLightBulbs(bulbs));
    }
}

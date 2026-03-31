import java.util.ArrayList;
import java.util.List;

public class leetcode1461 {
    public static List<String> generateBinary(int k) {
        List<String> result = new ArrayList<>();
        helper(k, "", result);
        return result;
    }

    private static void helper(int k, String current, List<String> result) {
        if (current.length() == k) {
            result.add(current);  
            return;
        }

        helper(k, current + "0", result);
        helper(k, current + "1", result);
    }
    public static boolean hasAllCodes(String s, int k) {
        List<String> check = new ArrayList<>(generateBinary(k));
        for(int i = 0;i<check.size();i++){
            if(!s.contains(check.get(i))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[]args){
        String s = "0110";
        int k = 1;
        System.out.println(hasAllCodes(s, k));
    }

}

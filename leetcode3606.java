import java.util.*;

public class leetcode3606 {
    // public static boolean isValid(String s) {
    //     return s.matches("[a-zA-Z0-9_]+");
    // }
    public static boolean isValidCode(String s) {
        return s != null && !s.isEmpty() && s.matches("[a-zA-Z0-9_]+");
    }
    public static List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        // ArrayList<String> ans = new ArrayList<>();
        // int n = code.length;
       
        // for(int i = 0;i<n;i++){
        //     if(!code[i].isEmpty() && !"invalid".equals(businessLine[i]) && isActive[i]){
        //         if(isValid(code[i])){
        //             ans.add(code[i]);
        //         }
        //     }
        // }
        // Collections.sort(ans);
        // return ans;
        Map<String, Integer> priority = new HashMap<>();
        priority.put("electronics", 0);
        priority.put("grocery", 1);
        priority.put("pharmacy", 2);
        priority.put("restaurant", 3);

        List<int[]> valid = new ArrayList<>();
        

        for (int i = 0; i < code.length; i++) {
            if (isActive[i]
                    && isValidCode(code[i])
                    && priority.containsKey(businessLine[i])) {

                valid.add(new int[]{priority.get(businessLine[i]), i});
            }
        }

        Collections.sort(valid, (a, b) -> {
            if (a[0] != b[0]) {
                return a[0] - b[0]; 
            }
            return code[a[1]].compareTo(code[b[1]]); 
        });

        
        List<String> ans = new ArrayList<>();
        for (int[] v : valid) {
            ans.add(code[v[1]]);
        }

        return ans;
    }
    public static void main(String[]args){
        String [] code = {"SAVE20","","PHARMA5","SAVE@20"};
        String[] businessLine = {"restaurant","grocery","pharmacy","restaurant"};
        boolean[] isActive = {true,true,true,true};
        System.out.println(validateCoupons(code,businessLine,isActive));

    }
}

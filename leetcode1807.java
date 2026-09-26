import java.util.*;

public class leetcode1807 {
    public static String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> map = new HashMap<>();

        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }

        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i<s.length()){
            Character ch = s.charAt(i);
            
            if(ch == '('){
                int end = s.indexOf(')',i);

                String toFind = s.substring(i+1, end);
                String value = map.getOrDefault(toFind, "?");

                sb.append(value);
                i = end+1;
            }
            else{
                sb.append(ch);
                i++;
            }

            
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "(name)is(age)yearsold";
        List<List<String>> knowledge = List.of(List.of("name", "bob"),List.of("age", "two"));
        System.out.println(evaluate(s,knowledge));
    }
}

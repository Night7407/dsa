
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mock1 {
    public static List<List<String>> comp(List<List<String>> logs){
         return logs.stream()
            .filter(x -> {
                String status = x.get(2);
                return "ERROR".equalsIgnoreCase(status) ||
                       "CRITICAL".equalsIgnoreCase(status);
            })
            .sorted((a, b) -> {
                String d1 = a.get(0);
                String d2 = b.get(0);

                String key1 = d1.substring(6) + d1.substring(3,5) + d1.substring(0,2);
                String key2 = d2.substring(6) + d2.substring(3,5) + d2.substring(0,2);

                int dateCmp = key1.compareTo(key2);
                if (dateCmp != 0) return dateCmp;

                return a.get(1).compareTo(b.get(1)); 
            })
            .toList();
    }

    public static void main(String[]args){
        List<List<String>> logs = new ArrayList<>();
        logs.add(Arrays.asList("12-01-2026","10:15","ERROR","Failed"));
        logs.add(Arrays.asList("12-01-2026","10:08","ERROR","Failed"));
        logs.add(Arrays.asList("12-01-2026","08:15","CRITICAl","Failed"));
        logs.add(Arrays.asList("11-01-2026","10:15","GOOD","Failed"));
        logs.add(Arrays.asList("02-01-2026","10:15","ERROR","Failed"));
        logs.add(Arrays.asList("02-01-2026","10:14","ERROR","Failed"));


        System.out.print(comp(logs));
    }
}

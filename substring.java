public class substring {
    
        public static void main(String[] args) {
            String str = "ABC"; // Change this for different inputs
            permute(str, "");
        }
    
        public static void permute(String str, String permutation) {
            if (str.isEmpty()) {
                System.out.println(permutation);
                return;
            }
    
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                String remaining = str.substring(0, i) + str.substring(i + 1);
                permute(remaining, permutation + ch);
            }
        }
    }

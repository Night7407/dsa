
public class leetcode1957 {
    public static String makeFancyString(String s) {
        StringBuilder result = new StringBuilder();

    
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int len = result.length();

    
            if (len < 2 || result.charAt(len - 1) != currentChar || result.charAt(len - 2) != currentChar) {
                result.append(currentChar);
            }
            
        }
        return result.toString();
    }


        
    public static void main(String[]args){
        String s = "leeetcode";
        System.out.println(makeFancyString(s));
    }
}

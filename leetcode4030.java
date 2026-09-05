public class leetcode4030 {

    public static boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            int x = s.charAt(i);
            System.out.println(x);
            sb.append("0");
            sb.append(Integer.toBinaryString(x));
            
        }

        System.out.println(sb);
        String original = sb.toString();
        String reverse = sb.reverse().toString();
        
        return original.equals(reverse);
    }
    public static void main(String[] args) {
        String s = "leet";
        System.out.println(isPalindromic(s));
    }
}
// 01101100011001010110010101110100
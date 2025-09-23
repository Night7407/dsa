public class leetcode345 {
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
    public static String reverseVowels(String s) {
        StringBuilder ans = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            ans.append(s.charAt(i));
        }
        int n = s.length();
        int i = 0,j = n-1;
        while(i<j){
            char charAti = ans.charAt(i);
            char charAtj = ans.charAt(j);

            if(!isVowel(charAti)) i++;
            else if(!isVowel(charAtj)) j--;
            else{
                ans.setCharAt(i, charAtj);
                ans.setCharAt(j, charAti);

                i++;
                j--;

            }

        }
        return ans.toString();
       }
        
    public static void main(String[] args) {
        String s = "IceCreAm";
        System.out.println(reverseVowels(s));
        
    }
}

public class leetcode3775 {
    public static int NumberofVowels(String s){
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'a'|| s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u'){
                count++;
            }
        }
        return count;
    }
    public static String ReserveString(String s){
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        return rev;
    }
    public static String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        String words[] = s.split("\\s+");
        int firstwordcount = NumberofVowels(words[0]);
        ans.append(words[0]).append(" ");
        for(int i = 1;i<words.length;i++){
            int currentcount = NumberofVowels(words[i]);
            if(firstwordcount == currentcount){
                String rev = ReserveString(words[i]);
                ans.append(rev);
                
            }
            else{
                ans.append(words[i]);
                
            }
            ans.append(" ");
        }
        return ans.toString().trim();
    }
    public static void main(String[]args){
        String s = "banana healthy";
        System.out.println(reverseWords(s));
    }
}

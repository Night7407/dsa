public class leetcode2785 {
    private static int vowelIndex;   
    private static char[] sortedVowels; 

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
    public static char  check(){
        return sortedVowels[vowelIndex++];  
    }
    public static String sortVowels(String s) {
        StringBuilder vowels = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (isVowel(c)) vowels.append(c);
        }

  
        char[] arr = vowels.toString().toCharArray();
        
        java.util.Arrays.sort(arr);
        sortedVowels = arr;
        vowelIndex = 0;

   
        StringBuilder ans = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                ans.append(check());
            } else {
                ans.append(c);
            }
        }

        return ans.toString();
    }
    public static void main(String[]args){
        String s = "lEetcOde";
        System.out.println(sortVowels(s));
    }

}

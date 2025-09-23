
import java.util.Collections;
import java.util.HashMap;

class leetcode3541{
     public static boolean isVowel(char c) {
        return "aeiou".indexOf(c) != -1;
    }
    public static  int maxFreqSum(String s) {
        HashMap<Character,Integer> vowels = new HashMap<>();
        HashMap<Character,Integer> consonants = new HashMap<>();
        for(char c:s.toCharArray()){
            if(isVowel(c)){
                vowels.put(c,vowels.getOrDefault(c,0)+1);
            }
            else{
                consonants.put(c,consonants.getOrDefault(c,0)+1);
            }
        }
        int maxVowel = vowels.isEmpty() ? 0 : Collections.max(vowels.values());
        int maxConsonant = consonants.isEmpty() ? 0 : Collections.max(consonants.values());
        return maxVowel + maxConsonant;

    }
    public static void main(String[]args){
        String s ="aeiaeia";
        System.out.println(maxFreqSum(s));
    }
}

import java.util.*;

public class leetcode3120 {
    public static int numberOfSpecialChars(String word) {
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(char letters:word.toCharArray()){
            set.add(letters);
        }
        for(char ch = 'a'; ch <= 'z'; ch++) {

            char upper = Character.toUpperCase(ch);

            if(set.contains(ch) && set.contains(upper)) {
                count++;
            }
        }

        return count;
        
    }

    public static void main(String[] args) {
        String words = "abBCab";
        System.out.println(numberOfSpecialChars(words));
    }
}

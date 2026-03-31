
import java.util.HashSet;
import java.util.Set;

public class leetcode804 {
    public static int uniqueMorseRepresentations(String[] words) {
        String code[] = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> total = new HashSet<>();
        for(String word:words){
            char[] ch = word.toCharArray();
            StringBuilder sb = new StringBuilder();
            for(Character c:ch){
                int index = c - 'a';
                sb.append(code[index]);
            }
            total.add(sb.toString());
        }
        return total.size();

        
    }

    public static void main(String[] args) {
        String words[] = {"a"};
        System.out.println(uniqueMorseRepresentations(words));
    }
}

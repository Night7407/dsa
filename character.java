import java.util.ArrayList;
import java.util.List;

public class character {
    public static List<Integer> findWordsContaining(String[] words, char x){
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0;i<words.length;i++){
            if (words[i].indexOf(x) != -1) {
            ans.add(i);
        }
    }
    return ans;
   }
   public static void main(String[] args) {
       String words[] = {"leet","code"};
       char x = 'e';
       System.out.println(findWordsContaining(words, x));
   }
}


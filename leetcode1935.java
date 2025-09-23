import java.util.HashSet;

public class leetcode1935 {
    public  static int canBeTypedWords(String text, String brokenLetters) {
        int count  = 0;
        HashSet<Character> broken = new HashSet<>();
        for(char nums:brokenLetters.toCharArray()){
            broken.add(nums);
        }
        String[] ans = text.split("\\s+");
        for(String w : ans){
            boolean can = true;
            for(char c:w.toCharArray()){
                if(broken.contains(c)){
                    can = false;
                    break;
                }
            }
            if(can) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String text = "hello world";
        String brokenLetter = "ad";
        System.out.println(canBeTypedWords(text, brokenLetter));   
    }
}

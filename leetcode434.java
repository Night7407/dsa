
import java.util.Arrays;

public class leetcode434 {
    public static int countSegments(String s) {
        String words[] = s.split("!@#$%^&*()_+-=',.:");
        System.out.println(Arrays.toString(words));
        int count = 0;
        for(String word:words){
            count++;
        }
        return count;
        
    }
    public static void main(String[]args){
        String s = "Hello, my name is John";
        System.out.println(countSegments(s));
    }
}

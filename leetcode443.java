
import java.util.ArrayList;

public class leetcode443 {
    public static int compress(char[] chars) {
        int count= 1;
        if(chars.length ==1) return 1;
        int i;
        for(i = 0;i<chars.length-1;i++){
            while(i<chars.length -1 && chars[i] == chars[i+1]){
                count++;
                i++;
            }
            ans.add(chars[i]);
            if(count>1){
                ans.add((char)count);
            }
            
        }
        return ans.size();
    }
    public static void main(String[]args){
        char[] chars = {'a','a','b','b','c','c','c'};
        System.out.println(compress(chars));

    }
}


import java.util.*;

public class leetcode1545 {
    public static String reverseInvert(String s){
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0 ;i<sb.length();i++){
            if(sb.charAt(i) == '0'){
                sb.setCharAt(i, '1');
            }
            else{
                sb.setCharAt(i, '0');
            }
        }
        sb.reverse();
        
        return sb.toString();

    }
    public static char findKthBit(int n, int k) {
        List<String> list = new ArrayList<>();
        list.add("0");

        for(int i = 2;i<=n;i++){
            String prev = list.get(i-2);
            StringBuilder sb = new StringBuilder();
            
            sb.append(prev);
            sb.append("1");
            sb.append(reverseInvert(prev));
            list.add(sb.toString());
        }
        return list.get(n-1).charAt(k - 1);
        
    }

    public static void main(String[]args){
        int n = 3;
        int k = 1;
        System.out.println(findKthBit(n, k));
    }
}


// 011100110110001
// 00110111001011100110110001

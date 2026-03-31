
import java.math.BigInteger;

public class leetcode1404 {
    public static int numSteps(String s) {
        // int n = Integer.parseInt(s,2);
        // int x = n;
        // int count=0;
        // while(x!=1){
        //     if(x%2!=0){
        //         x++;
        //         count++;
        //     }
        //     if(x%2 == 0){
        //         x = x/2;
        //         count++;
        //     }
        // }
        // return count;
        BigInteger n = new BigInteger(s, 2);
        BigInteger x = 



    }
    public static void main(String[]args){
        String s = "1101";
        System.out.print(numSteps(s));
    }
}



public class leetcode2276 {
    public  static String largestGoodInteger(String num) {
        for (int i = 9; i >= 0; i--) {
            String goodInteger = String.format("%d%d%d", i, i, i);
            if (num.contains(goodInteger)) {
                return goodInteger;
            }
        }

        
        return "";

    }
    public static void main(String[] args) {
        String num = "6777133339";
        System.out.println(largestGoodInteger(num));
        
    }
}

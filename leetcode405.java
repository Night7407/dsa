public class leetcode405 {
    public static String toHex(int num) {
        String s = Integer.toHexString(num);
        return s; 
        
    }
    public static void main(String[] args) {
        int num = 26;
        System.out.println(toHex(num));
    }
}

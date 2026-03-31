public class leetcode415 {
    public static String addStrings(String num1, String num2) {
        long x = Long.parseLong(num1);
        long y = Long.parseLong(num2);
        long sum = x+y;
        return String.valueOf(sum);
    }

    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";
        System.out.println(addStrings(num1, num2));
    }
}

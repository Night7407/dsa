class leetcode3461{
    public static boolean hasSameDigits(String s) {
        String ans = "";
        while(s.length()!= 2){
            ans = "";
            for (int i = 0; i < s.length() - 1; i++) {
                int a = s.charAt(i) - '0';
                int b = s.charAt(i + 1) - '0';
                ans += String.valueOf((a + b) % 10);
            }
            s = ans;
        }
        return s.charAt(0) == s.charAt(1);
    }
    public static void main(String[]args){
        String s = "34789";
        System.out.println(hasSameDigits(s));
    }
}
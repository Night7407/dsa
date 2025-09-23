public class leetcode3620 {
    public static boolean checkDivisibility(int n) {
        String s = Integer.toString(n);
        char[] ans = s.toCharArray();
        int mul = 1,sum = 0;
        for(int i =0;i<ans.length;i++){
            int digit = Character.getNumericValue(ans[i]);
            sum += digit;
            mul *=digit;
        }
        
        return n%(sum+mul) == 0;
    }
    public static void main(String[]args){
        int n = 99;
        System.out.println(checkDivisibility(n));
    }
}

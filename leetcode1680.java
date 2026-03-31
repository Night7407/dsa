class leetcode1680{
    public static int concatenatedBinary(int n) {
        int MOD = 1_000_000_007;
        long result = 0;
        for(int i =1;i<=n;i++){
            int length = Integer.toBinaryString(i).length();
            result = ((result << length) + i) % MOD;
        }
        
        
        return (int) result;
    }
    public static void main(String[]args){
        int n = 12;
        System.out.println(concatenatedBinary(n));
    }
}
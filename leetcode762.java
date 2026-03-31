public class leetcode762 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static int countPrimeSetBits(int left, int right){
        int count = 0;
        for(int i = left;i<=right;i++){
            int setBits = Integer.bitCount(i);

            if (isPrime(setBits)) {
                count++;
            }
        }

        return count;

        
    }
    public static void main(String[]args){
        int left = 6,right = 10;
        System.out.println(countPrimeSetBits(left, right));
    }
}

public class candies2 {
    public static long distributeCandies(int n, int limit){
        long count = 0;
        for (int i = 0; i <= limit; i++) {
            for (int j = 0; j <= limit; j++) {
                int k = n - i - j;
                if (k >= 0 && k <= limit) {
                    count++;
                }
            }
        }

        return count;
        
    }
    public static void main(String[]args){
        int n =10001,limit = 20001;
        System.out.println(distributeCandies(n, limit));
    }
}

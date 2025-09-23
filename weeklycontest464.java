
public class weeklycontest464 {
    public static int gcd_iterative(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static  int gcdOfOddEvenSums(int n){
        int evensum = 0;
        int oddsum = 0;
        int n1 = n*2;
        for(int i = 0;i<=n1;i++){
            if(i%2 != 0){
                oddsum+= i;

            }
            else{
                evensum+=i;
            }
        }
        return gcd_iterative(oddsum,evensum);

    }
    public static void main(String[]args){
        int n = 4;
        System.out.println(gcdOfOddEvenSums(n));
    }
}

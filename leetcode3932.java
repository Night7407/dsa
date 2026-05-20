public class leetcode3932 {
    public static int countKthRoots(int l, int r, int k) {
        int count = 0;
        for(int i = 0;i<=r;i++){
            if(Math.pow(i, k)>=l && Math.pow(i, k)<=r ){
                count++;

            }
        }
        return count;
    }
    public static void main(String[] args) {
        int l = 19;
        int r = 22;
        int k = 1;
        System.out.println(countKthRoots(l, r, k));

    }
}

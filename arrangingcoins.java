public class arrangingcoins{
    public static  int arrangeCoins(int n){
        if(n == 1) return 1;
        int low = 1,high = n;
        int count = 0;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(mid *(mid+1)/2 <= n){
                count= mid;
                low = mid+1;
                
            }
            else{
                high = mid-1;
            }
        }
        return count;
    }
    public static void main(String []args){
        int n = 3 ;
        System.out.println(arrangeCoins(n));
    }
}
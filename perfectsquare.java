public class perfectsquare {
    public static boolean isPerfectSquare(int num){
        if(num == 1)  return true; 
        int low = 1,high = num;
        while(low<=high){
            int mid = (low+high)/2;
            int val = (mid*mid);
            if(val <= num){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
            
        }
    
        if(num == high*high){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int num = 1;
        System.out.println(isPerfectSquare(num));
    }
}

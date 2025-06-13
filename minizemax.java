
import java.util.Arrays;


public class minizemax{
    public static boolean finmindiff(int nums[],int mid,int p){
        int count= 0;
        int i = 0;
        while(i<nums.length-1){
            if(nums[i+1]-nums[i] <=mid){
                count++;
                i+=2;
            }
            
            else{
                i++;
            }
        }
        return count >= p;

    }

    public  static int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int n = nums.length;
        int low = 0,high = Math.abs(nums[n-1]-nums[0]),ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(finmindiff(nums, mid, p)){
                ans = mid;
                high= mid-1;
            }
            else{
                low = mid+1;
                
            }
        }
        return ans;
        
        
        
        
    }
    public static void main(String[]args){
        int nums[] = {1,1,0,3};
        int  p =2;
        System.out.println(minimizeMax(nums, p));
    }
}
public class shippingdays {
    public static int findmax(int[]nums){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }
    public static int findsum(int []nums){
        int sum = 0;
        for(int i =0;i<nums.length;i++){
            sum += nums[i];
        }
        return sum;
    }
    public static int min_capacity(int[] nums,int days){
        int n = nums.length;
        int capacity = 0,time = 1;
        for(int i = 0;i<n;i++){
            if(nums[i] + capacity > days){
                time+=1;
                capacity = nums[i];
            }
            else{
                capacity+= nums[i];
            }
        }
        return time;  
    }

    public static int finalmin_capacity(int []nums,int days){
        int n = nums.length;
        int ans = 0;
        int low = findmax(nums),high = findsum(nums);
        while(low<=high){
            int mid = (low+high)/2;
            int numbersofdays = min_capacity(nums, mid);
            if(numbersofdays <= days){
                
                high = mid-1;
            }
            else{
                
                low = mid +1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int muns[] = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println(finalmin_capacity(muns, days));
    }
}


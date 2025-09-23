public class pseicalarray {
    // public static int findamx(int nums[]){
    //     int max = Integer.MIN_VALUE;
    //     for(int i = 0;i<nums.length;i++){
    //         if(nums[i] > max){
    //             max = nums[i];
    //         }
    //     }
    //     return max;
    // }
    public static int specialArray(int[] nums){
        int n = nums.length;
        int count = 0,i=0,j;
        while(i<=n){
            count = 0;
            for(j = 0;j<n;j++){
                if(nums[j] >= i){
                    count++;
                }
            }
            
            if(count == i){
                return i;
            }
            i++;
            
        }
        return -1;  
    }
    public static void main(String[]args){
        int nums[] = {3,6,7,7,0};
        
        System.out.println(specialArray(nums));

    } 
}


public class leetcode3737 {
    // public static boolean check(int nums[],int i,int j,int target){
    //     int count = 0;
    //     for(int k = i;k<=j;k++){
    //         if(nums[k] == target){
    //             count++;
    //         }
    //     }
    //     return count >(j-i+1)/2;
    // }
    public static int countMajoritySubarrays(int[] nums, int target) {
        // int count = 0;
        // int ispresent = 0;
        // for(int i = 0;i<nums.length;i++){
        //     if(nums[i] == target){
        //         ispresent++;
        //     }
        // }
        // if(ispresent == 0){
        //     return count ;
        // }
        // else{
        //     int l = 0,r = 0;
        //     while(l<nums.length){
        //         if(check(nums,l,r,target)){
        //             count++;
                    
        //         }
        //         if(r == nums.length-1){
        //             l++;
        //             r = l;
        //         }
        //         else{
        //             r++;
        //         }
                
        //     }
        // }
        // return count;

        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target){
                nums[i] = 1;
            }
            else{
                nums[i] = -1;
            }
        }

        for(int i = 0;i<nums.length;i++){
            int sum = 0;
            for(int j = i;j<nums.length;j++){
                sum+=nums[j];
                if(sum > 0){
                count++;
            }
            }

            

        }
        return count;
    }

    public static void main(String[]args){
        int nums[] = {1,1,1,1};
        int target = 1;
        System.out.println(countMajoritySubarrays(nums, target));
    }
}

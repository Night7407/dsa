public class maxnumber {
    public static  int maximumCount(int[] nums) {
        if(nums.length<=2){
            return 1;
        }
        int poscount = 0,negcount =0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > 0){
                poscount++;
                
            }
            else if(nums[i]<0){
                negcount++;
            }
        }
        return Math.max(poscount,negcount);
    }
    public static void main(String[] args){
        int[] nums = {-3,-2,-1,0,0,1,2};
        System.out.println(maximumCount(nums));
    }
}

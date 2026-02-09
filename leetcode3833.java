public class leetcode3833 {
    public static int average(int nums[],int i){
        double avg = 0;
        int count = 0;
        for(int j = i;j<=nums.length-1;j++){
            avg+=nums[j];
            count++;
        }
        return (int) (avg/count);
    }
    public static int dominantIndices(int[] nums) {
        int count = 0;
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i] > average(nums,i+1) ){
                count++;
            }
            
        }
        return count;
    }
    public static void main(String args[]){
        int nums[] = {57,89};
        System.out.println(dominantIndices(nums));
    }
}

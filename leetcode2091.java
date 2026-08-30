public class leetcode2091 {

    public static int getMaxIndex(int nums[]){
        int index = -1;
        int max = Integer.MIN_VALUE;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] > max){
                max = nums[i];
                index = i;
            }
        }
        return index;
    }
    public static int getMinIndex(int nums[]){
        int index = -1;
        int min = Integer.MAX_VALUE;

        for(int i = 0;i<nums.length;i++){
            if(nums[i] < min){
                min = nums[i];
                index = i;
            }
        }
        return index;
    }
    public static int minimumDeletions(int[] nums) {
        int maxIndex = getMaxIndex(nums);
        int minIndex = getMinIndex(nums);
        
        int left = Math.min(maxIndex, minIndex);
        int right = Math.max(maxIndex, minIndex);
        int deleteFromStart = right + 1;

        int deleteFromEnd = nums.length - left;

        int deleteFromBoth = (left + 1) + (nums.length - right);

        return Math.min(deleteFromStart,Math.min(deleteFromEnd, deleteFromBoth));
    
    
    }


    public static void main(String[] args) {
        int nums[] = {2,10,7,5,4,1,8,6};
        System.out.println(minimumDeletions(nums));

    }
} 

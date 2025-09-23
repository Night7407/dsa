public class numbers {
    public static int countPairs(int[] nums, int k){
        int count = 0;
        for(int i =0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] == nums[j]  && (i*j % k == 0)){
                    count++;
                }
            }
        }
        return count;
        
    }
    public static void main(String[]args){
        int nums[] = {1,2,3,4};
        int k = 2;
        System.err.println(countPairs(nums, k));
    }

    static Object stream() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

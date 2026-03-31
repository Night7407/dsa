public class leetcode1004 {
    public static int longestOnes(int[] nums, int k) {
        // int max_len = 0;
        // for(int i = 0;i<nums.length;i++){
        //     int count = 0;
        //     for(int j = i;j<nums.length;j++){
        //         if(nums[j] == 0){
        //             count++;
        //         }
        //         if(count == k && nums[j] !=0){
        //             max_len = Math.max(max_len,j-i+1);
        //         }
        //         if(count<=k && j== nums.length-1){
        //             max_len = Math.max(max_len,j-i+1);
        //         }

        //     }

        // }
        // return max_len;

        int left = 0,rigth = 0,zeros = 0,maxlen = 0;
        while(rigth<nums.length){
            if(nums[rigth] == 0){
                zeros++;
            }
            if(zeros>k){
                if(nums[left] == 0){
                    zeros--;
                }
                left++;
            }
            if(zeros<=k){
                maxlen = Math.max(maxlen,rigth-left+1);
            }
            rigth++;



        }
        return maxlen;
    }
    public static void main(String[]agrs){
        int nums[] ={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        System.out.println(longestOnes(nums, k));
    }
}

public class leetcode1390 {
    public static int sumFourDivisors(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            int count = 0;
            int currentsum = 0;
            // for(int j =1;j<=nums[i];j++){
            //     if(nums[i] % j == 0){
            //         count++;
            //         currentsum+=j;
            //     }
            // }
            // if(count == 4){
            //     sum += currentsum;
            // }
             for (int j = 1; j * j <= nums[i] && count <= 4; j++) { 
                if (nums[i] % j == 0) {
                    int d1 = j;
                    int d2 = nums[i] / j;

                    if (d1 == d2) {
                        count++;
                        currentsum += d1;
                    } else {
                        count += 2;
                        currentsum += d1 + d2;
                    }
                }
            }
            if(count == 4){
                sum += currentsum;
            }
        }
        return sum;
    }
    public static void main(String[]args){
        int nums[] = {1,2,3,4,5};
        System.out.println(sumFourDivisors(nums));
    }
}

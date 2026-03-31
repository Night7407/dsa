


// public class leetcode3824 {

//     public static int findSum(int nums[]){
//         int sum = 0;
//         for(int num:nums){
//             sum+=num;
//         }
//         return sum;
//     }

//     public static int findMax(int nums[]){
//         int max = Integer.MIN_VALUE;
//         for(Integer num:nums){
//             if(num > max){
//                 max = num;
//             }
//         }
//         return max;

//     }
//     public static int minimumK(int[] nums){
//         if(nums.length == 1 && nums[0] == 1) return 1;
//         int originalSum = findSum(nums);
//         int max = findMax(nums);
//         int k = 1;
//         int i = 0;
        
//         while(i<=max){
//             int count = 0;
//             int sum = originalSum;
//             System.out.println(sum);
//             for(int j = 0;j<=max;j++){
//                 count++;
//                 sum -=k;
//             }
//             if(sum<=0){
//                 if(count< k*k){
//                     return k;
//                 }

//             }
//             i++;
//             k++;

//         }
//         return 1;
//     }
//     public static void main(String[]args){
//         int nums[] = {7,3,5};
//         System.out.println(minimumK(nums));
//     }
// }

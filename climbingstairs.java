// public class climbingstairs{      // this code will give error as the time complexity is O(2^n)
//     public static int climbingstair(int n){
//         if(n<=2){
//             return n;
//         }
//         return climbingstair(n-1) + climbingstair(n-2);
//     }
//     public static void main(String []args){
//         System.out.println(climbingstair(2));
//     }
// }


// class Solution {  // thisapprouch will solve the time complexity problem of the the above question
//     public int climbStairs(int n) {
//         if (n == 0 || n == 1) {
//             return 1;
//         }

//         int[] dp = new int[n+1];
//         dp[0] = dp[1] = 1;
        
//         for (int i = 2; i <= n; i++) {
//             dp[i] = dp[i-1] + dp[i-2];
//         }
//         return dp[n];
//     }
// }



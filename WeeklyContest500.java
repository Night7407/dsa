import java.util.*;

class WeeklyContest500{

    // public static int reverseNumber(int n){
    //     int rev = 0;
    //     while(n!=0){
    //         int digit = n%10;
    //         rev = rev*10 + digit;
    //         n = n/10;
    //     }
    //     return rev;
    // }

    // public static boolean isPrime(int n){
    //     if (n <= 1) return false;
    //     if (n == 2) return true;
    //     if (n % 2 == 0) return false;

    //     for (int i = 3; i <= Math.sqrt(n); i += 2) {
    //         if (n % i == 0)
    //             return false;
    //         }
    //     return true;
    // }
    // public static int find_fixed_postion(List<Integer> ans){
    //     int count = 0;
    //     for(int i = 0;i<ans.size();i++){
    //         if(ans.get(i) == i){
    //             count++;
    //         }
    //     }
    //     return count;
    // }
    // public static int[] countOppositeParity(int[] nums) {
    //     int[] ans = new int[nums.length];
    //     for(int i = 0;i<nums.length;i++){
    //         int count = 0;
    //         for(int j = i;j<nums.length;j++){
    //             if(nums[i] %2 == 0){
    //                 if(nums[j] %2 !=0){
    //                     count++;
    //                 }
    //             }
    //             else{
    //                 if(nums[j] %2 == 0){
    //                     count++;
    //                 }
    //             }
    //         }
    //         ans[i] = count;
    //     }
    //     return ans;
    // }

    // public static int sumOfPrimesInRange(int n) {
    //     int l = Math.min(n,reverseNumber(n));
    //     int r = Math.max(n,reverseNumber(n));

    //     int sum = 0;
    //     for(int i = l;i<=r;i++){
    //         if(isPrime(i)){
    //             sum+=i;
    //         }
    //     }
    //     return sum;
        
    // }

    public static int maxFixedPoints(int[] nums) {
        // List<Integer> ans = new ArrayList<>();
        // for(int num:nums){
        //     ans.add(num);
        // }

        // int count = find_fixed_postion(ans);
        // for(int i = 0;i<ans.size();i++){
        //     int removed = ans.remove(i);
        //     count = Math.max(count,find_fixed_postion(ans));
        //     ans.add(i, removed);
        // }
        // return count;

        Map<Integer, Integer> ans = new HashMap<>();
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
        int diff = nums[i] - i;
        if (diff <= 0) { 
            ans.put(diff, ans.getOrDefault(diff, 0) + 1);
            max = Math.max(max, ans.get(diff));
        }
    }

    return max;
    }

    public static void main(String [] args){
        int nums[] = {1,3,0};
        System.out.println(maxFixedPoints(nums));
    }
}
import java.util.Arrays;
import java.util.Comparator;

class weeklyContest485{
    // public static int vowelConsonantScore(String s) {
    //     int vowels = 0;
    //     int consonNTS = 0;
    //     for(int i = 0;i<s.length();i++){
    //         if(s.charAt(i) >= 'a' && s.charAt(i)<='z'){
    //         if(s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u'){
    //             vowels++;
    //         }
    //         else{
    //             consonNTS++;
    //         }
    //     }
    //     }
    //     if(consonNTS>0){
    //         return vowels/consonNTS;
    //     }
    //     return 0;
        
    // }
    // public static void main(String[]args){
    //     String s ="au 123";
    //     System.out.println(vowelConsonantScore(s));
    // }

    public static  int maxCapacity(int[] costs, int[] capacity, int budget) {
        // int max_capacity = 0;
        // for(int i = 0;i<costs.length;i++){
        //     if(costs[i]<budget){
        //         max_capacity = Math.max(max_capacity,capacity[i]);
            
        //     }
        //     for(int j = i+1;j<capacity.length;j++){
        //         int current_cost = costs[i] + costs[j];
        //         if(current_cost<budget){
        //             max_capacity = Math.max(max_capacity,capacity[i]+capacity[j]);

        //         }
        //     }
        // }
        // return max_capacity;

        int n = costs.length;

        // Combine cost and capacity
        int[][] machines = new int[n][2];
        for (int i = 0; i < n; i++) {
            machines[i][0] = costs[i];
            machines[i][1] = capacity[i];
        }

        // Sort by cost
        Arrays.sort(machines, Comparator.comparingInt(a -> a[0]));

        // Prefix max of capacities
        int[] prefixMax = new int[n];
        prefixMax[0] = machines[0][1];
        for (int i = 1; i < n; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], machines[i][1]);
        }

        int ans = 0;

        for (int i = 0; i < n; i++) {

            // Single machine case
            if (machines[i][0] < budget) {
                ans = Math.max(ans, machines[i][1]);
            }

            // Pair case
            int remaining = budget - machines[i][0] - 1;
            if (remaining < 0) continue;

            int j = upperBound(machines, remaining);

            // Ensure distinct machines (no self-pairing)
            if (j >= 0 && j < i) {
                ans = Math.max(ans, machines[i][1] + prefixMax[j]);
            }
        }

        return ans;
    
    }

    private static int upperBound(int[][] machines, int target) {
        int l = 0, r = machines.length - 1, ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (machines[mid][0] <= target) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }
            
    public static void main(String[]args){
        int cost[] = {3,5,7,4};
        int capacity[] = {2,4,3,6};
        int budget = 7;
        System.out.println(maxCapacity(cost, capacity, budget));
    }
}
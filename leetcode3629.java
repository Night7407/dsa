import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class leetcode3629 {
    
    public static int minJumps(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return 0;
        }

        int maxVal = 0;
        for (int num : nums) {
            if (num > maxVal) {
                maxVal = num;
            }
        }

        
        int[] spf = new int[maxVal + 1];
        for (int i = 1; i <= maxVal; i++) {
            spf[i] = i;
        }
        for (int i = 2; i * i <= maxVal; i++) {
            if (spf[i] == i) {
                for (int j = i * i; j <= maxVal; j += i) {
                    if (spf[j] == j) { 
                        spf[j] = i;
                    }
                }
            }
        }

       
        Map<Integer, List<Integer>> primeFactorMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int val = nums[i];
            while (val > 1) {
                int p = spf[val];
                primeFactorMap.computeIfAbsent(p, k -> new ArrayList<>()).add(i);
                
                while (val % p == 0) {
                    val /= p;
                }
            }
        }

       

        Queue<Integer> queue = new LinkedList<>();
        int[] dist = new int[n];
        Arrays.fill(dist, -1);
        boolean[] visitedPrimes = new boolean[maxVal + 1];

        
        queue.offer(0);
        dist[0] = 0;

        while (!queue.isEmpty()) {
            int currIdx = queue.poll();

           
            if (currIdx == n - 1) {
                return dist[currIdx];
            }

            
            if (currIdx - 1 >= 0 && dist[currIdx - 1] == -1) {
                dist[currIdx - 1] = dist[currIdx] + 1;
                queue.offer(currIdx - 1);
            }
           
            if (currIdx + 1 < n && dist[currIdx + 1] == -1) {
                dist[currIdx + 1] = dist[currIdx] + 1;
                queue.offer(currIdx + 1);
            }

           
            int val = nums[currIdx];
            
            if (val > 1 && spf[val] == val) {
                int p = val;
                
                if (!visitedPrimes[p]) {
                    if (primeFactorMap.containsKey(p)) {
                        for (int teleportIdx : primeFactorMap.get(p)) {
                            if (dist[teleportIdx] == -1) {
                                dist[teleportIdx] = dist[currIdx] + 1;
                                queue.offer(teleportIdx);
                            }
                        }
                    }
                    visitedPrimes[p] = true;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {4,6,5,8};
        System.out.println(minJumps(nums));
        
    }
}

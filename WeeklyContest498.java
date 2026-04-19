
import java.util.Arrays;



class WeeklyContest498{
    // public static int findmax(int nums[],int i){
    //     int max = Integer.MIN_VALUE;
    //     for(int k = 0;k<=i;k++){
    //         if(nums[k]>max){
    //             max = nums[k];
    //         }
    //     }
    //     return max;
    // }
    // public static int findmin(int nums[],int i){
    //     int min = Integer.MAX_VALUE;
    //     for(int k = i;k<nums.length;k++){
    //         if(nums[k]<min){
    //             min = nums[k];
    //         }
    //     }
    //     return min;
    // }


    // public static int firstStableIndex(int[] nums, int k) {
        
    //     // int i = 0;
    //     // while(i<nums.length){
    //     //     int max = findmax(nums, i);
            
    //     //     int min = findmin(nums, i);
            
    //     //     if(max-min <=k){
    //     //         return i;
    //     //     }
    //     //     i++;
    //     // }
    //     // return -1;
    //     int n = nums.length;
    //     int[] suffixMin = new int[n];
    //     suffixMin[n - 1] = nums[n - 1];
    //     for (int i = n - 2; i >= 0; i--) {
    //         suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
    //     }
    //     int prefixMax = Integer.MIN_VALUE;
    //     for (int i = 0; i < n; i++) {
    //         prefixMax = Math.max(prefixMax, nums[i]);

    //         if (prefixMax - suffixMin[i] <= k) {
    //             return i;
    //         }
    //     }

    //     return -1;
    // }


     public static int[][] colorGrid(int n, int m, int[][] sources) {
        int[][] grid = new int[n][m];

        
        for (int[] s : sources) {
            grid[s[0]][s[1]] = s[2];
        }

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        boolean changed = true;

        while (changed) {
            changed = false;

            int[][] temp = new int[n][m];

            
            for (int i = 0; i < n; i++) {
                temp[i] = grid[i].clone();
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {

                    if (grid[i][j] != 0) { 
                        for (int[] d : dirs) {
                            int ni = i + d[0];
                            int nj = j + d[1];

                            if (ni < 0 || nj < 0 || ni >= n || nj >= m) continue;

                            if (temp[ni][nj] == 0) {
                                temp[ni][nj] = grid[i][j];
                                changed = true;
                            } else {
                                // conflict → take max
                                temp[ni][nj] = Math.max(temp[ni][nj], grid[i][j]);
                            }
                        }
                    }
                }
            }

            grid = temp; 
        }

        return grid;
    }


    public static void main(String[] args) {
        // int nums[] = {5,0,1,4};
        // int k = 3;
        // System.out.println(firstStableIndex(nums, k));

        int m = 3;
        int n = 3;
        int source[][] = {{0,0,1},{2,2,2}};
        System.out.println(Arrays.deepToString(colorGrid(n, m, source)));

    }
}
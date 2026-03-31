import java.util.Arrays;

public class BiweeklyContest174 {
    public static int[] bestTower(int[][] towers, int[] center, int radius) {
        int ans[] = {-1,-1};
        int qualilty_factor = -1;
        int n = towers.length;
        for(int i = 0;i<n;i++){
            int current_factor = towers[i][2];
            int x = towers[i][0];
            int y = towers[i][1];
            int distance = Math.abs(x-center[0]) + Math.abs(y-center[1]);

            if(distance<=radius){
            if(current_factor > qualilty_factor){
                qualilty_factor = current_factor;
                ans[0] = x;
                ans[1] = y;
            }
            else if(current_factor == qualilty_factor){
                if(x<ans[0] ||(x==ans[0] && y==ans[1])){
                    ans[0]= x;
                    ans[1]= y;
                }
            }
            
        }
    }
            
        return ans;
        // int bestX = 0, bestY = 0;
        // int maxQuality = 0;

        // for (int x = 0; x <= 50; x++) {
        //     for (int y = 0; y <= 50; y++) {

        //         int totalQuality = 0;

        //         for (int[] tower : towers) {
        //             int xi = tower[0];
        //             int yi = tower[1];
        //             int qi = tower[2];

        //             int dist = Math.abs(x - xi) + Math.abs(y - yi);

        //             if (dist <= radius) {
        //                 totalQuality += qi / (1 + dist);
        //             }
        //         }

        //         if (
        //             totalQuality >= maxQuality ||
        //             (totalQuality == maxQuality &&
        //              (x < bestX || (x == bestX && y < bestY)))
        //         ) {
        //             maxQuality = totalQuality;
        //             bestX = x;
        //             bestY = y;
        //         }
        //     }
        // }

        // return new int[]{bestX, bestY};

    }
    public static void main(String[]args){
        int tower[][] = {{1,2,5},{2,1,7},{3,1,9}};
        int center[] = {1,1};
        int radius = 2;
        System.out.println(Arrays.toString(bestTower(tower, center, radius)));
    }
}

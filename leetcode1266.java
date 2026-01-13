public class leetcode1266 {
    public static int minTimeToVisitAllPoints(int[][] points) {
        int ans = 0;
        for(int i =1;i<points.length;i++){
            ans += Math.max(Math.abs(points[i][0] - points[i-1][0]),Math.abs(points[i][1]-points[i-1][1]));
        }
        return ans;
    }
    public static void main(String[]args){
        int points[][] = {{3,2},{-2,2}};
        System.out.println(minTimeToVisitAllPoints(points));
    }
}

public class leetcode3857 {
    public static int minCost(int n) {
        int finalCost = 0;
        int othern = n;
        for(int i = 1;i<=n;i++){
            int cost = 0;
            for(int j = 1;j<=n;j++){
                if(i+j == othern){
                    cost = i*j;
                    othern = cost;
                    finalCost += cost;
                }
            }
        }
        return finalCost;
        
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(minCost(n));
    }
}

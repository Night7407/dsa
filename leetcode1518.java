public class leetcode1518 {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        int ne = numBottles;
        while(ne>=numExchange){
            int n = ne/numExchange;
            ans+=n;
            ne= ne % numExchange + n;
        }
        return ans;   
    }
    public static void main(String[] args) {
        int numBottles = 10;
        int numExchange = 3;
        System.out.println(numWaterBottles(numBottles, numExchange));
        
    }
}

public class leetcode3100 {
    public static int maxBottlesDrunk(int numBottles, int numExchange) {
       int ans = numBottles;      
        int empties = numBottles;  

        while (empties >= numExchange) {
           
            empties -= numExchange;  
            numExchange++;           
            ans++;                   
            empties++;               
        }

        return ans;
    }
    public static void main(String[] args) {
        int numBottles = 10;
        int numExchange = 3;
        System.out.println(maxBottlesDrunk(numBottles, numExchange));
        
    }
}

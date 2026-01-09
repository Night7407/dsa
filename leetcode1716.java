public class leetcode1716 {
    public static int totalMoney(int n) {
        int sum = 0;
        int weekStart = 1;
        
        while (n > 0) {
            int dayMoney = weekStart;
            for (int i = 0; i < 7 && n > 0; i++) {
                sum += dayMoney;
                dayMoney++;
                n--;
            }
            weekStart++;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(totalMoney(n));   
    }
}

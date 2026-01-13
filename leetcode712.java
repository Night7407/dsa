
public class leetcode712 {
    public static int minimumDeleteSum(String s1, String s2) {
        // int m = s1.length(), n = s2.length();
        // int[][] dp = new int[m + 1][n + 1];

       
        // for (int i = 1; i <= m; i++) {
        //     for (int j = 1; j <= n; j++) {
        //         if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
        //             dp[i][j] = 1 + dp[i - 1][j - 1];
        //         } else {
        //             dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
        //         }
        //     }
        // }

        
        // List<Character> deletedFromS1 = new ArrayList<>();
        // List<Character> deletedFromS2 = new ArrayList<>();

        // int i = m, j = n;
        // while (i > 0 && j > 0) {
        //     if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
        //         i--;
        //         j--;
        //     } else if (dp[i - 1][j] > dp[i][j - 1]) {
        //         deletedFromS1.add(s1.charAt(i - 1));
        //         i--;
        //     } else {
        //         deletedFromS2.add(s2.charAt(j - 1));
        //         j--;
        //     }
        // }

        
        // while (i > 0) {
        //     deletedFromS1.add(s1.charAt(i - 1));
        //     i--;
        // }
        // while (j > 0) {
        //     deletedFromS2.add(s2.charAt(j - 1));
        //     j--;
        // }

        // Collections.reverse(deletedFromS1);
        // Collections.reverse(deletedFromS2);

        // int total = 0;
        // for(Character x:deletedFromS1){
        //     total +=(int)x;
        // }
        // for(Character y:deletedFromS2){
        //     total+=(int)y;
        // }
        // return total;

        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        
        for (int i = 1; i <= m; i++) {
            dp[i][0] = dp[i - 1][0] + s1.charAt(i - 1);
        }
        for (int j = 1; j <= n; j++) {
            dp[0][j] = dp[0][j - 1] + s2.charAt(j - 1);
        }

        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(
                        s1.charAt(i - 1) + dp[i - 1][j],
                        s2.charAt(j - 1) + dp[i][j - 1]
                    );
                }
            }
        }

        return dp[m][n];
    }
    public static void main(String[]args){
        String s1 = "delete";
        String s2 = "leet";
        System.out.println(minimumDeleteSum(s1, s2));
    }
}

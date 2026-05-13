
public class BiweeklyContest182 {
    // public static int[] scoreValidator(String[] events) {
    //     int ans[] = new int[2];
    //     int score = 0;
    //     int counter = 0;
    //     for(int i = 0;i<events.length;i++){
    //         if(events[i].equals("W")){
    //             counter++;
    //         }
    //         else{
    //             if(events[i].equals("NB") || events[i].equals("WD")){
    //                 score++;
    //             }
    //             else{
    //                 score += Integer.parseInt(String.valueOf(events[i]));
    //             }
    //         }
    //         if(counter == 10){
    //             break;
    //         }
    //     }
    //     ans[0] = score;
    //     ans[1] = counter;
    //     return ans;
        
    // }

    public static int minFlips(String s) {
        int n = s.length();
        int totalOnes = 0;
        for (char c : s.toCharArray()) if (c == '1') totalOnes++;
    
        int ans = Math.min(totalOnes, n - totalOnes); 
    
        int onesLeft = 0, zerosLeft = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') onesLeft++;
            else zerosLeft++;
        
            int onesRight = totalOnes - onesLeft;
       
            int cost = zerosLeft + onesRight;
            ans = Math.min(ans, cost);
        }
    
        return ans;

        
    }
    public static void main(String[] args) {
        // String[] events = {"W","W","W","W","W","W","W","W","W","W","W"};
        // System.out.println(Arrays.toString(scoreValidator(events)));
        String s = "011";
        System.out.println(minFlips(s));
        
    }
}

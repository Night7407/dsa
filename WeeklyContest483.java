public class WeeklyContest483 {
     public static String largestEven(String s) {
        int lastTwo = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '2') {
                lastTwo = i;
                break;
            }
        }
        if (lastTwo == -1) {
            return "";
        }
        return s.substring(0, lastTwo + 1);
    }
    public static void main(String[]args){
        String s = "2221";
        System.out.println(largestEven(s));
    }
}

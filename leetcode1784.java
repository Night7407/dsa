public class leetcode1784{
    public static  boolean checkOnesSegment(String s) {
        if(s.contains("01")) return false;
        return true;
    }

    public static void main(String[] args) {
        String s ="10";
        System.out.println(checkOnesSegment(s));   
    }
}
class leetcode392{
    public static  boolean isSubsequence(String s, String t) {
        if(s.isEmpty() && t.isEmpty()) return false;
        if(s.isEmpty() && !t.isEmpty()) return true;
        int i = 0,j = 0,count = 0;
        while(j<t.length() && !s.isEmpty()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                count++;
            }
            j++;
        }
        return count == s.length();
    }
    public static void main(String[] args) {
        String s ="";
        String t ="ahbgdc";
        System.out.println(isSubsequence(s, t));
        
    }
}
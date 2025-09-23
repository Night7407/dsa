class leetcode3227{
     public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
    public static boolean doesAliceWin(String s) {
        int count = 0;
        for(int i =0;i<s.length();i++){
            if(isVowel(s.charAt(i))) count++;
        }
        System.out.println(count);
        return count > 0;

    }
    public static void main(String[]args){
        String s = "gkkzwzyidutyqpxoxmgfrjubiantnuhiapopckmsuicmtrnvlendicxnopdggjvhkcpiunlaggmhehb";
        System.out.println(doesAliceWin(s));
    }
}
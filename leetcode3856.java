public class leetcode3856 {
     public static boolean isVowels(Character c){
        return "aeiou".contains(c.toString());
    }
    public static String trimTrailingVowels(String s) {
        int index = -1;
        StringBuilder sb = new StringBuilder();
        for(int i = s.length()-1;i>=0;i--){
            if(!isVowels(s.charAt(i))){
                index = i;
                break;
            }
            System.out.println(index);
        }
        for(int j = 0;j<=index;j++){
            sb.append(s.charAt(j)); 
        }
        return sb.toString();      
    }
    public static void main(String[]args){
        String s = "aeiou";
        System.out.println(trimTrailingVowels(s));
    }
}

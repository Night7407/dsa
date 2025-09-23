
public class leetcode3019 {
    public static int countKeyChanges(String s) {
        int count = 0;
        for(int i =0;i<s.length()-1;i++){
            if (s.charAt(i) != Character.toUpperCase(s.charAt(i+1)) &&
            s.charAt(i) != Character.toLowerCase(s.charAt(i+1))) {
                count++;
            }
        } 
        return count;
    }
    public static void main(String[]args){
        String s = "AaAaaaAaaa";
        System.out.println(countKeyChanges(s));
    }
}

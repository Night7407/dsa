

public class leetcode1653 {
    public static int minimumDeletions(String s) {
        int bcount = 0;
        int count = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i) == 'b'){
                bcount++;
            }
            else{
                count = Math.min(count+1,bcount);
            }
        }
        return count;
        
    }
    public static void main(String[]args){
        String s = "aababbab";
        System.out.println(minimumDeletions(s));
    }
}

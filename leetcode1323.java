public class leetcode1323 {
     public static int maximum69Number (int num) {
        int max = num;
        char ans[] = String.valueOf(num).toCharArray();
        for(int i = 0;i<ans.length;i++){
            if(ans[i] == '6'){
                ans[i] ='9';
                break;
            }
        }
        String numString = new String(ans);
        int result = Integer.parseInt(numString);
        if(result > max || result == max) return result;
        return result;
    }
    public static void main(String[] args) {
        int num = 6966;
        System.out.println(maximum69Number(num));
    }
   
}

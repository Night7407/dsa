public class leetcode678 {
    public static boolean checkValidString(String s){
        int min = 0,max = 0;
        char []ans = s.toCharArray();
        int n = ans.length;
        for(int i = 0;i<n;i++){
            if(ans[i]== '('){
                min = min+1;
                max= max+1;
            }
            else if(ans[i] == ')'){
                min = min-1;
                max= max-1;
                

            }
            else{
                min = min-1;
                max= max+1;
            }
            if(min<0) min = 0;
            if(max<0) return false;
        }
        
        return min == 0;
    }
    public static void main(String[]args){
        String s = "(((((()*)(*)*))())())(()())())))((**)))))(()())()";
        System.out.println(checkValidString(s));
    }
}

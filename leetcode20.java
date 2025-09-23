import java.util.Stack;

class leetcode20{
    public static  boolean isValid(String s) {
        char[] result = s.toCharArray();
        Stack<Character> ans = new Stack<>();
        for(int i = 0;i<result.length;i++){
            if(result[i] =='('|| result[i]=='{'|| result[i] =='['){
                ans.push(result[i]);
                
            }
            else{
                if(ans.isEmpty()){
                    return false;
                }
                 char top = ans.pop();


                if(result[i] ==')'&& top !='('){
                    return false;
                }
                if(result[i] ==']' && top !='[' ){
                    return false;
                }
                if(result[i] =='}'&& top !='{'){
                    return false;
                }
            }
        }
        return ans.isEmpty();
    }
    public static void main(String[]args){
        String s = "((";
        System.out.println(isValid(s));
    }
}
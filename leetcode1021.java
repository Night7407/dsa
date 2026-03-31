

public class leetcode1021 {
    public static String removeOuterParentheses(String s) {
        // StringBuilder sb =  new StringBuilder();
        // Stack<Character> stack = new Stack<>();
        // for(Character ch:s.toCharArray()){
        //     if(ch == '('){
        //         if(!stack.isEmpty()){
        //             sb.append(ch);
        //         }
        //         stack.push(ch);
        //     }
            
        //     else{
        //         stack.pop();
        //         if (!stack.isEmpty()) {
        //             sb.append(ch);
        //         }
        //     }
            
        // }
        // return sb.toString();

        StringBuilder sb = new StringBuilder();
        int level = 0;
        for(char ch :s.toCharArray()){
            if(ch =='('){
                if(level>0){
                    sb.append(ch);
                }
                level++;
            }
            else if (ch ==')'){
                level--;
                if(level>0){
                    sb.append(ch);
                }

            }
        }
        return sb.toString();
    }

    public static void main(String []args){
        String s = "()()";
        System.out.println(removeOuterParentheses(s));
    }
}

public class leetcode8 {
    public static int myAtoi(String s) {
        StringBuilder sb = new StringBuilder();
        
        
        for(int i = 0;i<s.length();i++){
        
            if(s.charAt(i) == ' '){
                continue;
            }
            if((s.charAt(i) >='A' && s.charAt(i) <='Z') || (s.charAt(i) >='a' && s.charAt(i) <='z')){
                break;
            }
            if(s.charAt(i) == '-' || s.charAt(i) == '+' ){
                if(s.charAt(i-1) == ' '){
                    
                }
                else if(i != 0){
                    break;
                    
                }
            }

            sb.append(s.charAt(i));
        }
        

        if(sb.length() == 0){
            return 0;
        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        String s = "   -42";
        System.out.println(myAtoi(s));
    }
}

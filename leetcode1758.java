public class leetcode1758{
    public static int minOperations(String s) {
        int startWith0 = 0;
        int startWith1 = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(i % 2 == 0){
                if(c != '0') startWith0++;
                if(c != '1') startWith1++;
            }
            else{
                if(c != '1') startWith0++;
                if(c != '0') startWith1++;
            }
        }

        return Math.min(startWith0, startWith1);
        
    
    }
    public static void main(String[]args){
        String s = "10010100";
        System.out.println(minOperations(s));
    }
}
public class removezeros {
    public static long removeZeros(long n) {
        String x = String.valueOf(n);
        StringBuilder result = new StringBuilder();
        char [] ans = x.toCharArray();
        for(int i = 0;i<ans.length;i++){
            if(ans[i] != '0'){
                result.append(ans[i]);
            }
        }
        String str = result.toString();
        long num = Long.parseLong(str);
        return num;
        
    }
    public static void main(String[]args){
        long n =  1020030;
        System.out.println(removeZeros(n));
    }
}

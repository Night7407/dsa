

public class leetcode1009{
    public static int bitwiseComplement(int n) {
        String str = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == '1'){
                sb.append('0');
            }
            else{
                sb.append('1');
            }
        }
        int ans = Integer.parseInt(sb.toString(),2);
        return ans;
    }
    public static void main(String[] args) {
        int n = 999999999;
        System.out.println(bitwiseComplement(n));
    }
}
public class minusfrequency {
    public static int maxDifference(String s){
        int n = s.length();
        int count=0;
        int a1 =0,a2 =0;
        for(int i = 0;i<n-1;i++){
            while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                count++;
                i++;
            }
        }
        if(count % 2 == 0) a1 = count;
        else a2 = count;

        return Math.abs(a1-a2);

    }
    public static void main(String[]args){
        String s = "aaaaabbc";
        System.out.println(maxDifference(s));
    }
    
}

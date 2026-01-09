class leetcode166{
    public static String fractionToDecimal(int numerator, int denominator){
        if(denominator == 0) return "";
        if(numerator == 0) return "0";
        if(denominator ==1) return String.valueOf(numerator);
        long result = (long)numerator/denominator;
        return String.valueOf(result);
    }
    public static void main(String args[]){
        int numerator = 1;
        int denominator = 2;
        System.out.println(fractionToDecimal(numerator,denominator));
    }
}
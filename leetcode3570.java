class leetcode3570{
    public static int minimumFlips(int n) {
        String str = Integer.toBinaryString(n);
        StringBuilder s = new StringBuilder(str).reverse();
        s.toString();
        int i = 0,j = 0;
        int count = 0;
        while(j<s.length()){
            if (str.charAt(i) != s.charAt(j)){
                count++;
            }
            i++;
            j++;
        }
        return count;


    }

    public static void main(String []args){
        int n  = 10;
        System.out.println(minimumFlips(n));
    }
}

public class leetcode3895 {
    public static int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for(Integer num:nums){
            String s1 = String.valueOf(num);
            char ch[] = s1.toCharArray();
            for(int i = 0;i<ch.length;i++){
                if(Character.getNumericValue(ch[i]) == digit){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int nums[] = {12,54,32,22};
        int digits = 2;
        System.out.println(countDigitOccurrences(nums, digits));
    }
}

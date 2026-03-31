public class leetcode3751 {

    public static int isWave(int nums){
        String s = String.valueOf(nums);
        char[] ch = s.toCharArray();
        int count = 0;
        for(int i = 1;i<ch.length-1;i++) {
            if(ch[i] >ch[i+1] && ch[i]>ch[i-1]){
                count++;
            }
            if(ch[i] <ch[i-1] && ch[i]<ch[i+1]){
                count++;
            }
        }
        return count;

        // if (s.charAt(0) == '-') return false;
        // char[] ch = s.toCharArray();
        // if (ch.length < 3) return false; 
        // for (int i = 1; i < ch.length - 1; i++) {
        //     if (!((ch[i] > ch[i - 1] && ch[i] > ch[i + 1]) ||
        //       (ch[i] < ch[i - 1] && ch[i] < ch[i + 1]))) {
        //         return false;
        //     }
        // }
        // return true;


    }


    public static int totalWaviness(int num1, int num2) {
        int count = 0;
        for(int i = num1;i<=num2;i++){
            count+=isWave(i);
        }

        return count;  
    }
    public static void main(String[]args){
        int nums1 = 198;
        int nums2 = 202;
        System.out.println(totalWaviness(nums1, nums2));
    }
}

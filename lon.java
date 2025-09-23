public class lon {
    static public int longestSubarray(int[] arr, int k) {
      int len_max = 0;
      int sum = 0;
      boolean found = false;
      int prefix [] = new int [arr.length];
        for (int i = 0; i < prefix.length; i++) {
            sum +=arr[i];
            prefix[i]=sum;
        }
        System.out.println(prefix);
        for (int i = 0; i < prefix.length; i++) {
            int sub = 0;
            for (int j = i; j < prefix.length ; j++) {
                prefix[j]-=sub;
                if (prefix[j]==k && len_max<j-i){
                    found = true;
                    len_max = j-i+1;
                }
            }
            sub=prefix[i];
        }
        if (!found) return 0;
      return len_max;
    }
    public static void main(String[] args) {
        int arr [] ={23,90,62,91,60,82,-6,18,53,-42,23,90,62,91,60,82,-6,18,53,-42};
        System.out.println(longestSubarray(arr,60));
    }
}

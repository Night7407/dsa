
public class longest_subarray_sum_k {
    static public int longestSubarray(int[] arr, int k) {
      int len_max = 0;
      int sum = 0;
    //   int prefix [] = new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        if(sum == k) return arr.length;
        for(int i = 0;i<arr.length;i++){
            int current_sum = +arr[i];
            len_max++;
            if(current_sum  == k){
                break;
            }
        }
    //     for (int i = 0; i < arr.length-1; i++) {
    //         int sub = 0;
    //         for (int j = i+1; j < arr.length ; j++) {
    //             prefix[j]-=sub;
    //             if (prefix[j]==k && len_max<j-i){
    //                 found = true;
    //                 len_max = j-i+1;
    //             }
    //         }
    //         sub=prefix[i];
    //     }
    //     if (!found) return 0;
    //   return len_max;
    return len_max;

    }
    public static void main(String[] args) {
        int arr [] ={23,90,62,91,60,82,-6,18,53,-42,23,90,62,91,60,82,-6,18,53,-42};
        System.out.println(longestSubarray(arr,60));
    }
}



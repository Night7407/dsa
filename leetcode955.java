public class leetcode955 {
    public static int minDeletionSize(String[] strs) {
        int count = 0;
        int n = strs.length;
        int x = strs[0].length();
        for(int i = 0;i<x;i++){
            for(int j = 0;j<n-1;j++){
                // boolean issorted = false;
                // if(j == 0){
                //     if(strs[j].charAt(i)< strs[j+1].charAt(i)){
                //         issorted = true;
                //         return count;
                //     }
                // }

                if(strs[j].charAt(i)> strs[j+1].charAt(i) ){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[]args){
        String[] strs = {"abx","agz","bgc","bfc"};
        System.out.println(minDeletionSize(strs));
    }
}

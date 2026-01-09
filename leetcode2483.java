

public class leetcode2483 {
    public static int bestClosingTime(String customers) {
        int arr[] = new int[customers.length()+1];
        for(int i = 0;i<=customers.length();i++){
            int prefixcountN = 0;
            int suffixcountY = 0;
            for(int j = 0;j<i;j++){
                if(customers.charAt(j) == 'N'){
                    prefixcountN++;
                }
            }
            for(int k = i; k < customers.length(); k++){
                if(customers.charAt(k) == 'Y'){
                    suffixcountY++;

                }
            }
            arr[i] = prefixcountN+suffixcountY;
        }
        int minPenalty = Integer.MAX_VALUE;
        int bestIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minPenalty) {
                minPenalty = arr[i];
                bestIndex = i;
            }
        }

        return bestIndex;
    }
    public static void main(String[]args){
        String customers = "YYYY";
        System.out.println(bestClosingTime(customers));
    }
}

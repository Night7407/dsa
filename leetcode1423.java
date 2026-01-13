public class leetcode1423 {
    public static int maxScore(int[] cardPoints, int k) {
        int left_sum = 0,right_sum = 0,maxSum = 0;
        for(int i=0;i<k;i++){
            left_sum+=cardPoints[i];
            maxSum = Math.max(maxSum,left_sum);
        }
        int right_index = cardPoints.length-1;
        for(int j = k-1;j>=0;j--){
            left_sum -=cardPoints[j];
            right_sum+=cardPoints[right_index];
            maxSum = Math.max(maxSum,left_sum+right_sum);
            right_index--;

        }
        return maxSum;
        
    }
    public static void main(String[]args){
        int cardpoints[] ={1,2,3,4,5,6,1};
        int k = 3;
        System.out.println(maxScore(cardpoints, k));
    }
}

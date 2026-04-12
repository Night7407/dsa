
import java.util.Arrays;

class leetcode3898{
    public static int[] findDegrees(int[][] matrix){
        int ans[] = new int[matrix.length];
        for(int i = 0;i<matrix.length;i++){
            int count = 0;
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j] == 1){
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }

    public static void main(String[] args) {
        int matrix[][] = {{0,1,1},{1,0,1},{1,1,0}};
        System.out.println(Arrays.toString(findDegrees(matrix)));
    }
    
}
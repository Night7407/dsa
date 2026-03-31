public class leetcode1582 {
    public static boolean columnCheck(int mat[][],int x){
        int count1 = 0;
        for(int i = 0;i<mat.length;i++){
            if(mat[i][x] == 1){
                count1++;
            }
        }
        return count1==1;
    }
    public static boolean rowCheck(int mat[][],int x){
        int count1 = 0;
        for(int i = 0;i<mat[0].length;i++){
            if(mat[x][i] == 1){
                count1++;
            }
        }
        return count1==1;
    }
    public static int numSpecial(int[][] mat) {
        int count = 0;
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[0].length;j++){
                if(mat[i][j] == 1){
                    if(columnCheck(mat, j) && rowCheck(mat, i)){
                        count++;
                    }
                }
            }
        }
        return count;

    }

    public static void main(String[]args){
        int mat[][] = {{1,0,0},{0,1,0},{0,0,1}};
        System.out.println(numSpecial(mat));
    }
}

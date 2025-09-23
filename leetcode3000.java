public class leetcode3000 {
    public static int areaOfMaxDiagonal(int[][] dimensions) {
        int n = dimensions.length;
        int maxarea = 0;
        double maxdigonal = 0;
        for(int i = 0;i<n;i++){
            int currentarea = dimensions[i][0] * dimensions[i][1];
            double currentdigonal = Math.sqrt(dimensions[i][0] * dimensions[i][0]  + dimensions[i][1] * dimensions[i][1]);
            if(currentdigonal > maxdigonal) {
                maxarea = currentarea;
                maxdigonal = currentdigonal;
            }
            else if(currentdigonal == maxdigonal){
                maxarea = Math.max(maxarea,currentarea);

            }
            
        }
        return maxarea;

    }
    public static void main(String[] args) {
        int dimensions[][] = {{4,10},{4,9},{9,3},{10,8}};
        System.out.println(areaOfMaxDiagonal(dimensions));
    }
}

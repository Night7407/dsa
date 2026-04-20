public class leetcode2078 {
    public static int maxDistance(int[] colors) {
        
        int max_distance = 0;
        for(int i =0;i<colors.length;i++){
            for(int j =0;j<colors.length;j++){
                if(colors[i]!=colors[j]){
                    max_distance = Math.max(max_distance,Math.abs(i-j));
                }
            }
            
        }
        return max_distance;
    }

    public static void main(String[] args) {
        int colours[] = {1,1,1,6,1,1,1};
        System.out.println(maxDistance(colours));
    }
}

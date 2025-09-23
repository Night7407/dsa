

public class leetcode610 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n){
        if(n == 0) return true;
        int m = flowerbed.length;
        int count = 0;
        for(int i = 0;i<m;i++){
            if(flowerbed[i] == 0){
                boolean emptyLeft = (i == 0) || (flowerbed[i - 1] == 0);
                boolean emptyRight = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);
                if(emptyLeft && emptyRight){
                    flowerbed[i] = 1;
                    count++;
                }
                if(count >= n) return true;
                
            }
        }
        
        return count >= n;

    }
    public static void main(String[]args){
        int flowerbed[] = {1,0,0,0,1,0,1};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}

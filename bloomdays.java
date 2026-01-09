public class bloomdays {
    public static int findmin(int[] bloomday){
        int min = Integer.MAX_VALUE;
        for(int i = 0;i<bloomday.length;i++){
            if(bloomday[i] < min){
                min=  bloomday[i];
            }
        }
        return min;
    }
    public static int findmax(int[] bloomday){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<bloomday.length;i++){
            if(bloomday[i] > max){
                max = bloomday[i];
            }
        }
        return max;
    }

    public static boolean canmakebouq(int [] bloomday,int m,int k,int days){
        int bouquets = 0, flowers = 0;
        for(int i = 0;i<bloomday.length;i++){
            if(bloomday[i]<=days){
                flowers++;
                
            }
            else{
                bouquets +=(flowers/k);
                flowers = 0;
            }
            
        }
        bouquets +=(flowers/k);
        return bouquets >=m;
    }
    public static int min_bloomday(int[] bloomday,int m,int k){
        int n = bloomday.length;
        if(m*k>n) return -1;
        int low = findmin(bloomday),high = findmax(bloomday);
        int answer = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(canmakebouq(bloomday, m, k, mid)){
                answer = mid;
                high = mid -1;
                
            }
            else{
                // answer = mid;
                low = mid + 1;

            }
        }
        return answer ;
        
        
        
    }
    public static void main(String[] args) {
        int bloomday[] = {7,7,7,7,13,11,12,7};
        System.out.println(min_bloomday(bloomday, 2, 3));
        
    }
    
}

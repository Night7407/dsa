public class candyhard {
    
    public static  int candy(int[] ratings){
        int n = ratings.length;
        int count = 0;
        if(ratings[0] > ratings[1]){
            count = ratings[0] +1;
        }
        if(ratings[n-1]>ratings[n-2]) count = ratings[n-1] +1;
        // for(int i = 1;i<n-1;i++){
        //     if(ratings[i]>ratings[i+1] && ratings[i]>ratings[i-1]){
        //         count = ratings[i]+1;
        //     }
            
        // }
        return count;


    }
    public static void main(String[] args) {
        int ratings[] = {1,0,2};
        System.out.println(candy(ratings));
    }
}


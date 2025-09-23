public class shipment {
    public static boolean isbalaced(int weight[],int start,int ending){
        if (start >= ending) {
            return false;
        }
        int max = Integer.MIN_VALUE;
        for(int i = start;i<=ending;i++){
            if(weight[i]> max){
                max = weight[i];
            }
        }
        return max> weight[ending];

    }
    public static int maxBalancedShipments(int[] weight) {
        if (weight == null || weight.length < 2) {
            return 0;
        }
        int count = 0;
        if(weight.length == 1) return 0;
        int startindex = 0;
        for(int i = 1;i<weight.length;i++){
               if( isbalaced(weight, startindex, i)){
                count++;
                startindex = i+1;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        int weigth[] = {4,4};
        System.out.println(maxBalancedShipments(weigth));
        
    }
}

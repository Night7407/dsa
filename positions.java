public class positions {
    public static int minCostToMoveChips(int[] position) {
        if(position.length <= 2){
            return 1;
        }
        int sum = 0;
        for(int i = 1;i<position.length;i++){
            if(i%2 == 0){
                sum +=2;
            }
            else{
                sum -=1;
            }
        }
        return sum;
    }

    public static void main(String[]args){
        int position[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30};
        System.out.printlnArrayys.toString((minCostToMoveChips(position)));
    }
}

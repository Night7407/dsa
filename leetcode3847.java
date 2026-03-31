public class leetcode3847 {
    public static int scoreDifference(int[] nums) {
        int player1 = 0;
        boolean players1 = true;
        int player2 = 0;
        boolean players2 = false;
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            
            if(nums[i]%2!=0){
                
                if(count%2 == 0){
                players1 = false;
                players2 = true;
                }
                else{
                    players1 = true;
                    players2 = false;


                }
    
                count++;
        
            }
            if(i%6 == 5){
                if(count%2 == 0){
                players1 = false;
                players2 = true;
                }
                else{
                    players1 = true;
                    players2 = false;


                }
    
                count++;
            }
            if(players1){
                player1+=nums[i];
            }
            if(players2){
                player2+=nums[i];
            }

        }
        return player1-player2;


    }
    


    public static void main(String[]args){  
        int nums[] = {1,2,3};
        System.out.println(scoreDifference(nums));
    }
}

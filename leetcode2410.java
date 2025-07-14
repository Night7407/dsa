
import java.util.Arrays;

public class leetcode2410 {
    public static int matchPlayersAndTrainers(int[] players, int[] trainers){
        Arrays.sort(players);
        Arrays.sort(trainers);
        int n = players.length;
        int m = trainers.length;
        int i = 0,j = 0,count = 0;
        while(i<n && j<m){
            if(players[i] <= trainers[j]){
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
    public static void main(String[] args){
        int players[] = {2,3,1,1,3};
        int trainers[] = {2,4,2};
        System.err.println(matchPlayersAndTrainers(players, trainers));
    }

}

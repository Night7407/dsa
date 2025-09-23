import java.util.ArrayList;

public class twosum2 {
     public static int[] twoSum(int[] numbers, int target) {
        ArrayList<Integer> ans  = new ArrayList<>();

        int n = numbers.length-1;
        for(int i = 0;i<=n;i++){
            for(int j = i+1;j<=n;j++){
                if(numbers[i] + numbers[j] == target){
                ans.add(i+1);
                ans.add(j+1);
                break;
            }
        }
            
            if (!ans.isEmpty()) break;
        }
        int[] intersectArray = new int[ans.size()];
        for(int k = 0; k < ans.size(); k++){
            intersectArray[k] = ans.get(k);
        }

        return intersectArray;
    }
    public static void main(String[] args) {
        int numbers[] = {2,7,11,15};
        int target = 9;
        int result[] = twoSum(numbers, target);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
}

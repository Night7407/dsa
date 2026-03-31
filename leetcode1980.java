
import java.util.Arrays;
import java.util.List;

public class leetcode1980 {
    public static String findDifferentBinaryString(String[] nums) {
        List<String> list = Arrays.asList(nums);
        int i = 0;
        boolean thisIsTheOne = false;
        StringBuilder sb = new StringBuilder();
        while(true){
            
            String str = Integer.toBinaryString(i);
            if(str.length() == nums.length && !list.contains(str)){
                thisIsTheOne = true;    
            }
            if(thisIsTheOne){
                sb.append(str);
                break;
            }
            i++;
        }
        return sb.toString();
        
    }
    public static void main(String []args){
        String nums[] = {"10","11"};
        System.out.println(findDifferentBinaryString(nums));
    }
}

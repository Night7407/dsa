public class leetcode2154{
    public static int findFinalValue(int[] nums, int original) {
        boolean found = true;
        while(found){
            found = false;
            for(int num:nums){
                if(num  == original){
                    original = original * 2;
                    found = true;
                    break;
                }
            }
        }
        return original;
        
    }
    public static void main(String[]args){
        int nums[] = {5,3,6,1,12};
        int original = 3;
        System.out.println(findFinalValue(nums, original));
    }
}
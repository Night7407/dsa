public class leetcode3147 {
    public static int maximumEnergy(int[] energy, int k) {
        int max = Integer.MIN_VALUE;
        int ans[] = new int[energy.length];
        for(int i = energy.length-1;i>=0;i--){
            if(i+k <energy.length){
                ans[i] = energy[i] +ans[i+k];
            }
            else{
                ans[i] = energy[i];
            }
            max = Math.max(max,ans[i]);
        }
        return max;
        
    }
    public static void main(String[]args){
        int energy[] = {5,2,-10,-5,1};
        int k = 3;
        System.out.println(maximumEnergy(energy, k));
    }
}

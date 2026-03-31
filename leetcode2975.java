
import java.util.*;

class leetcode2975{
    public static int maxGap(List<Integer> list) {
        Collections.sort(list);

        int maxDiff = 0;
        for (int i = 1; i < list.size(); i++) {
            maxDiff = Math.max(maxDiff, list.get(i) - list.get(i - 1));
        }
        return maxDiff;
    }
    public static int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        
        List<Integer> hfence = new ArrayList<>();
        List<Integer> vfrnce = new ArrayList<>();

        for(int i = 0;i<hFences.length;i++){
            hfence.add(hFences[i]);
        }
        hfence.add(1);
        hfence.add(m);
        for(int j = 0;j<vFences.length;j++){
            vfrnce.add(vFences[j]);
        }
        vfrnce.add(1);
        vfrnce.add(n);

        int side1 = maxGap(vfrnce);
        System.out.println(side1);
        int side2 = maxGap(hfence);
        System.out.println(side2);

        if(side1 == side2){
            return side1*side2;
        }

        return -1;

        
    }
    public static void main(String[]args){
        int m  = 8;
        int n  = 5;
        int hFences[] = {5,4};
        int vFences[] = {4};
        System.out.println(maximizeSquareArea(m, n, hFences, vFences));
    }
}
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode57 {
    public static  int[][] insert(int[][] intervals, int[] newInterval){
        int n = intervals.length;
        
        System.out.println(n);
        List<int[]> resultList = new ArrayList<>();
        int i = 0;
        while(i<n && intervals[i][1]<newInterval[0]){
            resultList.add(intervals[i]);
            i++;
        }
        while(i<n && intervals[i][0] <  newInterval[i]){
            newInterval[0] = Math.min(newInterval[0],intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        resultList.add(newInterval);
        while(i<n){
            resultList.add(intervals[i]);
            i++;
        }
        return resultList.toArray(new int[resultList.size()][]);

    }
    public static void main(String[] args) {
        int[][] intervals = {{1,3},{6,9}};
        int[] newInterval = {5,6};
        System.out.println("Original Intervals: " + Arrays.deepToString(intervals));
        System.out.println("New Interval: " + Arrays.toString(newInterval));

        int[][] result = insert(intervals, newInterval);

        
        System.out.println("Merged Result: " + Arrays.deepToString(result)); 

        
    }
}



public class Nmeetinginroom {
    public static int meetingcount(int[] start,int[] end){
        int n = start.length;
        int m = end.length;
        int i = 0,j = 0,count =1;
        while(i<n && j<m){
            if(start[i] < end[j] && start[i+1] > end[j]){
                count++;
                i++;
            }
            j++;
        }
        return count;
    }
    public static void main(String[] args) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
        System.out.println(meetingcount(start, end));
    }
}

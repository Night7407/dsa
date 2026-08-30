public class BiweeklyContest189 {
    public static int elevatorRequests(int n, int[] requests) {
        int count = 0;
        for(int i = 0;i<requests.length;i++){
            if(i == 0){
                count+=requests[0];
            }
            else{
            count += Math.abs(requests[i]-requests[i-1]);
        }
        }
        return count;
    }

    public static void main(String[] args){
        int n = 5;
        int requests[] = {2,1,4,3};
        System.out.println(elevatorRequests(n, requests));
    }
}

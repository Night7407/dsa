public class countlongest {
    public static int countLargestGroup(int n){
        if(n<10){
            return 1;
        }
        
        if(n % 10 == 0){
            return n/10;
        }
        return (n%10) + 1;
    }
    public static void main(String[] args) {
        int x = countLargestGroup(46);
        System.out.println(x);
    }
}

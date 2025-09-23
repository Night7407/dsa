public class colored_cell{
    public static long coloredCells(int n){
        if(n == 1){
            return 1;
        }
        return 1+ 4L *n*(n-1)/2;
    }
    public static void main(String[] args) {
        System.out.println(coloredCells(69675));
    } 
}
import java.util.Arrays;

public class leetcode3899 {
    static double round5(double value) {
    return Math.round(value * 100000.0) / 100000.0;


}
    public static double[] internalAngles(int[] sides) {
        Arrays.sort(sides);

        int a = sides[0];
        int b = sides[1];
        int c = sides[2];


        if (a + b <= c) {
            return new double[0];
        }

        double[] ans = new double[3];

        ans[0] = round5(Math.toDegrees(Math.acos((b*b + c*c - a*a) / (2.0*b*c))));
        ans[1] = round5(Math.toDegrees(Math.acos((a*a + c*c - b*b) / (2.0*a*c))));
        ans[2] = round5(Math.toDegrees(Math.acos((a*a + b*b - c*c) / (2.0*a*b))));

        return ans;
        
    }

    public static void main(String[] args) {
        int sides[] = {3,4,5};
        System.out.println(Arrays.toString(internalAngles(sides)));
    }
}
